/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Nomina;

import qc.hj.proyecto1.controller.Trabajador;
import qc.hj.proyecto1.controller.Nomina;


public class TestTodo {
    
    public static void main (String args[]){
        //Primero creamos un trabajador
        
        Trabajador t = new Trabajador(1, "kett", 40, 200);
        Nomina n = new Nomina(t);
        n.pagarNomina();
    }
}
