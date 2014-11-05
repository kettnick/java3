/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qc.hj.proyecto1.controller;

/**
 *
 * @author T107
 */
public class Cuadrado implements Superficie {
    
    private int lado;

    public Cuadrado() {
    }

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    //Codigo para sacar el calculo de el area de un cuadrado 
    // esta estructura esta mal porque no toma el atributo ni lo inicializa  lo que se tiene que hacer es que el (int lado se tiene que quitar para mandar a 
    //inicializar el atributo lado
    
    /**public String calcularArea(int lado){
         
        int area = lado*lado;
        return "El area es: "+area;
    } **/
 //Este es el correcto:

        
    public String calacularArea() {
          int area = lado*lado;
        return "El area es: "+area;

        
    }
}


