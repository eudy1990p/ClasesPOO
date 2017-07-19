/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VentanaEvento;

//importamos todo de swing
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

/**
 *
 * @author VOSTRO
 */
public class Ventana6Evento6 extends JFrame implements ItemListener {
    
    //private JLabel lb1;
    private JButton btn1;
    private JComboBox jcb1;
    //private JTextField txtF1;
    
    public Ventana6Evento6(){
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
        //this.addMouseListener(this);
       //this.addKeyListener(this);
        //this.addMouseMotionListener(this);
        //this.addFocusListener(this);
        
        this.Componentes();
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
        
        //Le decimos al BTn que escuche 
        btn1.addActionListener(this);
        
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
                //Cada componente tiene tiene un metodo setBounds
        //Creamos un objecto de tipo jbutton javax.swing.JLabel
       this.jcb1 = new JComboBox();
       this.jcb1.addItem("1");
       this.jcb1.addItem("2");
       this.jcb1.addItem("3");
       //creamos un objeto de modelo de lista
        //DefaultComboModel modal = new DefaultComboModel();
        
        //creamos un arreglo
        //String[] datos={"1","2","3","4","5","6"};
        
        //modal.addElement(datos);
        
        
        
        //Igual que en C# x,y,ancho,alto
        this.jcb1.setBounds(0, 40, 70, 30);
        
        //Agregamos el boton al jframe
        this.add(this.jcb1);
        this.jcb1.addItemListener(this);
    }
/*
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
    }*/
/*

keyPressed - when the key goes down
keyReleased - when the key comes up
keyTyped - when the unicode character represented by this key is sent by the keyboard to system input.
 

    *
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("keyTyped Char "+e.getKeyChar()+" Code "+e.getKeyCode());
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed Char "+e.getKeyChar()+" Code "+e.getKeyCode());
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("keyReleased Char "+e.getKeyChar()+" Code "+e.getKeyCode());
// throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
/*
    @Override
    public void actionPerformed(ActionEvent e) {
        
        System.out.println("actionPerformed "+e.getSource());
       if(e.getSource() == this.btn1){
           JOptionPane.showMessageDialog(null, "Confirmo que es un boto y es btn1");
       }
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("mouseDragged x "+e.getX()+" y "+e.getY());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
    System.out.println("mouseMoved x "+e.getX()+" y "+e.getY());   
    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    *

    @Override
    public void focusGained(FocusEvent e) {
        System.out.println("focusGained");   
    
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void focusLost(FocusEvent e) {
                System.out.println("focusLost");   

//      throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    @Override
    public void itemStateChanged(ItemEvent e) {
       
        if(e.getSource() == this.jcb1 ){
            System.out.println("si es el combobox values "+e.getItem().toString());
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
