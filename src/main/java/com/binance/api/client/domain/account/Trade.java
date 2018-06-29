package com.binance.api.client.domain.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * Represents an executed trade.
 */
public class Trade {

  /**
   * Trade id.
   */
  private Long id;

  /**
   * Price.
   */
  private BigDecimal price;

  /**
   * Quantity.
   */
  private BigDecimal qty;

  /**
   * Commission.
   */
  private BigDecimal commission;

  /**
   * Asset on which commission is taken
   */
  private String commissionAsset;

  /**
   * Trade execution time.
   */
  private long time;

  @JsonProperty("isBuyer")
  private boolean buyer;

  @JsonProperty("isMaker")
  private boolean maker;

  @JsonProperty("isBestMatch")
  private boolean bestMatch;

  private String orderId;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public BigDecimal getQty() {
    return qty;
  }

  public void setQty(BigDecimal qty) {
    this.qty = qty;
  }

  public BigDecimal getCommission() {
    return commission;
  }

  public void setCommission(BigDecimal commission) {
    this.commission = commission;
  }

  public String getCommissionAsset() {
    return commissionAsset;
  }

  public void setCommissionAsset(String commissionAsset) {
    this.commissionAsset = commissionAsset;
  }

  public long getTime() {
    return time;
  }

  public void setTime(long time) {
    this.time = time;
  }

  public boolean isBuyer() {
    return buyer;
  }

  public void setBuyer(boolean buyer) {
    this.buyer = buyer;
  }

  public boolean isMaker() {
    return maker;
  }

  public void setMaker(boolean maker) {
    this.maker = maker;
  }

  public boolean isBestMatch() {
    return bestMatch;
  }

  public void setBestMatch(boolean bestMatch) {
    this.bestMatch = bestMatch;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("id", id)
        .append("price", price)
        .append("qty", qty)
        .append("commission", commission)
        .append("commissionAsset", commissionAsset)
        .append("time", time)
        .append("buyer", buyer)
        .append("maker", maker)
        .append("bestMatch", bestMatch)
        .append("orderId", orderId)
        .toString();
  }
}
