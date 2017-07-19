/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaEvento;

//importamos todo de swing
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

/**
 *
 * @author VOSTRO
 */
public class Ventana6Evento1 extends JFrame implements MouseListener {
    
    //private JLabel lb1;
    private JButton btn1;
    //private JTextField txtF1;
    
    public Ventana6Evento1(){
        //Titulo de la ventana
        super("Mi primera ventana");
        //tamanyo de la ventana ancho , alto px
        this.setSize(400, 300);
        //hacer que se cierre la ventana cuando se le de click  bt cerrar
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //El layout lo volvemos null para personalizarlo
        //El layout especifica como se comportaran los componentes que se agregan
        this.setLayout(null);
        
        //Activamos que se escuchen los eventos en la ventana
        this.addMouseListener(this);
       // this.Componentes();
        //hacer visible la ventana
        this.setVisible(true);
    }
    
    //Creamos un metodo  llamado Componentes
    public void Componentes(){
                /*
            Vamos a agregar componentes nuevos como bt,lb,tb (JButton)
        *
        //Cada componente tiene tiene un metodo setBounds
        //Creamos un objecto de tipo jbutton javax.swing.JButton
        this.btn1 = new JButton("BTN1 ");
        
        //Igual que en C# x,y,ancho,alto
        btn1.setBounds(0, 0, 70, 30);
        
        //Agregamos el boton al jframe
        this.add(btn1);
        
        /*
            Vamos a agregar componentes nuevos como bt,lb,tb (JLabel)
        *
        
        //Cada componente tiene tiene un metodo setBounds
        //Creamos un objecto de tipo jbutton javax.swing.JLabel
        this.lb1 = new JLabel("Etiqueta");
        
        //Igual que en C# x,y,ancho,alto
        lb1.setBounds(80, 0, 70, 30);
        
        //Agregamos el boton al jframe
        this.add(lb1);
        
        
        /*
            Vamos a agregar componentes nuevos como bt,lb,tb (JTextField)
        *
        
        //Cada componente tiene tiene un metodo setBounds
        //Creamos un objecto de tipo jbutton javax.swing.JLabel
       this.txtF1 = new JTextField("TextField");
        
        //Igual que en C# x,y,ancho,alto
        txtF1.setBounds(150, 0, 70, 30);
        
        //Agregamos el boton al jframe
        this.add(txtF1);
        */
    }

    /*
    void mouseClicked(MouseEvent e) 
Invoked when the mouse button has been clicked (pressed and released) on a component.
 
void mouseEntered(MouseEvent e) 
Invoked when the mouse enters a component.
 
void mouseExited(MouseEvent e) 
Invoked when the mouse exits a component.
 
void mousePressed(MouseEvent e) 
Invoked when a mouse button has been pressed on a component.
 
void mouseReleased(MouseEvent e) 
Invoked when a mouse button has been released on a component. 

    */
    
    @Override
    public void mouseClicked(MouseEvent e) {
        //JOptionPane.showMessageDialog(null, "mouseClicked");
                        System.out.println("mouseClicked");

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // JOptionPane.showMessageDialog(null, "mousePressed");
                System.out.println("mousePressed");

        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //JOptionPane.showMessageDialog(null, "mouseReleased");
        System.out.println("mouseReleased");
//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //JOptionPane.showMessageDialog(null, "mouseEntered");
        System.out.println("mouseEntered");
    //    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
              //  JOptionPane.showMessageDialog(null, "mouseExited");
           System.out.println("mouseExited");
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
