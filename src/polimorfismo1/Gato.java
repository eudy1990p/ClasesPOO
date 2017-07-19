/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo1;

/**
 *
 * @author VOSTRO
 */
public class Gato extends Animales {
    public Gato(){
        this.Ruido = "Miau";
    }
    public void mensaje(){
        System.out.println("Soy un gato");
    }
}
