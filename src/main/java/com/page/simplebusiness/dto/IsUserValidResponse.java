package com.page.simplebusiness.dto;

public class IsUserValidResponse {

    private boolean flag;

    private String username;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
