/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MetodoAtributos;

/**
 *
 * @author VOSTRO
 */
public class Producto {
    private String Nombre;
    private int cantidad;
    private double precio;
    
    //Metodo que no retorna valor
    public void asignarValorNombre(String nombre){
        this.Nombre = nombre;
    }
            
    //Metodo que retorna valor tambien llamado funcion
    public String obtenerNombre(){
        return this.Nombre;
    }
    //Metodo que recibe parametro
    
}
