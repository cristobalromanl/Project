package misclases;

public class IndustriaInfo {

    private float tiempoTransformarMaterial;
    private float productoCreado;
    private float valorProductoUnidad;
    private double valorTotalGanancias;

    public IndustriaInfo(float tiempoTransformarMaterial, float productoCreado, float valorProductoUnidad, double valorTotalGanancias) {
        this.tiempoTransformarMaterial = tiempoTransformarMaterial;
        this.productoCreado = productoCreado;
        this.valorProductoUnidad = valorProductoUnidad;
        this.valorTotalGanancias = valorTotalGanancias;
    }

    public float getTiempoTransformarMaterial() {
        return tiempoTransformarMaterial;
    }

    public float getProductoCreado() {
        return productoCreado;
    }

    public float getValorProductoUnidad() {
        return valorProductoUnidad;
    }

    public double getValorTotalGanancias() {
        return valorTotalGanancias;
    }
}
