package javaapplication22;


public class Persona implements Comparable<Persona>{
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString(){
        return edad + "";
    }
    
    
    @Override
    public int compareTo(Persona o){
        int valor = edad - o.edad;
        
        if(valor == 0){
            return 1;
        }
        
        return valor;
    }
}
