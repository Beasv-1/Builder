package builder;

public class Main {
    public static void main(String[] args) {
        PantallaBuilder perfilBuilder = new PerfilBuilder(); 
        DirectorPantalla director =  new DirectorPantalla(perfilBuilder); 
        director.construirPantalla();
        Pantalla pantalla = perfilBuilder.getPantalla();
        pantalla.mostrar();

        PantallaBuilder AjustesBuilder = new AjustesBuilder(); 
        DirectorPantalla director2 =  new DirectorPantalla(AjustesBuilder); 
        director2.construirPantalla();
        Pantalla pantalla2 = AjustesBuilder.getPantalla();
        pantalla2.mostrar();


    }

}
