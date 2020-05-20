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
public class Roles {
    
    private int id;
    private String name;
    private String slug;
    private String description;
    private String full_access;
    private Timestamp created_at;
    private Timestamp updated_at;

    public Roles(int id, String name, String slug, String description, String full_access, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.full_access = full_access;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFull_access() {
        return full_access;
    }

    public void setFull_access(String full_access) {
        this.full_access = full_access;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
    
}
