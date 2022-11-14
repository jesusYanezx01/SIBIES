
package com.mycompany.projectsibies.modelos;

import java.util.ArrayList;


public class Estudiantes {
    
    private String nombre;  
    private String apellido;
    private String semestre;
    private String sexo;
    private String correoElectronico;
    private String telefono;
    private String numeroIdentificacion;
    private String observacion;
             
    /*int carrera; */

    public Estudiantes() {
    }
    
    /*
    public ArrayList<Estudiantes> arraylistEstudiantes(){
        
        ArrayList<Estudiantes> arraylistEstudiantes = new ArrayList<>();
        
        arraylistEstudiantes.add(new Estudiantes("Jesus", "Yañez", 1, "4", "Masculino", "arturo@gmail.com", "3108613289", "1091966482" ));
        arraylistEstudiantes.add(new Estudiantes("Angello", "Anteliz", 3, "4", "No identificado", "angello@gmail.com", "3148613289", "1591966482" ));
        
        return arraylistEstudiantes; 
    }
    
    */

    public Estudiantes(String nombre, String apellido, String semestre, String sexo, String correoElectronico, String telefono, String numeroIdentificacion, String observacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.semestre = semestre;
        this.sexo = sexo;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.numeroIdentificacion = numeroIdentificacion;
        this.observacion = observacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

}
