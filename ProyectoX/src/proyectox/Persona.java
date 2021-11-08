
package proyectox;

public class Persona
{
    private short edad;     // ATRIBUTOS
    private String nombre;
    private String apellido;
    private String fecha;
    private float estatura;
    private String estCivil;
    
    public Persona( short edad, String nombre, String apellido, String fecha, float estatura, String estCivil)
{
    this.edad = edad;
    this.nombre = nombre;
    this.apellido = apellido;
    this.fecha = fecha;
    this.estCivil = estCivil;
    this.estatura = estatura;
}

    public void setNombre ( String nombre)
    {
        this.nombre = nombre;    
    }
    
       public String getNombre()
    {
        return this.nombre;
    }
    
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public void setEdad(short edad)
    {
        this.edad=edad;
    }
    
    public short getEdad()
    {
        return edad;
    }
    
     public void setFecha(String fecha)
     {
         this.fecha=fecha;
     }
     
     public String getFecha()
     {
         return fecha;
     }
    
     public void setEstatura( float estatura)
     {
         this.estatura=estatura;
     }
    
     public float getEstatura()
     {
         return estatura;
     }
     
     public void setEstCivil( String estCivil)
     {
         this.estCivil=estCivil;
     }
     
     public String getEstCivil()
     {
         return estCivil;
     }
    
    
}


