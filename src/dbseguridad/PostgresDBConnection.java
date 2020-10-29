/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbseguridad;

import com.ibatis.common.jdbc.ScriptRunner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author adilsonmagalhaes
 */
public class PostgresDBConnection {
    //private final String urldb = "jdbc:postgresql://192.168.56.102:5432/postgres";
    private final String urldb = "jdbc:postgresql://localhost:5433/postgres";
    private final String user = "postgres";
    private final String password = "postgres";

    /**
     * Crea la estructura de la base de datos.
     */
    public void createDBStructureFromSQLFILE() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(urldb, user, password);
            System.out.println("Conectado a postgres correctamente.");
            
            ScriptRunner runner=new ScriptRunner(connection, false, false);
            try (InputStreamReader reader = new InputStreamReader(new FileInputStream("src//textoPlano.sql"))) {
                runner.runScript(reader);
                connection.close();
            }
            
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage());
            
        }

    }
    
    public Connection connectToDatabase() {
        Connection connection = null;
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(urldb, user, password);
            System.out.println("Conectado a postgres correctamente.");
        } catch (Exception e) {
            System.out.println(e.getCause());
        }

        return connection;
    }
}
