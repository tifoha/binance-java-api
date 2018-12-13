package com.binance.api.client.impl;

import com.binance.api.client.BinanceApiCallback;
import com.binance.api.client.exception.BinanceApiException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;

import java.io.IOException;

/**
 * Binance API WebSocket listener.
 */
public class BinanceApiWebSocketListener<T> extends WebSocketListener {
    private static final ObjectMapper MAPPER = new ObjectMapper();

  private BinanceApiCallback<T> callback;

  private Class<T> eventClass;

  private TypeReference<T> eventTypeReference;

  private boolean closing = false;

  public BinanceApiWebSocketListener(BinanceApiCallback<T> callback, Class<T> eventClass) {
    this.callback = callback;
    this.eventClass = eventClass;
  }

  public BinanceApiWebSocketListener(BinanceApiCallback<T> callback) {
    this.callback = callback;
    this.eventTypeReference = new TypeReference<T>() {};
  }

  @Override
  public void onMessage(WebSocket webSocket, String text) {
    try {
        T event;
      if (eventClass == null) {
          event = MAPPER.readValue(text, eventTypeReference);
      } else {
          event = MAPPER.readValue(text, eventClass);
      }
      callback.onResponse(event);
    } catch (IOException e) {
      throw new BinanceApiException(e);
    }
  }

  @Override
  public void onClosing(final WebSocket webSocket, final int code, final String reason) {
    closing = true;
  }

  @Override
  public void onFailure(WebSocket webSocket, Throwable t, Response response) {
    if (!closing) {
      callback.onFailure(t);
    }
  }

    @Override
    public void onClosed(WebSocket webSocket, int code, String reason) {
        super.onClosed(webSocket, code, reason);
    }
}