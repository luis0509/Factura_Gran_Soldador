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
 
 public void MySQLConnection(String user, String pass,
String db_name) {
 try {
 Class.forName("org.gjt.mm.mysql.Driver");
 Conexion =
DriverManager.getConnection("jdbc:mysql://localhost/" +
db_name, user, pass);
 System.out.println("Se ha iniciado la conexión con el servidor de forma exitosa");
 } catch (ClassNotFoundException ex) {

Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE,
null, ex);
 } catch (SQLException ex) {

Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE,
null, ex);
 }
 }
 public void closeConnection() {
 try {
 Conexion.close();
 System.out.println("Se ha finalizado la conexión con el servidor");
 } catch (SQLException ex) {

Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE,
null, ex);
 }
 }
 public void createDB(String name) {
 try {
 String Query = "CREATE DATABASE " + name;
 Statement st = Conexion.createStatement();
 st.executeUpdate(Query);
 MySQLConnection("root", "root", name);
 JOptionPane.showMessageDialog(null, "Se ha creado la base de datos " + name + " de forma exitosa");
 } catch (SQLException ex) {

Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE,
null, ex);
 }
 }
 public void createTable(String name) {
 try {
 String Query = "CREATE TABLE " + name + ""
 + "(ID VARCHAR(25),Nombre VARCHAR(50),Apellido VARCHAR(50),"
 + " Edad VARCHAR(3), Sexo VARCHAR(1))";
 JOptionPane.showMessageDialog(null, "Se ha creado la base de tabla " + name + " de forma exitosa");
 Statement st = Conexion.createStatement();
 st.executeUpdate(Query);
 } catch (SQLException ex) {

Logger.getLogger(mysql_conect.class.getName()).log(Level.SEVERE,
null, ex);
 }
 }
 public void insertData(String table_name, String ID, String
name, String lastname, String age, String genero) {
 try {
 String Query = "INSERT INTO " + table_name + "
VALUES("
 + "\"" + ID + "\", "
 + "\"" + name + "\", "
 + "\"" + lastname + "\", "
 + "\"" + age + "\", "
 + "\"" + genero + "\")";
 Statement st = Conexion.createStatement();
 st.executeUpdate(Query);
 JOptionPane.showMessageDialog(null, "Datos almacenados de forma exitosa");
 } catch (SQLException ex) {
 System.out.println(ex.getMessage());
 JOptionPane.showMessageDialog(null, "Error en el almacenamiento de datos");
 }
 }
 public void getValues(String table_name) {
 try {
 String Query = "SELECT * FROM " + table_name;
 Statement st = Conexion.createStatement();
 java.sql.ResultSet resultSet;
 resultSet = st.executeQuery(Query);
 while (resultSet.next()) {
 System.out.println("ID: " +
resultSet.getString("ID") + " "
 + "Nombre: " +
resultSet.getString("Nombre") + " " +
resultSet.getString("Apellido") + " "
 + "Edad: " + resultSet.getString("Edad") + "
"
 + "Sexo: " + resultSet.getString("Sexo"));
 }
 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, "Error en la adquisición de datos");
 }
 }
 public void deleteRecord(String table_name, String ID) {
 try {
 String Query = "DELETE FROM " + table_name + "
WHERE ID = \"" + ID + "\"";
 Statement st = Conexion.createStatement();
 st.executeUpdate(Query);
 } catch (SQLException ex) {
 System.out.println(ex.getMessage());
 JOptionPane.showMessageDialog(null, "Error borrando el registro especificado");
 }
 }
}
