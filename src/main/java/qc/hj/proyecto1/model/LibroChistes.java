/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qc.hj.proyecto1.model;

import java.util.ArrayList;

/**
 *
 * @author sistemas
 */
public class LibroChistes implements Esoterica {
    ArrayList <Chiste> chistes;
    
    public LibroChistes(){
        
        this.chistes = new ArrayList();
        chistes.add(new Chiste("Animales", "En la selva había una trampa, y en ella cayeron atrapados un león y un burro. El león al ver al burro temblando de susto le dice: \n" +
"\n" +
"Tranquilo viejo, yo no como burros, a mí me gustan los venados. \n" +
"\n" +
"Y el burro se tranquiliza, pero pasaban los días y nada de comida. El león con hambre, el burro arrinconado en la trampa le recuerda que no le gusta la carne de burro, y el león contesta: \n" +
"\n" +
"¡Sí viejo, pero hoy amaneciste con una cara de venado! "));
        
        chistes.add(new Chiste("Amigas", "En la selva había una trampa, y en ella cayeron atrapados un león y un burro. El león al ver al burro temblando de susto le dice: \n" +
"\n" +
"Tranquilo viejo, yo no como burros, a mí me gustan los venados. \n" +
"\n" +
"Y el burro se tranquiliza, pero pasaban los días y nada de comida. El león con hambre, el burro arrinconado en la trampa le recuerda que no le gusta la carne de burro, y el león contesta: \n" +
"\n" +
"¡Sí viejo, pero hoy amaneciste con una cara de venado! "));
        
        chistes.add(new Chiste("Profesiones", "— ¿Qué es un niño complejo? \n" +
"— R: Un niño con una madre real y un padre imaginario. "));
        
        chistes.add(new Chiste("Personajes", "se encuentran dos espemios y uno le pregunta al otro, ¿tu sabes cuanto nos falta para llegar al ovario? el otro respondeme : Lo unico que se es que recien vamos en la garganta. chaoooooo. "));
        
        chistes.add(new Chiste("Cortos", "Si una mujer y un hombre se tiran de un rascacielos. \n" +
"¿Quién llega antes al suelo? \n" +
"RTA: El hombre, porque la mujer se queda arriba limpiando los cristales. "));
                
        chistes.add(new Chiste("Ingenieros", "¿Qué pasa si n tiende a infinito? Respuesta: Infinito se seca."));

        chistes.add(new Chiste("Estudiantes", "Había una profe que iba preguntando a algunos alumnos lo que querías ser cuando grande: \n" +
"-Pablo que quieres ser cuando grande? \n" +
"-Doctor profesora  \n" +
"- que bien : )\n" +
"-y tu Gloria? ) \n" +
"- yo quiero ser abogada\n" +
"-que interesante \n" +
"-y tu Rosita? \n" +
"- yo quiero ser mama! \n" +
"-ooh que bueno..\n" +
" \n" +
"- y tu Juanito\n" +
"- yo quiero ser el esposo de Rosita"));       
        
    }
    public String futuro(String parametro) {
        String futuroTu = "";
        
        for( Chiste c : chistes) {
            
            if(parametro.equalsIgnoreCase(c.getNombre())){
            futuroTu=c.getChiste();
            }
        }
        
    return futuroTu;    
    }
    
    
    
}
