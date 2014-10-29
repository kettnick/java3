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
        signo.add(new Signos("Aries ", "De vez en cuando surgen momentos en los que tenemos la sensaci�n de que todo lo que podemos hacer es esforzarnos al m�ximo y que sea lo que Dios quiera. \n" +
"	�Y si nuestro esfuerzo no basta? Bueno, posiblemente esa es la cuesti�n equivocada.\n" +
"	�Qu� se supone que vamos a hacer? �Lo que nos parezca? Desde temprana edad nuestros padres y maestros nos han ense�ado a pensar antes de actuar.\n" +
"	Pero algunas oportunidades son fugaces. Debemos o bien actuar sin pensar o arriesgarnos a dejar escapar completamente el momento.\n" +
"	Hoy conf�a en tu sentido de la aventura y en tu valent�a."));
        
        signo.add(new Signos("Tauro ", "El mundo est� lleno de coches que no est�n siendo robados, de joyer�as que no est�n siendo atracadas y de disputas que no corren ning�n peligro real de acabar en trifulcas. \n" +
"	Podemos otear el horizonte buscando se�ales de posibles problemas y montar guardia contra actos il�citos. \n" +
"	Lo siguiente que podemos hacer es atribuirnos el m�rito de que por medio de nuestra vigilancia hemos evitado un posible problema. \n" +
"	Pero si las cosas siguen como si nada simplemente puede ser debido a que esto era todo lo que iban a hacer. \n" +
"	Hoy no te sientas excesivamente aprensiva o innecesariamente nerviosa."));
        
        signo.add(new Signos("G�minis ", "Cuando miramos la superficie de un lago �c�mo sabemos qu� hay debajo? Y si el viento est� soplando y se forman ondas en el agua, \n" +
"	nuestros ojos nos dir�n muy poco sobre la profundidad del lago. Donde la informaci�n es absoluta, la suposici�n no tiene rival. \n" +
"	Siempre es mucho m�s tentador esperar lo peor que llevar a cabo unos cuantos experimentos sensatos que podr�an finalmente hacer que nos sintamos tranquilos.\n" +
"	En alg�n lugar de tu mundo algo parece peor de lo que es en realidad. \n" +
"	Hoy intenta darle el beneficio de la duda."));
        
        signo.add(new Signos("C�ncer ", "A todos nos gusta pensar que si alguna vez nos encontramos con un problema, seremos capaces de ponerlo en las manos de un experto.\n" +
"	Puede que no sepamos qu� hacer, puede que otros tambi�n se sientan perplejos, pero en alg�n lugar habr� alguien que pueda leer todos los indicios, llegar a una conclusi�n y poner en marcha un plan. \n" +
"	Si extendieras de manera natural tal confianza hasta alguien que pueda ayudarte, \n" +
"	�por qu� poner en duda la certeza que tiene otra persona de que eres para ella una fuente ideal de ayuda y apoyo? Hoy haz lo que se te da bien hacer y al�grate de tu don."));

        signo.add(new Signos("Leo ", "�Est�s observando una situaci�n a trav�s de un telescopio o lo haces por un microscopio? \n" +
"	�Te est�s convenciendo de que una serie de sucesos est� m�s cerca de ti (en el espacio o quiz� en el tiempo) de lo que lo est�n en realidad y por lo tanto importan m�s de lo que de verdad importan? \n" +
"	Las dos clases de aumento tienen el poder de distorsionar la realidad. Tal vez la �nica manera de aclararte con lo que est�s mirando sea intentar no mirarlo m�s a trav�s de cualquier clase de lentes y filtros. \n" +
"	Hoy intenta alcanzar la objetividad y la neutralidad."));
        
        signo.add(new Signos("Virgo ", "En principio, la gente puede conseguir mucho m�s por medio del trabajo en equipo de lo que pueden lograr yendo cada uno por su lado. Pero tienen que quererlo. \n" +
"	Si los distintos miembros posibles de cualquier grupo s�lo est�n interesados en criticarse entre ellos o en aventajarse unos a otros, sus esfuerzos combinados ser�n chapuceros e infructuosos, como poco. \n" +
"	Aunque lo que ha pasado recientemente te ha hecho perder la fe en la idea de que alguna vez podr�a haber la capacidad de unirse en torno a una causa com�n, lo que est� por venir sugiere de alg�n modo que tal situaci�n es probable."));
        
        signo.add(new Signos("Libra ", "El problema no es lo que tienes. Ni reside en lo que parece haber salido mal. Los recursos que necesitas para satisfacer una meta en particular son todos, a todos los efectos, alcanzables. O al menos, lo son los recursos materiales, f�sicos. Los mecanismos emocionales y de apoyo psicol�gico son los que �ltimamente han estado escaseando preocupantemente. No te has sentido capaz de entregarte en cuerpo y alma a una situaci�n pero ahora est�s viendo una buena raz�n para creer en ella. Y dentro de poco el mundo ver� una raz�n para creer en ti."));
        
        signo.add(new Signos("Escorpio ", "�Qu� te da el derecho a hacer girar el bast�n de mando y pasearte al frente del desfile vistiendo el gran sombrero de copa? �No deber�a dejarse esta actividad extrovertida en manos de los que tienen m�s entusiasmo y arrogancia? �No est�s mejor en alg�n lugar de la sala de m�quinas, dedicando tus facultades cr�ticas a cuestiones de matices y detalles? Parecer�a que en un �rea clave de la vida, no s�lo eres la persona ideal para ocupar el primer plano y reunir a las tropas sino, muy posiblemente, la �nica candidata cre�ble para el papel. Supera tu reticencia. Y�rguete. Ponte bien derecha."));
        
        signo.add(new Signos("Sagitario ", "�Cu�nta cantidad es demasiada? Es posible que este momento cr�tico se alcance m�s o menos al mismo tiempo que lo suficiente �empieza a parecer insuficiente! Raras veces tendemos a pensar muy detenidamente en c�mo dividimos exactamente nuestro tiempo y atenci�n. Seguimos teniendo que correr alrededor del carro, engrasando las chirriantes ruedas y en raras ocasiones tenemos la oportunidad de parar y preguntarnos si no habr� mejores lugares en los que invertir nuestra energ�a y concentraci�n. La vida te est� invitando ahora a contemplar un cambio de estilo de vida que deb�a haberse hecho hace mucho tiempo."));
        
        signo.add(new Signos("Capricornio ", "Cuidado con donde dejas hoy tu escoba. Si no, el gato saltar� sobre ella y los dos saldr�n volando juntos a campo abierto antes de que hayas tenido la m�s m�nima oportunidad de montarte t� tambi�n en la escoba. �Sospechas, por la viva naturaleza de esta descripci�n inicial, que estoy sugiriendo que es posible que tengas habilidades m�gicas, tal vez de proporciones m�ticas? �Qu� te da esa idea? �Por qu� ibas pensar eso cuando todo lo que te rodea ahora son ejemplos de la sorprendente serendipia que no deja de surgir? Hoy s� la due�a de tu poder"));
        
        signo.add(new Signos("Acuario ", "No son precisamente los planes m�s minuciosos de ratones y hombres los que, en palabras del bardo escoc�s, \"gang aft agley\" (a menudo fracasan). Incluso seres muy superiores a los hombres (como, por ejemplo, las mujeres) pueden verse de vez en cuando frente a una situaci�n que ha conducido a un resultado inesperado. Tal vez se pregunten \"�por qu� han salido las cosas de esta manera?\" En alg�n lugar de tu mundo est� teniendo lugar un proceso de contabilidad inversa. Tienes una respuesta pero no puedes entender completamente la pregunta que tiene que haber conducido a ella. Quiz� tenga que seguir siendo un misterio."));
        
        signo.add(new Signos("Piscis ", "Cuando la gente se siente obligada a tomar una decisi�n dif�cil, y en especial cuando se sienten avergonzados de admitir que tienen una preferencia, puede que sencillamente opten por no pensar en lo que est�n haciendo - o no est�n haciendo. Simplemente siguen lo que parece ser el camino de menor resistencia hasta que �ste les conduce a un resultado decisivo y quiz�s irrevocable. Entonces pueden hacerse los sorprendidos. �Es as� como ha sido dirigida recientemente una barca en tu mundo? �Y hay algo que va muy mal en el puerto al que ha llegado?."));
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
