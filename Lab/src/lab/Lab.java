package lab;

import misclases.Industria;
import misclases.IndustriaInfo;
import misclases.Persona;
import misclases.Planeta;

public class Lab {

    public static void main(String[] args) {

        /*Ejercicio 1 - Persona*/
        System.out.println("---------------------------- Persona ----------------------------");
        Persona persona = new Persona((short) 40, "Juan", "Perez", "1/1/2000", 150f, true);

        /*Imprimiendo datos*/
        System.out.println("Nombre:" + persona.getNombres() + "\n"
                + "Apellidos:" + persona.getApellidos() + "\n"
                + "F. N:" + persona.getFechaNacimiento() + "\n"
                + "Edad:" + persona.getEdad() + "\n"
                + "E. C." + persona.isEstadoCivil());

        /*Ejercicio 2 - Planeta*/
        System.out.println("---------------------------- Planeta ----------------------------");
        Planeta planeta = new Planeta("P.123", "Carbono", 10000000, 9.8f, false, 123451, 100000, 50000);

        System.out.println("Nombre:" + planeta.getNombre() + "\n"
                + "Atmósfera:" + planeta.getTipoAtmosfera() + "\n"
                + "Tamaño:" + planeta.getDimension() + "\n"
                + "Gravedad:" + planeta.getGravedad() + "\n"
                + "¿Hay Vida?:" + planeta.isVida() + "\n"
                + "T. Ciclo:" + planeta.getTiempoCiclo() + "\n"
                + "Radio O.:" + planeta.getRadioOrbita() + "\n"
                + "V. T.:" + planeta.getVelTraslacion());

        /*
        1.- Incluir un método que reciba como parámetro el porcentaje que lleva antes de
        completar un ciclo y retorne el tiempo que falta.
        2.- Incluir un método que retorne en una cadena el nombre del planeta(Todo en
        mayúscula) más su tamaño.
         */
        System.out.println("Tiempo finalizar ciclo(80%):" + planeta.tiempoFinalizarCiclo(80));
        System.out.println("Planeta: " + planeta.NombreConFormato());

        /*Ejercicio 3 - Industria*/
        System.out.println("---------------------------- Industria ----------------------------");
        Persona presidente = new Persona((short) 40, "Mario", "Perez", "1/1/2000", 150f, true);
        Industria industria = new Industria("Madera", "Papel", 1000000, "1/1/1850", presidente);

        System.out.println("Tipo industria:" + industria.getTipoIndustria() + "\n"
                + "Material producción:" + industria.getMaterialProduccion() + "\n"
                + "Ganancias al año: $" + industria.getGananciaAnio() + "\n"
                + "Fecha fundación:" + industria.getFechaFundacion() + "\n"
                + "Presidente actual:" + industria.getPresidente().getNombres() + " " + industria.getPresidente().getApellidos());

        /*
        Incluir un método que reciba X cantidad de material y regrese la siguiente
        información:        
        1.- Tiempo que le toma en trasformar ese material en un producto.
        2.- Cuánto producto logra crear.
        3.- Cuánto es el valor del producto por unidad
        4.- Valor total de ganancias.
        
        Pd: Para entregar la información lo que se realiza es crear una nueva clase y dicha instancia es la que se 
        envía(IndustriaInfo.java).
         */
        System.out.println("---------------------------- Industria Datos ----------------------------");
        IndustriaInfo industriaInfo = industria.produccionInforme(10);
        System.out.println("Tiempo producción:" + industriaInfo.getTiempoTransformarMaterial() + "\n"
                + "Producción creada:" + industriaInfo.getProductoCreado() + "\n"
                + "Valor unidad: $" + industriaInfo.getValorProductoUnidad() + "\n"
                + "Total ganancias: $" + industriaInfo.getValorTotalGanancias());
    }

}
