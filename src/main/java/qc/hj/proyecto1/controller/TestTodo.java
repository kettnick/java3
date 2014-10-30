/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qc.hj.proyecto1.controller;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author T
 */
public class TestTodo {

    
    public static void main(String[] args) {
      
        //Paso1.- abrir la sesion-factory
        SessionFactory factory = HibernateUtilidades.getSessionFactory();
              
                Session sesion = factory.openSession();
        
                //Empezar una transa acción
        Transaction tranza = sesion.beginTransaction();
        
        //para busqueda por id :
                    Trabajador uno = (Trabajador)sesion.createCriteria(Trabajador.class).add(Restrictions.idEq(1)).uniqueResult();
          
                    tranza.commit();
            
            //Cerramos la sesion, es decir devolvemos la libertar al borrador
                    sesion.close();
        
         
          // para buscar todos:
               // ArrayList<Trabajador> tra = (ArrayList<Trabajador>)sesion.createCriteria(Trabajador.class).list();
                
                
       //acutualizar            
                //sesion.update(new Trabajador(2,"tara","de","dos patas"));
                
       //Borrar:
                //sesion.delete(new Trabajador(1));
        
                
                
        // Haremos un insert
                 // Trabajador t = (new Trabajador ("Juan", "Campos", "Martinez");
       
        // para guardar:   
                 // sesion.save(new Trabajador ("abdia","garcia","arias"));
        
            //Liberamos la transaccion
    }
    
}
