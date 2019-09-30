package com.YWHY.bean.more;

public class OrderSupportGroup {
    private String  supportName;
    private Integer supportId;

    public String getSupportName() {
        return supportName;
    }

    public void setSupportName(String supportName) {
        this.supportName = supportName;
    }

    public Integer getSupportId() {
        return supportId;
    }

    public void setSupportId(Integer supportId) {
        this.supportId = supportId;
    }

    @Override
    public String toString() {
        return "OrderSupportGroup{" +
                "supportName='" + supportName + '\'' +
                ", supportId=" + supportId +
                '}';
    }
}
