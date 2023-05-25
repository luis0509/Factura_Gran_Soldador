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
            JOptionPane.showMessageDialog(null,"Se ha iniciado la conexión con el servidor de forma exitosa");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void closeConnection() {
        try {
            Conexion.close();
            JOptionPane.showMessageDialog(null,"Se ha finalizado la conexión con el servidor");
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
                    + "(CC_cliente VARCHAR(15),Nombre VARCHAR(50), Apellido VARCHAR(50),"
                    + " Direccion VARCHAR(50), Celular VARCHAR(50))";
            JOptionPane.showMessageDialog(null, "Se ha creado la base de tabla " + clientes + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void createTable2(String productos) {
        try {
            String Query = "CREATE TABLE " + productos + ""
                    + "(Id int(20),Descripcion VARCHAR(150), IVA VARCHAR(5),"
                    + " Precio VARCHAR(10))";
            JOptionPane.showMessageDialog(null, "Se ha creado la base de tabla " + productos + " de forma exitosa");
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);
        } catch (SQLException ex) {
            Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertData(String clientes, String CC_cliente, String Nombre, String Apellido, String Direccion, String Celular) {
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
                JOptionPane.showMessageDialog(null,"CC_cliente: " + resultSet.getString("CC_cliente") + " "
                        + "Nombre: " + resultSet.getString("Nombre") + " "
                        + "Apellido: " + resultSet.getString("Apellido") + " "
                        + "Direccion: " + resultSet.getString("Direccion") + " "
                        + "Celular: " + resultSet.getString("Celular"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
    }
    
    
    public void getValues2(String productos) {
        try {
            String Query = "SELECT * FROM " + productos;
            Statement st = Conexion.createStatement();
            java.sql.ResultSet resultSet;
            resultSet = st.executeQuery(Query);

            while (resultSet.next()) {
                JOptionPane.showMessageDialog(null,"Id: " + resultSet.getString("Id") + " "
                        + "Descripcion: " + resultSet.getString("Descripcion") + " "
                        + "IVA: " + resultSet.getString("IVA") + " "
                        + "Precio: " + resultSet.getString("Precio"));
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
        }
    }

    public void deleteRecord(String clientes, String CC_cliente) {
        try {
            String Query = "DELETE FROM " + clientes + " WHERE CC_cliente = \"" + CC_cliente + "\"";
            Statement st = Conexion.createStatement();
            st.executeUpdate(Query);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
        }
    }

    

    

}
