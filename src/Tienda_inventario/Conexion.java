/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda_inventario;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Conexion {
       private String driver="com.mysql.jdbc.Driver";
       private String cadenaCon ="jdbc:mysql://localhost:3306/plazavea_db";
       private String usuario="root";
       private String password="";
       public Connection con;

       public Conexion(){
        try{
            Class.forName(driver);
            con= (Connection)DriverManager.getConnection(cadenaCon, usuario, password);
            System.out.println("Conexion exitosa");
        }   catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se ha podido establecer conexion");
        }
    
        }
}
