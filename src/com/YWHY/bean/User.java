package com.YWHY.bean;

public class User {
    private Integer userId;

    private String userName;

    private String userPwd;

    private int userRole;

    private String userImgAddress;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd == null ? null : userPwd.trim();
    }

    public int getUserRole() {
        return userRole;
    }

    public void setUserRole(int userRole) {
        this.userRole = userRole;
    }

    public String getUserImgAddress() {
        return userImgAddress;
    }

    public void setUserImgAddress(String userImgAddress) {
        this.userImgAddress = userImgAddress == null ? null : userImgAddress.trim();
    }
}