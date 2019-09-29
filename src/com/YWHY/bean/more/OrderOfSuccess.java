package com.YWHY.bean.more;

public class OrderOfSuccess {
    private Integer orderSupportId;
    private Integer orderId;

    public Integer getOrderSupportId() {
        return orderSupportId;
    }

    public void setOrderSupportId(Integer orderSupportId) {
        this.orderSupportId = orderSupportId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "OrderOfSuccess{" +
                "orderSupportId=" + orderSupportId +
                ", orderId=" + orderId +
                '}';
    }
}
