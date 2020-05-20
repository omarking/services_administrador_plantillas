/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fastcode.android.resources;

import com.fastcode.android.dao.DaoUsers;
import com.fastcode.android.entidades.Users;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author admin
 */

@Path("users_service")
public class UserService {
    
    //Busca Usuario por Correo y Contraseña
    @GET
    @Path("{user}/{pass}")
    @Produces(MediaType.APPLICATION_JSON)
    public Users getLogin(@PathParam("user")String user,@PathParam("pass")String pass){
        try {
            return DaoUsers.getInstance().buscarUsuario(user,pass);
        } catch (SQLException ex) {
            Logger.getLogger(UserService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
