/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qc.hj.controller;


public class ProbarAreas {
    
    static ServicioSuperficie superficie;

   
    public static void main(String[] args) {
        
        ServicioSuperficie superficie = new ServicioSuperficie();
        System.out.println(superficie.servicioArea());
        
    }
    
}
