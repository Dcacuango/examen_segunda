/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador1;

import ec.edu.intsuperior.vista1.*;

/**
 *
 * @author Daniel C
 */
public class Controlador {
  frmlogin loggin= new frmlogin(this);
    
    public void mostrarlogin(){
        loggin.setVisible(true);
    } 
}
