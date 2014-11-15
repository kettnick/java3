/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qc.hj.proyecto1.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ProbarUsuarioDirecciones {

    
    public static void main(String[] args) {
        
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
        Session sesion = factory.openSession();
        Transaction tranza = sesion.beginTransaction();
        
        Usuario u = new Usuario();
        Direccion d = new Direccion();
        
        d.setCalle("calle de la amargura");
        d.setColonia("Colonia de avon3");
        d.setCp(55123);
        d.setEstado("Ebriedad3");
        
        //Importante ligar al usuario anterior esta direccion
        
        d.setIdUsuario(u);
        u.setDireccion(d);
        
        u.setEdad(43);
        u.setNombre("juan Carlos");
        u.setSueldo(4000f);
        
        sesion.save(u);
        sesion.save(d);
        
        tranza.commit();
        sesion.close();
        System.out.println("Todo salio bien!!");
        
        
        
    }
    
}
