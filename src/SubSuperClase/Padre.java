/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SubSuperClase;

/**
 *
 * @author VOSTRO
 */
//Clase base
public class Padre {
    
    public String Nombre= "Ramon";
    public Padre(){
        System.out.println(this.Nombre);
        
    }
   
    public Padre(String n){
        this.Nombre = n;
        System.out.println(this.Nombre);
    }
}
