package dbseguridad;

import java.sql.Connection;
import views.AuditView;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class InitialSetup {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
       
        //Conectar a la base de datos
        new AuditView().setVisible(true);
    }
    
}
