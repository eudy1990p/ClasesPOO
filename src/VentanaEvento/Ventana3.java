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
public class Ventana3 extends JFrame {
    //import javax.swing.JFrame;
    public Ventana3(){
        //Titulo de la ventana
        super("Mi primera ventana");
        //tamanyo de la ventana ancho , alto px
        this.setSize(400, 300);
        //hacer que se cierre la ventana cuando se le de click  bt cerrar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*
            Vamos a agregar componentes nuevos como bt,lb,tb (JButton)
        */
        //El layout lo volvemos null para personalizarlo
        this.setLayout(null);
        
        //Cada componente tiene tiene un metodo setBounds
        //Creamos un objecto de tipo jbutton javax.swing.JButton
        javax.swing.JButton btn1 = new javax.swing.JButton("BTN1 ");
        
        //Igual que en C# x,y,ancho,alto
        btn1.setBounds(0, 0, 70, 30);
        
        //Agregamos el boton al jframe
        this.add(btn1);
        
        /*
            Vamos a agregar componentes nuevos como bt,lb,tb (JLabel)
        */
        
        //Cada componente tiene tiene un metodo setBounds
        //Creamos un objecto de tipo jbutton javax.swing.JLabel
        javax.swing.JLabel lb1 = new javax.swing.JLabel("Etiqueta");
        
        //Igual que en C# x,y,ancho,alto
        lb1.setBounds(80, 0, 70, 30);
        
        //Agregamos el boton al jframe
        this.add(lb1);
        
        //hacer visible la ventana
        this.setVisible(true);
    }
}
