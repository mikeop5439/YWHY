package com.YWHY.bean;

public class Massage {
    private String massage;

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    @Override
    public String toString() {
        return "Massage{" +
                "massage='" + massage + '\'' +
                '}';
    }
}
