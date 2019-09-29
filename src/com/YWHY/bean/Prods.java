package com.YWHY.bean;

public class Prods {
    private Integer prodsId;

    private Integer prodTypeId;

    private String prodAccount;

    private Integer orderId;

    public Integer getProdsId() {
        return prodsId;
    }

    public void setProdsId(Integer prodsId) {
        this.prodsId = prodsId;
    }

    public Integer getProdTypeId() {
        return prodTypeId;
    }

    public void setProdTypeId(Integer prodTypeId) {
        this.prodTypeId = prodTypeId;
    }

    public String getProdAccount() {
        return prodAccount;
    }

    public void setProdAccount(String prodAccount) {
        this.prodAccount = prodAccount == null ? null : prodAccount.trim();
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Prods{" +
                "prodsId=" + prodsId +
                ", prodTypeId=" + prodTypeId +
                ", prodAccount='" + prodAccount + '\'' +
                ", orderId=" + orderId +
                '}';
    }
}