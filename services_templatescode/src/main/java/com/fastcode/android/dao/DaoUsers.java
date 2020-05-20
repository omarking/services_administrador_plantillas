/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastcode.android.dao;

import com.fastcode.android.entidades.Users;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author admin
 */
public class DaoUsers implements DAO_USERS<Users>{

    private PreparedStatement buscarUsuario;
    
    private static DaoUsers instacia;
    
    private DaoUsers(){
        
    }
    
    public static DaoUsers getInstance(){
        if (instacia == null) {
            instacia = new DaoUsers();
        }
        return instacia;
    }    
 
    @Override
    public Users buscarUsuario(String user, String pass) throws SQLException {
       
       //String query = "SELECT * FROM users as u WHERE  u.email = ? and u.password = ? ";
       String query = "Select * from users as u, roles as r, role_user as ru, permissions as p, permission_role as pr where ru.role_id = r.id and ru.user_id = u.id and pr.role_id = r.id and pr.permission_id = p.id and u.email = ? and u.password = ?";
       
       if (buscarUsuario == null) {
            buscarUsuario = Conexion.getInstance().getCon().prepareStatement(query);
        }
        
        buscarUsuario.setString(1, user);
        buscarUsuario.setString(2, pass);
        
        ResultSet set = buscarUsuario.executeQuery();
        
        return set != null && set.next() ? cargarUsu(set) : null;
    }

     public Users cargarUsu(ResultSet set) throws SQLException{
      
        Users usuario = new Users();
        usuario.setId(set.getInt("u.id"));
        usuario.setName(set.getString("u.name"));
        usuario.setEmail(set.getString("u.email"));
        usuario.setEmail_verified_at(set.getTimestamp("u.email_verified_at"));
        usuario.setPassword(set.getString("u.password"));
        usuario.setRemember_token(set.getString("u.remember_token"));
        usuario.setCreated_at(set.getTimestamp("u.created_at"));
        usuario.setUpdate_at(set.getTimestamp("u.updated_at"));
        
        return usuario;
    }
    
}
