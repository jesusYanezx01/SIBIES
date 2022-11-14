/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectsibies.dao;


/**
 *
 * @author Jesus
 */
public class Constantes {
    
    //Datos de Conexion
    public static final String DATABASE="db_sibies";
    public static final String URL="jdbc:mysql://localhost:3306";
    public static final String USER="root";
    public static final String PASSWORD="";
    
    //Tabla administrador
    public static final String T_ADMINISTRADOR="administrador";
    public static final String TA_DOCUMENTO="documento";
    public static final String TA_CONTRASEÑA="contraseña";
    
    //Tabla Carrera
    public static final String T_CARRERAS="carreras";
    public static final String TC_ID="idCarrera";
    public static final String TC_NOMBRECARRERA="nombreCarrera";
    
    //Tabla Estudiantes
    public static final String T_ESTUDIANTES="estudiantes";
    public static final String TE_NOMBRE="nombre";
    public static final String TE_APELLIDO="apellido";
    public static final String TE_CARRERA="carrera";
    public static final String TE_SEMESTRE="semestre";
    public static final String TE_CORREO="correoElectronico";
    public static final String TE_TELEFONO="telefono";
    public static final String TE_DOCUMENTO="numeroIdentificación";
    
    
}
