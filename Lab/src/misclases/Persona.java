package misclases;

public class Persona {

    private short edad;
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private float estatura;
    private boolean estadoCivil;

    public Persona(short edad, String nombres, String apellidos, String fechaNacimiento, float estatura, boolean estadoCivil) {
        this.apellidos = apellidos;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.estatura = estatura;
        this.fechaNacimiento = fechaNacimiento;
        this.nombres = nombres;
    }

    public short getEdad() {
        return edad;
    }

    public void setEdad(short edad) {
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public boolean isEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(boolean estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String estadoCivilTexto() {
        if (this.estadoCivil) {
            return "Casado";
        } else {
            return "Soltero";
        }
    }
}
