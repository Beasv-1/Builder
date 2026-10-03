package builder;

public interface PantallaBuilder {
    void construirTitulo(); 
    void construirCabecera(); 
    void construirContenido(); 
    void construirBoton(); 
    Pantalla getPantalla();
}
