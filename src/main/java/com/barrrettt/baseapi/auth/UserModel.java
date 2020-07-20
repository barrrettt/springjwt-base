package com.barrrettt.baseapi.auth;


public class UserModel {
    private long id;
    private String name;
    private String password;
    private Boolean valid;
    private String roles;

    public UserModel(long id, String name, String password, Boolean valid, String roles) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.valid = valid;
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

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
    
}