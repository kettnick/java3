/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package qc.hj.proyecto1.model;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author T
 */
public class ServletBuscarHoroscopo extends HttpServlet {

    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) //solo lleva dos m�todos (request "pide info"  /  response "responde")
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        //response.setContentType("application/vnd.ms-excel");
        PrintWriter out= response.getWriter();
        String nombre = request.getParameter("nombre");
        String signo = request.getParameter("signo");
        
        Pitoniza pito = new Pitoniza (new Zodiaco());
       
        out.println("Bienvenida Putita :D " + nombre +" a mi servlet " +signo);
        out.println("Tu horoscopo es: " + pito.obtenerFuturo(signo));
        
        
    }
}
