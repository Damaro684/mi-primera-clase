public class PisoDeAlquiler {
    
    // Ubicacion del piso
    private String inquilino;
    // Precio del alquiler
    private int precioAlquiler;
    // Alquilado?
    private boolean alquilado;
    
    
    public PisoDeAlquiler(String nombreInquilino, int precioAlquilerPiso) {
        alquilado = false;
        inquilino = nombreInquilino;
        precioAlquiler = precioAlquilerPiso;
    }
    
    public boolean getAlquilado() {
        return alquilado;
    }
    
    public String getInquilino() {
        return inquilino;
    }
    
    public int getPrecioAlquiler() {
        return precioAlquiler;
    }
    
    public void setUbicacion(String nuevoInquilino) {
        inquilino = nuevoInquilino;
    }
    
    public void incrementarPrecioDelAlquiler(int sumarAlPrecio) {
        precioAlquiler = precioAlquiler + sumarAlPrecio;
    }
    
    public void cambiarEstadoAlquilado() {
        alquilado = !alquilado;
    }
}