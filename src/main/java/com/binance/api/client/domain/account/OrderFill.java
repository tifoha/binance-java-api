package com.binance.api.client.domain.account;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * Represents an order fill trade.
 */
public class OrderFill {

  /**
   * Trade id.
   */
  private Long tradeId;

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

  public Long getTradeId() {
    return tradeId;
  }

  public void setTradeId(Long tradeId) {
    this.tradeId = tradeId;
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

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("id", tradeId)
        .append("price", price)
        .append("qty", qty)
        .append("commission", commission)
        .append("commissionAsset", commissionAsset)
        .toString();
  }
}
