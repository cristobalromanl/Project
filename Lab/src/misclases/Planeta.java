package misclases;

public class Planeta {

    private String nombre;
    private String tipoAtmosfera;
    private float dimension;//Hace referencia a Tamaño
    private float gravedad;
    private boolean isVida;
    private float tiempoCiclo;
    private float radioOrbita;
    private float velTraslacion;

    public Planeta(String nombre, String tipoAtmosfera, float dimension, float gravedad, boolean isVida, float tiempoCiclo, float radioOrbita, float velTraslacion) {
        this.nombre = nombre;
        this.tipoAtmosfera = tipoAtmosfera;
        this.dimension = dimension;
        this.gravedad = gravedad;
        this.isVida = isVida;
        this.tiempoCiclo = tiempoCiclo;
        this.radioOrbita = radioOrbita;
        this.velTraslacion = velTraslacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAtmosfera() {
        return tipoAtmosfera;
    }

    public void setTipoAtmosfera(String tipoAtmosfera) {
        this.tipoAtmosfera = tipoAtmosfera;
    }

    public float getDimension() {
        return dimension;
    }

    public void setDimension(float dimension) {
        this.dimension = dimension;
    }

    public float getGravedad() {
        return gravedad;
    }

    public void setGravedad(float gravedad) {
        this.gravedad = gravedad;
    }

    public boolean isVida() {
        return isVida;
    }

    public void setIsVida(boolean isVida) {
        this.isVida = isVida;
    }

    public float getTiempoCiclo() {
        return tiempoCiclo;
    }

    public void setTiempoCiclo(float tiempoCiclo) {
        this.tiempoCiclo = tiempoCiclo;
    }

    public float getRadioOrbita() {
        return radioOrbita;
    }

    public void setRadioOrbita(float radioOrbita) {
        this.radioOrbita = radioOrbita;
    }

    public float getVelTraslacion() {
        return velTraslacion;
    }

    public void setVelTraslacion(float velTraslacion) {
        this.velTraslacion = velTraslacion;
    }

    public float tiempoFinalizarCiclo(float porcentaje) {
        return this.tiempoCiclo * (1 - (porcentaje / 100));
    }

    public String NombreConFormato() {
        return "Nombre: " + nombre.toUpperCase() + " Tamaño:" + dimension;
    }
}
