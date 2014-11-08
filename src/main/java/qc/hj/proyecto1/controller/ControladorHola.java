/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qc.hj.proyecto1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Sera un controlador
@RequestMapping("/") //Es el contexto general donde estaran mapeadas las uri (indentificadores de recursos)son unicos no duplicados
public class ControladorHola {

    //primero hacemos el get
    
    @RequestMapping(value="/hola", method=RequestMethod.GET, headers={"Accept=text/html"})
    
    public @ResponseBody String holaConGet(){
        return "Este es mi primer controller con un GET";
    }
}
