package MODELO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class mysql_conect {

    private static Connection Conexion;

    public void MySQLConnection(String user, String pass, String ba_gransoldi) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/ba_gransoldi", user, pass);
            System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeConnection() {
        try {
            Conexion.close();
            System.out.println("Se ha finalizado la conexión con el servidor");
        } catch (SQLException ex) {
            Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createDB(String ba_gransoldi) {
        try {
            String Query = "CREATE DATABASE " + ba_gransoldi;
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
            MySQLConnection("root", "", ba_gransoldi);
            JOptionPane.showMessageDialog(null, "Se ha creado la base de datos " + ba_gransoldi + " de forma exitosa");
        } catch (SQLException ex) {
            Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void createTable(String clientes) {
        try {
            String Query = "CREATE TABLE " + clientes + ""
                    + "(ID VARCHAR(25),Nombre VARCHAR(50), Apellido VARCHAR(50),"
                    + " Edad VARCHAR(3), Donativo VARCHAR(1))";
            JOptionPane.showMessageDialog(null, "Se ha creado la base de tabla " + clientes + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertData(String clientes, int CC_cliente, char Nombre, char Apellido, char Direccion, char Celular) {
        try {
            String Query = "INSERT INTO " + clientes + " VALUES("
                    + "\"" + CC_cliente + "\", "
                    + "\"" + Nombre + "\", "
                    + "\"" + Apellido + "\", "
                    + "\"" + Direccion + "\", "
                    + "\"" + Celular + "\")";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);            
            JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
        }
    }

    public void getValues(String clientes) {
        try {
            String Query = "SELECT * FROM " + clientes;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);

            while (resultSet.next()) {
                JOptionPane.showMessageDialog(null,"Id_Donantes: " + resultSet.getString("Id_Donantes") + " "
                        + "Nombre: " + resultSet.getString("Nombre") + " "
                        + "Apellido: " + resultSet.getString("Apellido") + " "
                        + "Edad: " + resultSet.getString("Edad") + " ");
                        //+ "Donativo: " + resultSet.getString("Donativo"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
    }

    public void deleteRecord(String donantes, String Id_donantes) {
        try {
            String Query = "DELETE FROM " + donantes + " WHERE Id_donantes = \"" + Id_donantes + "\"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
    }

}
