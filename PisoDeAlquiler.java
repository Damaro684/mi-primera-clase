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
    
    public void setNuevoInquilino(String nuevoInquilino) {
        inquilino = nuevoInquilino;
    }
    
    public void incrementarPrecioDelAlquiler(int sumarAlPrecio) {
        precioAlquiler = precioAlquiler + sumarAlPrecio;
    }
    
    public void cambiarEstadoAlquilado() {
        alquilado = !alquilado;
    }
    
    public void imprimirEstadoDelObjeto() {
        System.out.println( "Inquilino: " + inquilino + " | "+ "Precio del alquiler: " + precioAlquiler + " | "+ "En alquiler: " + alquilado);
    }
    
    public String getEstadoDelObjeto() {
        return "Inquilino: " + inquilino + " | "+ "Precio del alquiler: " + precioAlquiler + " | "+ "En alquiler: " + alquilado;
    }
}