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
public class Main {
    
    public Main(){
        Animales animal1;
        
        animal1 = new Gato();
        this.Test(animal1);
       // animal1.mensaje();
        
        animal1 = new Perro();
        this.Test(animal1);
       // animal1.mensaje();
    }
    
    public void Test(Animales animal){
        animal.mensaje();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Main();
    }
    
}
