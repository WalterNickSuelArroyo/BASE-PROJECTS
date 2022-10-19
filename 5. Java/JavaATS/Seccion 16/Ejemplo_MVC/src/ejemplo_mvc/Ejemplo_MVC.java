package ejemplo_mvc;
import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Ejemplo_MVC {
    public static void main(String[] args) {
        Vista vista = new Vista();
        Modelo modelo = new Modelo();
        Controlador controlador = new Controlador(vista, modelo);
        
        controlador.iniciar();
        vista.setVisible(true);
    }
}
