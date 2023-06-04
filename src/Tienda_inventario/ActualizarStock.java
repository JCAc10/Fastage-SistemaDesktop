package Tienda_inventario;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ActualizarStock {
    String producto;
    int cant;

    public ActualizarStock(String producto, int cant) {
        this.producto = producto;
        this.cant = cant;
    }

    public void nuevoStock(){
        Conexion con = new Conexion();
         try{
            String SQL = "update productos set Stock=(Stock-"+cant+") WHERE Nom_Produc= '"+producto+"'";
            Statement stmt = con.con.createStatement();
            int rs = stmt.executeUpdate(SQL);
            JOptionPane.showMessageDialog(null, "Stock Actualizado");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error " + e);
        } 
    }
}
