package builder;

public class PerfilBuilder implements PantallaBuilder{
    private Pantalla pantalla;

    public PerfilBuilder(){
        pantalla = new Pantalla();
    }
    @Override 
    public void construirTitulo() { 
        pantalla.setTitulo("Mi perfil"); 
    } 
 
    @Override 
    public void construirCabecera() { 
        pantalla.setCabecera("Datos del usuario"); 
    } 
 
    @Override 
    public void construirContenido() { 
        pantalla.setContenido( 
            "Nombre - Email - Fotografía" 
        ); 
    } 
 
    @Override 
    public void construirBoton() { 
        pantalla.setBotonPrincipal("[EDITAR PERFIL]"); 
    } 
 
    @Override 
    public Pantalla getPantalla() { 
        return pantalla; 
    }

}