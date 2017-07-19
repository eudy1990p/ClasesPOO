/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author VOSTRO
 */
public class Vehiculo {
    
    public String marca;
    public int anyo;
    
    public void Prender(){
        System.out.println("Prendido");//encendido
    }
    public void Apagar(){
        System.out.println("Apagado");
    }
    public void Detener(){
        System.out.println("Detenido");
    }
}
