package com.YWHY.bean.more;

public class OrderOfDefJson {
    private String orderId;
    private String orderDefeat;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDefeat() {
        return orderDefeat;
    }

    public void setOrderDefeat(String orderDefeat) {
        this.orderDefeat = orderDefeat;
    }

    @Override
    public String toString() {
        return "OrderOfDefJson{" +
                "orderId='" + orderId + '\'' +
                ", orderDefeat='" + orderDefeat + '\'' +
                '}';
    }
}
