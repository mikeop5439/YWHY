package com.YWHY.bean.more;

public class UsedTime {
    private String orderStartDate;
    private String orderEndDate;
    private String usedTime;

    public String getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(String orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    public String getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(String orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    public String getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(String usedTime) {
        this.usedTime = usedTime;
    }

    @Override
    public String toString() {
        return "UsedTime{" +
                "orderStartDate='" + orderStartDate + '\'' +
                ", orderEndDate='" + orderEndDate + '\'' +
                ", usedTime='" + usedTime + '\'' +
                '}';
    }
}
