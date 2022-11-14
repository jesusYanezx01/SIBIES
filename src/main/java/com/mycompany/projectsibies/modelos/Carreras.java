/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectsibies.modelos;

import java.util.ArrayList;


public class Carreras {
    
    private int idCarrera;
    private String nombreCarrera; 

    public Carreras() {
    }

    public Carreras(int id, String nombreCarrera) {
        this.idCarrera = idCarrera;
        this.nombreCarrera = nombreCarrera;
    }

    public int getId() {
        return idCarrera;
    }

    public void setId(int id) {
        this.idCarrera = id;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
    
    /*
    public ArrayList<Carreras> arrayListCarrera (){
        
        ArrayList<Carreras> arraylistCarrera = new ArrayList<>();

        arraylistCarrera.add(new Carreras(0, ""));
        arraylistCarrera.add(new Carreras(1, "Ingenieria de Software"));
        arraylistCarrera.add(new Carreras(2, "Diseño Grafico"));
        arraylistCarrera.add(new Carreras(3, "Diseño de modas"));
        arraylistCarrera.add(new Carreras(4, "Hoteleria y turismo"));
        arraylistCarrera.add(new Carreras(5, "Negocios internacionales"));
        arraylistCarrera.add(new Carreras(6, "Administracion financiera"));
        arraylistCarrera.add(new Carreras(7, "Logistica empresarial"));

        return arraylistCarrera;
    

    }
    
    */
}