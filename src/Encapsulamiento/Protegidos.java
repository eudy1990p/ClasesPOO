/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulamiento;

/**
 *
 * @author VOSTRO
 */
public class Protegidos {
    
     protected String nombre;
    protected String apellido;
    protected String alias;
    
    protected void mensaje(){
        System.out.println("Protegidos "+nombre+" "+apellido+" "+alias);
    }
    
}
