/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qc.hj.proyecto1.model;

/**
 *
 * @author sistemas
 */
public class Pitoniza {
    
    Esoterica eso;

    public Pitoniza(Esoterica eso) {
        this.eso = eso;
    }  
    
    public String obtenerFuturo (String parametro){
        
        return eso.futuro(parametro);
        
    }
    
}
