/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qc.hj.controller;

/**
 *
 * @author T107
 */
public class Direccion {
    
    private String calle;
    private String colonia;
    private String estado;

    public Direccion() {
    }

    public Direccion(String calle, String colonia, String estado) {
        this.calle = calle;
        this.colonia = colonia;
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", colonia=" + colonia + ", estado=" + estado + '}';
    }
    
    
}
