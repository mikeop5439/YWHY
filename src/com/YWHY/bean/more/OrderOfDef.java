package com.YWHY.bean.more;

public class OrderOfDef {
    private Integer orderId;
    private String orderDefeat;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
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
        return "OrderOfDef{" +
                "orderId=" + orderId +
                ", orderDefeat='" + orderDefeat + '\'' +
                '}';
    }
}
