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
public class Trabajador {
    
    private int id;
    private String nombre;
    private int horas_laboradas;
    private float sueldoBase;

    public Trabajador() {
    }

    @Override
    public String toString() {
        return "Trabajador{" + "id=" + id + ", nombre=" + nombre + ", horas_laboradas=" + horas_laboradas + ", sueldoBase=" + sueldoBase + '}';
    }

    public Trabajador(int id, String nombre, int horas_laboradas, float sueldoBase) {
        this.id = id;
        this.nombre = nombre;
        this.horas_laboradas = horas_laboradas;
        this.sueldoBase = sueldoBase;
    }

    public float getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(float sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras_laboradas() {
        return horas_laboradas;
    }

    public void setHoras_laboradas(int horas_laboradas) {
        this.horas_laboradas = horas_laboradas;
    }
    
}
