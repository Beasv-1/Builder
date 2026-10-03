package builder;

public class Pantalla {
    private String titulo;
    private String cabecera;
    private String contenido;
    private String botonPrincipal;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setCabecera(String cabecera){
        this.cabecera = cabecera;
    }
    public void setContenido(String contenido){
        this.contenido = contenido;
    }
    public void setBotonPrincipal(String botonPrincipal){
        this.botonPrincipal = botonPrincipal;
    }
    public void mostrar(){
        System.out.println("Título: " + titulo); 
        System.out.println("Cabecera: " + cabecera); 
        System.out.println("Contenido: " + contenido); 
        System.out.println("Botón: " + botonPrincipal);
    }
}
