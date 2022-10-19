
package Ejercicio3;


public class Vehiculo {
    private String marca;
    private String modelo;
    private float precio;
    
    //Constructor
    public Vehiculo(String marca, String modelo, float precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
    public String mostrarDatos(){
        return  "Marca: "+marca+"\nModelo: "+modelo+"\nPrecio: $"+precio+"\n";
    }
}
