/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qc.hj.proyecto1.controller;

/**
 *
 * @author T
 */
public class Nomina {
 
    private Trabajador t;

    public Nomina(Trabajador t) {
        this.t = t;
    }
    
    public Nomina() {
    }
    
    public float pagarNomina(){
        float pago = t.getHoras_laboradas()*t.getSueldoBase();
        System.out.println("Se pago la nomina de " + t.getNombre()+" por " +pago);
        return pago;
        
    }
    
}
