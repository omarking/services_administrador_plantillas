/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastcode.android.dao;

import java.sql.SQLException;

/**
 *
 * @author admin
 */
public interface DAO_USERS <T> {
    T buscarUsuario(String pass, String user) throws SQLException;
}
