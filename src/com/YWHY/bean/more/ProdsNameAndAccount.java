package com.YWHY.bean.more;

public class ProdsNameAndAccount {
    private String prodTypeName;
    private String prodAccount;

    public String getProdTypeName() {
        return prodTypeName;
    }

    public void setProdTypeName(String prodTypeName) {
        this.prodTypeName = prodTypeName;
    }

    public String getProdAccount() {
        return prodAccount;
    }

    public void setProdAccount(String prodAccount) {
        this.prodAccount = prodAccount;
    }

    @Override
    public String toString() {
        return "ProdsNameAndAccount{" +
                "prodTypeName='" + prodTypeName + '\'' +
                ", prodAccount='" + prodAccount + '\'' +
                '}';
    }
}
