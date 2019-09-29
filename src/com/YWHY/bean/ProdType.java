package com.YWHY.bean;

public class ProdType {
    private Integer prodTypeId;

    private String prodTypeName;

    private Integer prodTypeCategory;

    public Integer getProdTypeId() {
        return prodTypeId;
    }

    public void setProdTypeId(Integer prodTypeId) {
        this.prodTypeId = prodTypeId;
    }

    public String getProdTypeName() {
        return prodTypeName;
    }

    public void setProdTypeName(String prodTypeName) {
        this.prodTypeName = prodTypeName == null ? null : prodTypeName.trim();
    }

    public Integer getProdTypeCategory() {
        return prodTypeCategory;
    }

    public void setProdTypeCategory(Integer prodTypeCategory) {
        this.prodTypeCategory = prodTypeCategory;
    }

    @Override
    public String toString() {
        return "ProdType{" +
                "prodTypeId=" + prodTypeId +
                ", prodTypeName='" + prodTypeName + '\'' +
                ", prodTypeCategory=" + prodTypeCategory +
                '}';
    }
}