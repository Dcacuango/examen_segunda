/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador1;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class conexion {
   Connection enlazar = null;
   public Connection conectar()
   {
       try {
           Class.forName("com.mysql.cj.jdbc.Driver");
          enlazar = DriverManager.getConnection("jdbc:mysql://localhost/dbnomina","root","");
       } catch (Exception e) {
           JOptionPane.showConfirmDialog(null, e+"no se puedo hacer la conexion");
       }
       return enlazar;
   }
   
}
