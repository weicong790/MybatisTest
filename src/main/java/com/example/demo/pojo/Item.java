package com.example.demo.pojo;


public class Item {

  private long id;
  private String name;
  private String code;
  private long stock;
  private java.sql.Date purchaseTime;
  private long isActive;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public long getStock() {
    return stock;
  }

  public void setStock(long stock) {
    this.stock = stock;
  }


  public java.sql.Date getPurchaseTime() {
    return purchaseTime;
  }

  public void setPurchaseTime(java.sql.Date purchaseTime) {
    this.purchaseTime = purchaseTime;
  }


  public long getIsActive() {
    return isActive;
  }

  public void setIsActive(long isActive) {
    this.isActive = isActive;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public String toString() {
    return "Item{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", code='" + code + '\'' +
            ", stock=" + stock +
            ", purchaseTime=" + purchaseTime +
            ", isActive=" + isActive +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            '}';
  }
}
