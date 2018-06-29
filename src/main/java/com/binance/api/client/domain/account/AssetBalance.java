package com.binance.api.client.domain.account;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;

/**
 * An asset balance in an Account.
 *
 * @see Account
 */
public class AssetBalance {

  /**
   * Asset symbol.
   */
  private String asset;

  /**
   * Available balance.
   */
  private BigDecimal free;

  /**
   * Locked by open orders.
   */
  private BigDecimal locked;

  public String getAsset() {
    return asset;
  }

  public void setAsset(String asset) {
    this.asset = asset;
  }

  public BigDecimal getFree() {
    return free;
  }

  public void setFree(BigDecimal free) {
    this.free = free;
  }

  public BigDecimal getLocked() {
    return locked;
  }

  public void setLocked(BigDecimal locked) {
    this.locked = locked;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("asset", asset)
        .append("free", free.toPlainString())
        .append("locked", locked.toPlainString())
        .toString();
  }
}
