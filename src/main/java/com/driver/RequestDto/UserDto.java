package com.driver.RequestDto;

public class UserDto {
    private String userName;
    private String email;
    private String mobileNo;

    public UserDto(String userName, String email, String mobileNo) {
        this.userName = userName;
        this.email = email;
        this.mobileNo = mobileNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
}
