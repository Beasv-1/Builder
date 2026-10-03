package builder;

public class DirectorPantalla {
    private PantallaBuilder builder;

    public DirectorPantalla(PantallaBuilder builder){
        this.builder = builder;
    }

    public void construirPantalla(){

    builder.construirTitulo(); 
    builder.construirCabecera(); 
    builder.construirContenido(); 
    builder.construirBoton(); 
    }
}
