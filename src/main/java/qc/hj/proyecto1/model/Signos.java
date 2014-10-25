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
public class Signos {
    
    private String signo;
    private String prediccion;

    public Signos() {
    }

    public Signos(String signo, String prediccion) {
        this.signo = signo;
        this.prediccion = prediccion;
    }

    public String getPrediccion() {
        return prediccion;
    }

    public void setPrediccion(String prediccion) {
        this.prediccion = prediccion;
    }

    public String getSigno() {
        return signo;
    }

    public void setSigno(String signo) {
        this.signo = signo;
    }
    
}
