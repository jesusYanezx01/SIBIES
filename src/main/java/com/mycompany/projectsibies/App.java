
package com.mycompany.projectsibies;

import com.mycompany.projectsibies.controladores.Controlador;
import com.mycompany.projectsibies.vistas.login;


public class App {
    
    public static void main(String[] args) {
        
        login jFrameApp= new login();
        
        Controlador controlador = new Controlador(jFrameApp);
        controlador.inicio();
        
        jFrameApp.setVisible(true);
    }
}
