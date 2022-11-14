/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectsibies.modelos;

import org.omg.CORBA.PRIVATE_MEMBER;

/**
 *
 * @author Jesus
 */
public class Administrador {
    
    private String documento;
    private String contraseña;

    public Administrador() {
    }

    public Administrador(String documento, String contraseña) {
        this.documento = documento;
        this.contraseña = contraseña;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
}
