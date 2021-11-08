package misclases;

public class Industria {

    private String tipoIndustria;
    private String materialProduccion;
    private double gananciaAnio;
    private String fechaFundacion;

    /*Como anteriormente se creó la clase Persona - Se puede utilizar como grupo de datos*/
    private Persona presidente;

    public Industria(String tipoIndustria, String materialProduccion, double gananciaAnio, String fechaFundacion, Persona presidente) {
        this.tipoIndustria = tipoIndustria;
        this.materialProduccion = materialProduccion;
        this.gananciaAnio = gananciaAnio;
        this.fechaFundacion = fechaFundacion;
        this.presidente = presidente;
    }

    public String getTipoIndustria() {
        return tipoIndustria;
    }

    public void setTipoIndustria(String tipoIndustria) {
        this.tipoIndustria = tipoIndustria;
    }

    public String getMaterialProduccion() {
        return materialProduccion;
    }

    public void setMaterialProduccion(String materialProduccion) {
        this.materialProduccion = materialProduccion;
    }

    public double getGananciaAnio() {
        return gananciaAnio;
    }

    public void setGananciaAnio(double gananciaAnio) {
        this.gananciaAnio = gananciaAnio;
    }

    public String getFechaFundacion() {
        return fechaFundacion;
    }

    public void setFechaFundacion(String fechaFundacion) {
        this.fechaFundacion = fechaFundacion;
    }

    public Persona getPresidente() {
        return presidente;
    }

    public void setPresidente(Persona presidente) {
        this.presidente = presidente;
    }

    public IndustriaInfo produccionInforme(float material) {
        /*Ejemplo de datos - Puede ser cualquier valor - Estos datos también pueden presentarse en los atributos o
        ser ingresados por el constructor en el caso que cada instancia varíe su nivel de producción*/
        float velocidadProduccion = 2; //2 unidades por segundo
        float ratioProduccion = 5f;// Por cada 5 de material se crea 1 de producción
        float valorProductoUnidad = 5;//Por cada unidad producida se obtiene 5 de ganancias.

        float totalProduccionMaterial = material / ratioProduccion;
        float tiempoTotalProduccion = material / velocidadProduccion;
        float gananciaTotal = valorProductoUnidad * totalProduccionMaterial;

        return new IndustriaInfo(tiempoTotalProduccion, totalProduccionMaterial, valorProductoUnidad, gananciaTotal);
    }
}
