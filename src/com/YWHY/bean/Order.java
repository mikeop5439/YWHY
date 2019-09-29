package com.YWHY.bean;

import java.util.Date;

public class Order {
    private Integer orderId;

    private String orderArea;

    private String orderUserName;

    private String orderTele;

    private String orderText;

    private Integer orderSupportId;

    private Date orderStartDate;

    private Date orderEndDate;

    private Integer orderStatus;

    private Integer orderUserId;

    private String orderDefeat;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderArea() {
        return orderArea;
    }

    public void setOrderArea(String orderArea) {
        this.orderArea = orderArea == null ? null : orderArea.trim();
    }

    public String getOrderUserName() {
        return orderUserName;
    }

    public void setOrderUserName(String orderUserName) {
        this.orderUserName = orderUserName == null ? null : orderUserName.trim();
    }

    public String getOrderTele() {
        return orderTele;
    }

    public void setOrderTele(String orderTele) {
        this.orderTele = orderTele == null ? null : orderTele.trim();
    }

    public String getOrderText() {
        return orderText;
    }

    public void setOrderText(String orderText) {
        this.orderText = orderText == null ? null : orderText.trim();
    }

    public Integer getOrderSupportId() {
        return orderSupportId;
    }

    public void setOrderSupportId(Integer orderSupportId) {
        this.orderSupportId = orderSupportId;
    }

    public Date getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(Date orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    public Date getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(Date orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderUserId() {
        return orderUserId;
    }

    public void setOrderUserId(Integer orderUserId) {
        this.orderUserId = orderUserId;
    }

    public String getOrderDefeat() {
        return orderDefeat;
    }

    public void setOrderDefeat(String orderDefeat) {
        this.orderDefeat = orderDefeat == null ? null : orderDefeat.trim();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", orderArea='" + orderArea + '\'' +
                ", orderUserName='" + orderUserName + '\'' +
                ", orderTele='" + orderTele + '\'' +
                ", orderText='" + orderText + '\'' +
                ", orderSupportId=" + orderSupportId +
                ", orderStartDate=" + orderStartDate +
                ", orderEndDate=" + orderEndDate +
                ", orderStatus=" + orderStatus +
                ", orderUserId=" + orderUserId +
                ", orderDefeat='" + orderDefeat + '\'' +
                '}';
    }
}