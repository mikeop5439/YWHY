package com.YWHY.bean.more;

import com.YWHY.bean.Order;

public class OrderDetil extends Order {
    private String userName;
    private String supportName;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getSupportName() {
        return supportName;
    }

    public void setSupportName(String supportName) {
        this.supportName = supportName;
    }

    @Override
    public String toString() {
        return "OrderDetil{" +
                "userName='" + userName + '\'' +
                ", supportName='" + supportName + '\'' +
                '}';
    }
}
