/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qc.hj.controller;

import java.io.IOException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller //Sera un controlador
@RequestMapping("/") //Es el contexto general donde estaran mapeadas las uri (indentificadores de recursos)son unicos no duplicados
public class ControladorHola {

    //primero hacemos el get
    //@RequestMapping(value="/hola", method=RequestMethod.GET, headers={"Accept=text/html"}
    //public @ResponseBody String holaConGet(){
    //  return "Este es mi primer controller con un GET";
    //Crear un metodo get para los usuarios que me devuelva todos
    @RequestMapping(value="/usuario", method=RequestMethod.GET,headers={"Accept=Application/json"})
         public @ResponseBody String hola()throws Exception{
        //Vamos a utilizar la implementacion de json para java de fasterxml o codehouse
       // ObjectMapper mapper = new ObjectMapper();
        return GenerarUsuarios.obtenerUsuario();
        
    }
                
        @RequestMapping(value="/usuario/id", method=RequestMethod.GET,headers={"Accept=Application/json"})
         public @ResponseBody String hola(@PathVariable Integer id)throws Exception{
         DAOUsuarioImpl du = new DAOUsuarioImpl();
         return du.obtenerUsuarioPorId(id);
} 
}