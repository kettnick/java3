/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qc.hj.proyecto1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ServletActualizarTrabajador extends HttpServlet {

 
    protected void doPut (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
       SessionFactory factory = HibernateUtilidades.getSessionFactory();
       Session sesion = factory.openSession();
       Transaction tranza = sesion.beginTransaction();
       String id = request.getParameter("id");
       String nombre = request.getParameter("Nombre");
       String paterno = request.getParameter("Paterno");
       String materno = request.getParameter("Materno");
       Trabajador t = new Trabajador ();
       t.setIdTrabajador(new Integer(id));
       t.setNombre(nombre);
       t.setPaterno(paterno);
       t.setMaterno(materno);
       sesion.update(t);
       tranza.commit();
       sesion.close();
       
       out.println("tabajador actualizado");
       
    }

}
