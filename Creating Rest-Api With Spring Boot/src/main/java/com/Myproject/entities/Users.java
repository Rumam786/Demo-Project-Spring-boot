package com.Myproject.entities;

public class Users {
    private int userid;
    private String name;
    private String email;
    private int password;

    public Users(int userid, String name, String email, int password) {
        this.userid = userid;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Users() {
    }

    @Override
    public String toString() {
        return "Users{" +
                "userid=" + userid +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password=" + password +
                '}';
    }
}
