package javaapplication22;

import java.util.Iterator;
import java.util.TreeSet;

public class JavaApplication22 {

   
    public static void main(String[] args) {
        
        TreeSet<Persona> personas = new TreeSet<>();
        
        personas.add(new Persona(5));
        personas.add(new Persona(2));
        personas.add(new Persona(7));
        personas.add(new Persona(10));
        personas.add(new Persona(1));
        personas.add(new Persona(25));
        personas.add(new Persona(20));
        personas.add(new Persona(5));
        personas.add(new Persona(3));
        personas.add(new Persona(29));
        personas.add(new Persona(58));
        personas.add(new Persona(1));
        personas.add(new Persona(34));
        personas.add(new Persona(66));
        
        
        
        
        
        System.out.println(personas);
        System.out.println(personas.descendingSet());       //ARROJA POR PANTALLA LOS DATOS ASCENDENTES
        System.out.println(personas.first());               //ARROJA POR PANTALLA EL PRIMER DATO
        System.out.println(personas.last());                //ARROJA POR PANTALLA EL ULTIMO DATO
        
        personas.pollFirst();           //ELIMINA EL PRIMER DATO
        personas.pollLast();            //ELIMINA EL ULTIMO DATO
        
        System.out.println(personas);
        
        System.out.println(personas.floor(new Persona(9)));     //BUSCA EL NUMERO IGUAL O MAS CERCANO HACIA ABAJO
        System.out.println(personas.ceiling(new Persona(10)));  //BUSCA EL NUMERO IGUAL O MAS CERCANO HACIA ARRIBA
        
        Iterator<Persona> e = personas.iterator();
        
        while(e.hasNext()){                 
            Persona item = e.next();        //next para sacar el dato
            
            if(item.getEdad() % 2 == 0){                    
                e.remove();                 //remove para eliminarel dato especifico
            }
        }
        
        System.out.println(personas);
      
    }
    
}
