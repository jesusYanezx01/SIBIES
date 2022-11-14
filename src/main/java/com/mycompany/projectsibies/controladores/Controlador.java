
package com.mycompany.projectsibies.controladores;

import com.mycompany.projectsibies.modelos.*;
import com.mycompany.projectsibies.vistas.login;
import java.util.ArrayList;
import java.util.Scanner;
import jdk.nashorn.internal.ir.BreakNode;


public class Controlador {
    
    private login jFrameApp;
    
    private Estudiantes estudiantes;
    private Carreras carrera;
    

    /*
    
private ArrayList<Estudiantes> arraylistSoft = new ArrayList<>();
    
    */

    public Controlador(login jFrameApp) {
        this.estudiantes = new Estudiantes();
        this.carrera = new Carreras();
        this.jFrameApp= jFrameApp;
    }
    
   
   public void inicio(){
     
    }
   
    /*
   public void verMenu(){
       
       int bandera;
            do {
                bandera=Integer.parseInt(vistaApp.getMenu());
                
                switch(bandera){
                    case 1: verMenuCarreras();
                    break;
                    case 2: menuConsultarRegistrarEstudiantes();
                    break;
                    case 3: vistaApp.setTexto("Vuelva pronto");
                    break;
                    
                    default: vistaApp.setTexto("Está opcion no exite, elija otra...");
                }
           
       } while (bandera != 3);
   }

    private void verMenuCarreras() {
        
        boolean continuar = true;

            do {
               
                switch(vistaApp.getMenuCarreras()){
                    case 1: 
                        for(int n=0; n< arraylistSoft.size(); n++){
        
                                vistaApp.setTexto("El nombre del estudiante es: " + arraylistSoft.get(n).getNombre()+
                               "\nEl apellido del estudiante es: " + arraylistSoft.get(n).getApellido()+
                               "\nEl apellido del estudiante es: " + arraylistSoft.get(n).getNumeroIdentificacion()+
                               "\nEl apellido del estudiante es: " + arraylistSoft.get(n).getCorreoElectronico()+
                               "\nEl apellido del estudiante es: " + arraylistSoft.get(n).getTelefono()+
                               "\nEl apellido del estudiante es: " + arraylistSoft.get(n).getCarrera()+
                               "\nEl apellido del estudiante es: " +arraylistSoft.get(n).getSemestre()+
                               "\nEl apellido del estudiante es: " +arraylistSoft.get(n).getSexo());
        
        }
                    break;
                    case 2: System.out.println("diseñadores");
                    break;
                    case 3: System.out.println("modas");
                    break;
                    case 4: System.out.println("cursos gratis");
                    break;
                    case 5: System.out.println("negociantes");
                    break;
                    case 6: System.out.println("financieros");
                    break;
                    case 7: System.out.println("empresarios");
                    break;
                    case 8: vistaApp.setTexto("ok");
                            continuar=false;
                    break;
                    
                    default: vistaApp.setTexto("Está opcion no exite, elija otra...");
                }
           
       } while (continuar);
                      
    }

    private void menuConsultarRegistrarEstudiantes() {
        
        int i=0;
        
        do {
            i=Integer.parseInt(vistaApp.getMenuEstudiantes());

            switch(i){

                case 1: mostrarEstudianteCreado(estudiantes.arraylistEstudiantes(), carrera.arrayListCarrera());
                break;

                case 2: verMenuCarreraRegistrar(estudiantes.arraylistEstudiantes(), carrera.arrayListCarrera());   
                break;

                case 3: vistaApp.setTexto("ok");
                break;

                default: vistaApp.setTexto("Está opcion no exite, elija otra...");
                break;
            }
           
        } while (i != 3);
    }

    private void verMenuCarreraRegistrar(ArrayList<Estudiantes> arrayListEstudiante, ArrayList<Carreras> arrayListCarrera) {
        int carrera;
        String nombre, apellido, semestre, sexo, correoElectronico, telefono, numeroIdentificacion;
        
            do {
               
        nombre = vistaApp.getEntrada("\nIngrese su nombre: ");
        apellido = vistaApp.getEntrada("Ingrese su apellido: ");
        semestre = vistaApp.getEntrada("Ingrese su semestre: ");
        sexo = vistaApp.getEntrada("Ingrese su sexo: ");
        correoElectronico= vistaApp.getEntrada("Ingrese su correo electronico: ");
        telefono= vistaApp.getEntrada("Ingrese su numero de telefono: ");
        numeroIdentificacion= vistaApp.getEntrada("Ingrese su numero de identificacion: ");
        carrera = vistaApp.getMenuCarreras();
        
        
        arrayListEstudiante.add(new Estudiantes(nombre, apellido, carrera, semestre, sexo, correoElectronico, telefono, numeroIdentificacion));
        
           
       } while (carrera == 1 );
        
    
    }    

        
    

    private void mostrarEstudianteCreado(ArrayList<Estudiantes> arraylistEstudiantes, ArrayList<Carreras> arrayListCarrera) {
        
        for(Estudiantes estudiante : arraylistEstudiantes){
            Carreras carreraE = new Carreras();
            carreraE.setNombreCarrera(arrayListCarrera.get(estudiante.getCarrera()).getNombreCarrera());
            vistaApp.verEstudiante(estudiante, carreraE);
        }   
    }

    */

    
}
    
    
    
    

