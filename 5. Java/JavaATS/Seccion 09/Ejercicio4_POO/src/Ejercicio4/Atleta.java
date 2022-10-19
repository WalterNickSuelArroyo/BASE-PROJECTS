
package Ejercicio4;


public class Atleta {
    private int numeroAtleta;
    private String nombre;
    private float tiempoCarrera;
    
    //Constructor
    public Atleta(int numeroAtleta, String nombre, float tiempoCarrera) {
        this.numeroAtleta = numeroAtleta;
        this.nombre = nombre;
        this.tiempoCarrera = tiempoCarrera;
    }
    public float getTiempoCarrera(){
        return tiempoCarrera;
    }
    public String mostrarDatosGanador(){
        return "Numero de Atleta: "+numeroAtleta+"\nNombre Atleta: "+nombre+"\nTiempo Carrera: "+tiempoCarrera+"\n";
    }
}
