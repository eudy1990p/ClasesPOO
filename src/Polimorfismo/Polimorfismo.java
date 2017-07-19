/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfismo;

/**
 *
 * @author VOSTRO
 */
public class Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public Polimorfismo(){
        Animales animal; 
        
        animal  = new Gato();
        this.test(animal);
        
        animal = new Perro();
        this.test(animal);
    }
    
    public void test(Animales animal){
        animal.HacerRuido();
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
         new Polimorfismo(); 
         /*
         Realizar lo siguiente, crear una clase Persona la cual tendra un metodo llamado QuienSoy y mostrara un mensaje 
         soy una persona, luego crearemos dos clases mas una llamada Vendedor y otra llamada Cliente la cual heredaran de 
         la clase Persona, luego sobreescribiremos el metodo QuienSoy y mostraremos un mensaje acorde a la case que 
         lo sobreescribe ejemplo  si esta dentro de la clase Vendedor dira soy un vendedor, luego crearemos una 
         nueva clase llamada Polimorfismo, la cual tendra un metodo llamado Test de tipo void que recibira un como pareametro una 
         referencia a la clase Persona  y dentro de este metodo llamaremos al metodo QuienSoy ,
         luego sobreescribiremos el constructor para crear una referencia a la
         clase Persona y luego construiremos un objeto utilizando la referencia de la clase persona
         ejempplo persona = new Vendedor(); luego llamaremos al metodo Test y le pasamos el objeto como parametro. 
         
         */
    }
    
}
