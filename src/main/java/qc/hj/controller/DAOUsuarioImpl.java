/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qc.hj.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import org.codehaus.jackson.map.ObjectMapper;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import qc.hj.proyecto1.controller.HibernateUtilidades;
import qc.hj.proyecto1.controller.Usuario;

/**
 *
 * @author T107
 */
public class DAOUsuarioImpl {

    public String obtenerTodos () throws Exception{
    SessionFactory factory = HibernateUtilidades.getSessionFactory();
    Session sesion = factory.openSession();
    Transaction tranza = sesion.beginTransaction();
    
      Criteria cri = sesion.createCriteria(Usuario.class);
      ArrayList <Usuario> usuarios =  (ArrayList <Usuario>) cri.list();
      Map<String, ArrayList <Usuario>> singletonMap = Collections.singletonMap("usuarios", usuarios);    
    
      ObjectMapper mapper = new ObjectMapper();
      
      tranza.commit();
      sesion.close();
      return mapper.writeValueAsString(singletonMap);
    }
    
    
    public String obtenerUsuarioPorId() throws Exception{
    SessionFactory factory = HibernateUtilidades.getSessionFactory();
    Session sesion = factory.openSession();
    Transaction tranza = sesion.beginTransaction();
    
      Criteria cri = sesion.createCriteria(Usuario.class).add(Restrictions.idEq(1));
      Usuario u = (Usuario) cri.uniqueResult();
      tranza.commit();
      sesion.close();
      
      ObjectMapper mapper = new ObjectMapper();
      return mapper.writeValueAsString(u);
}
}
