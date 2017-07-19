/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaEvento;

import javax.swing.JFrame;

/**
 *
 * @author VOSTRO
 */
public class Ventana1 extends JFrame {
    //import javax.swing.JFrame;
    public Ventana1(){
        //Titulo de la ventana
        super("Mi primera ventana");
        //tamanyo de la ventana ancho , alto px
        this.setSize(200, 300);
        
        //hacer que se cierre la ventana cuando se le de click  bt cerrar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //hacer visible la ventana
        this.setVisible(true);
        
    }
    
}
