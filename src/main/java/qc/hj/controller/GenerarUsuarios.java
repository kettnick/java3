
package qc.hj.controller;


import java.util.ArrayList;
import qc.hj.proyecto1.controller.Usuario;


public class GenerarUsuarios {
    
    public static String obtenerUsuario() throws Exception {
      DAOUsuarioImpl du = new DAOUsuarioImpl();
      
      return du.obtenerTodos();
     
    }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /*
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        //Primero creamos tres direcciones
        Direccion d1 = new Direccion("Calle de la muerte", "Azteca", "México");
        Direccion d2 = new Direccion("Calle de la amargura", "Ensenada", "Baja California");
        Direccion d3 = new Direccion("Calle 13", "Ska", "Puerto Rico");
        
        //Ahora asocioamos las direcciones a sus usuarios
        
        Usuario u1 = new Usuario ("Kett", 21, 45000, d1);
        Usuario u2 = new Usuario ("Campos", 43, 85000, d2);
        Usuario u3 = new Usuario ("Haruz", 21, 50000, d3);
        
        usuarios.add(u1);
        usuarios.add(u2);
        usuarios.add(u3);
        
        return usuarios;
        
    }
}
*/
        
        
        
        