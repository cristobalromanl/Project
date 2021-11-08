
package proyectox;


public class ProyectoX 
{


    public static void main(String[] args)
    {
        Persona cliente = new Persona ( (short)20,"Juan","Rojas","20101999",1.92f,"casado");
        System.out.println(cliente.getNombre()+" "+cliente.getApellido());
        System.out.println(cliente.getFecha());
        System.out.println(cliente.getEstCivil());
        System.out.println(cliente.getEstatura());
        System.out.println(cliente.getEdad());
    }
    
   

}
