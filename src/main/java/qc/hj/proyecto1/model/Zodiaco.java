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
public class Zodiaco implements Esoterica{
     ArrayList <Signos> signo;

    public Zodiaco() {
        this.signo = new ArrayList();
        signo.add(new Signos("Aries ", "De vez en cuando surgen momentos en los que tenemos la sensación de que todo lo que podemos hacer es esforzarnos al máximo y que sea lo que Dios quiera. \n" +
"	¿Y si nuestro esfuerzo no basta? Bueno, posiblemente esa es la cuestión equivocada.\n" +
"	¿Qué se supone que vamos a hacer? ¿Lo que nos parezca? Desde temprana edad nuestros padres y maestros nos han enseñado a pensar antes de actuar.\n" +
"	Pero algunas oportunidades son fugaces. Debemos o bien actuar sin pensar o arriesgarnos a dejar escapar completamente el momento.\n" +
"	Hoy confía en tu sentido de la aventura y en tu valentía."));
        
        signo.add(new Signos("Tauro ", "El mundo está lleno de coches que no están siendo robados, de joyerías que no están siendo atracadas y de disputas que no corren ningún peligro real de acabar en trifulcas. \n" +
"	Podemos otear el horizonte buscando señales de posibles problemas y montar guardia contra actos ilícitos. \n" +
"	Lo siguiente que podemos hacer es atribuirnos el mérito de que por medio de nuestra vigilancia hemos evitado un posible problema. \n" +
"	Pero si las cosas siguen como si nada simplemente puede ser debido a que esto era todo lo que iban a hacer. \n" +
"	Hoy no te sientas excesivamente aprensiva o innecesariamente nerviosa."));
        
        signo.add(new Signos("Géminis ", "Cuando miramos la superficie de un lago ¿cómo sabemos qué hay debajo? Y si el viento está soplando y se forman ondas en el agua, \n" +
"	nuestros ojos nos dirán muy poco sobre la profundidad del lago. Donde la información es absoluta, la suposición no tiene rival. \n" +
"	Siempre es mucho más tentador esperar lo peor que llevar a cabo unos cuantos experimentos sensatos que podrían finalmente hacer que nos sintamos tranquilos.\n" +
"	En algún lugar de tu mundo algo parece peor de lo que es en realidad. \n" +
"	Hoy intenta darle el beneficio de la duda."));
        
        signo.add(new Signos("Cáncer ", "A todos nos gusta pensar que si alguna vez nos encontramos con un problema, seremos capaces de ponerlo en las manos de un experto.\n" +
"	Puede que no sepamos qué hacer, puede que otros también se sientan perplejos, pero en algún lugar habrá alguien que pueda leer todos los indicios, llegar a una conclusión y poner en marcha un plan. \n" +
"	Si extendieras de manera natural tal confianza hasta alguien que pueda ayudarte, \n" +
"	¿por qué poner en duda la certeza que tiene otra persona de que eres para ella una fuente ideal de ayuda y apoyo? Hoy haz lo que se te da bien hacer y alégrate de tu don."));

        signo.add(new Signos("Leo ", "¿Estás observando una situación a través de un telescopio o lo haces por un microscopio? \n" +
"	¿Te estás convenciendo de que una serie de sucesos está más cerca de ti (en el espacio o quizá en el tiempo) de lo que lo están en realidad y por lo tanto importan más de lo que de verdad importan? \n" +
"	Las dos clases de aumento tienen el poder de distorsionar la realidad. Tal vez la única manera de aclararte con lo que estás mirando sea intentar no mirarlo más a través de cualquier clase de lentes y filtros. \n" +
"	Hoy intenta alcanzar la objetividad y la neutralidad."));
        
        signo.add(new Signos("Virgo ", "En principio, la gente puede conseguir mucho más por medio del trabajo en equipo de lo que pueden lograr yendo cada uno por su lado. Pero tienen que quererlo. \n" +
"	Si los distintos miembros posibles de cualquier grupo sólo están interesados en criticarse entre ellos o en aventajarse unos a otros, sus esfuerzos combinados serán chapuceros e infructuosos, como poco. \n" +
"	Aunque lo que ha pasado recientemente te ha hecho perder la fe en la idea de que alguna vez podría haber la capacidad de unirse en torno a una causa común, lo que está por venir sugiere de algún modo que tal situación es probable."));
        
        signo.add(new Signos("Libra ", "El problema no es lo que tienes. Ni reside en lo que parece haber salido mal. Los recursos que necesitas para satisfacer una meta en particular son todos, a todos los efectos, alcanzables. O al menos, lo son los recursos materiales, físicos. Los mecanismos emocionales y de apoyo psicológico son los que últimamente han estado escaseando preocupantemente. No te has sentido capaz de entregarte en cuerpo y alma a una situación pero ahora estás viendo una buena razón para creer en ella. Y dentro de poco el mundo verá una razón para creer en ti."));
        
        signo.add(new Signos("Escorpio ", "¿Qué te da el derecho a hacer girar el bastón de mando y pasearte al frente del desfile vistiendo el gran sombrero de copa? ¿No debería dejarse esta actividad extrovertida en manos de los que tienen más entusiasmo y arrogancia? ¿No estás mejor en algún lugar de la sala de máquinas, dedicando tus facultades críticas a cuestiones de matices y detalles? Parecería que en un área clave de la vida, no sólo eres la persona ideal para ocupar el primer plano y reunir a las tropas sino, muy posiblemente, la única candidata creíble para el papel. Supera tu reticencia. Yérguete. Ponte bien derecha."));
        
        signo.add(new Signos("Sagitario ", "¿Cuánta cantidad es demasiada? Es posible que este momento crítico se alcance más o menos al mismo tiempo que lo suficiente ¡empieza a parecer insuficiente! Raras veces tendemos a pensar muy detenidamente en cómo dividimos exactamente nuestro tiempo y atención. Seguimos teniendo que correr alrededor del carro, engrasando las chirriantes ruedas y en raras ocasiones tenemos la oportunidad de parar y preguntarnos si no habrá mejores lugares en los que invertir nuestra energía y concentración. La vida te está invitando ahora a contemplar un cambio de estilo de vida que debía haberse hecho hace mucho tiempo."));
        
        signo.add(new Signos("Capricornio ", "Cuidado con donde dejas hoy tu escoba. Si no, el gato saltará sobre ella y los dos saldrán volando juntos a campo abierto antes de que hayas tenido la más mínima oportunidad de montarte tú también en la escoba. ¿Sospechas, por la viva naturaleza de esta descripción inicial, que estoy sugiriendo que es posible que tengas habilidades mágicas, tal vez de proporciones míticas? ¿Qué te da esa idea? ¿Por qué ibas pensar eso cuando todo lo que te rodea ahora son ejemplos de la sorprendente serendipia que no deja de surgir? Hoy sé la dueña de tu poder"));
        
        signo.add(new Signos("Acuario ", "No son precisamente los planes más minuciosos de ratones y hombres los que, en palabras del bardo escocés, \"gang aft agley\" (a menudo fracasan). Incluso seres muy superiores a los hombres (como, por ejemplo, las mujeres) pueden verse de vez en cuando frente a una situación que ha conducido a un resultado inesperado. Tal vez se pregunten \"¿por qué han salido las cosas de esta manera?\" En algún lugar de tu mundo está teniendo lugar un proceso de contabilidad inversa. Tienes una respuesta pero no puedes entender completamente la pregunta que tiene que haber conducido a ella. Quizá tenga que seguir siendo un misterio."));
        
        signo.add(new Signos("Piscis ", "Cuando la gente se siente obligada a tomar una decisión difícil, y en especial cuando se sienten avergonzados de admitir que tienen una preferencia, puede que sencillamente opten por no pensar en lo que están haciendo - o no están haciendo. Simplemente siguen lo que parece ser el camino de menor resistencia hasta que éste les conduce a un resultado decisivo y quizás irrevocable. Entonces pueden hacerse los sorprendidos. ¿Es así como ha sido dirigida recientemente una barca en tu mundo? ¿Y hay algo que va muy mal en el puerto al que ha llegado?."));
    }
    
    public String futuro(String parametro) {
       String futuroT = "";
       
        for(Signos s:signo){
            if(parametro.equalsIgnoreCase(s.getSigno())){
            futuroT= s.getPrediccion();
        
            }
        } 
        
        return futuroT;
    }
    
    
    
}
