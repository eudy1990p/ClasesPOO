/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SobreCarga;

/**
 *
 * @author VOSTRO
 */
public class Operaciones {
    private int v1=10,v2 = 20;
    /*
        metodo suma con dos parametros 
        int,double
       metodo resta con dos parametros 
        float,double
    */
    public Operaciones(){
        System.out.println("La suma es: "+(v1+v2));
    }
    
    public Operaciones(int valor1, int valor2){
        System.out.println("La suma es: "+(valor1+valor2));
    }
    public Operaciones(float valor1, double valor2){
        System.out.println("La suma es: "+(valor1+valor2));
    }
    public Operaciones(double valor1, float valor2){
        System.out.println("La suma es: "+(valor1+valor2));
    }
    public Operaciones(double valor1, double valor2){
        System.out.println("La suma es: "+(valor1+valor2));
    }
    
    public void MeAdapto(String val1,String val2){
        System.out.println("La suma es: ("+(val1+val2)+")");
    }
    public void MeAdapto(double val1,double val2){
        System.out.println("La suma es: ("+(val1+val2)+")");
    }
    public void MeAdapto(float val1,float val2){
        System.out.println("La suma es: ("+(val1+val2)+")");
    }
    public void MeAdapto(int val1,int val2){
        System.out.println("La suma es: ("+(val1+val2)+")");
    }
}
