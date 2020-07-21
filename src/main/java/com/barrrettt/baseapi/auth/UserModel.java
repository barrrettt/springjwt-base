package com.barrrettt.baseapi.auth;


public class UserModel {
    private long id;
    private String name;
    private String password;
    private Boolean active;
    private String roles;

    public UserModel(){}

    public UserModel(long id, String name, String password, Boolean active, String roles) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.active = active;
        this.roles = roles;
    }

    public UserModel(String name, String password, String roles) {
        this.id = -1;
        this.name = name;
        this.password = password;
        this.active = true;
        this.roles = roles;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
    
}