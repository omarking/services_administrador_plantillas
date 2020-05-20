/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastcode.android.entidades;

import java.sql.Timestamp;

/**
 *
 * @author admin
 */
public class Users {
    
    private int id;
    private String name;
    private String email;
    private Timestamp email_verified_at;
    private String password;
    private String remember_token;
    private Timestamp created_at;
    private Timestamp update_at;

    public Users(){}
    
    public Users(int id, String name, String email, Timestamp email_verified_at, String password, String remember_token, Timestamp created_at, Timestamp update_at) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.email_verified_at = email_verified_at;
        this.password = password;
        this.remember_token = remember_token;
        this.created_at = created_at;
        this.update_at = update_at;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Timestamp getEmail_verified_at() {
        return email_verified_at;
    }

    public void setEmail_verified_at(Timestamp email_verified_at) {
        this.email_verified_at = email_verified_at;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRemember_token() {
        return remember_token;
    }

    public void setRemember_token(String remember_token) {
        this.remember_token = remember_token;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Timestamp update_at) {
        this.update_at = update_at;
    }
    
    
    

}
