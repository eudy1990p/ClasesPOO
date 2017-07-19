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
public class MetodoAtributos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto leche = new Producto();
        System.out.println(leche.obtenerNombre());
        
        leche.asignarValorNombre("leche");
        
        System.out.println(leche.obtenerNombre());
    }
    
}
