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
public class Chiste {
    
    private String nombre;
    private String chiste;

    public Chiste() {
    }
    
    public Chiste(String nombre, String chiste) {
        this.nombre = nombre;
        this.chiste = chiste;
    }

    public String getChiste() {
        return chiste;
    }

    public void setChiste(String chiste) {
        this.chiste = chiste;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
}
