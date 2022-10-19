
package Ejercicio5;

import java.util.Scanner;


public class Principal {
    public static double mayorArea(Triangulo_Isosceles triangulos[]){
        double area;
        area = triangulos[0].obtenerArea();
        for (int i = 1; i < triangulos.length; i++) {
            if(triangulos[i].obtenerArea()>area){
                area = triangulos[i].obtenerArea();
            }
        }
        return area;
    }
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double base,lado;
        int nTriangulos;
        
        System.out.print("Digite el numero de triangulos a ingresar: ");
        nTriangulos = entrada.nextInt();
        
        Triangulo_Isosceles triangulos[] = new Triangulo_Isosceles[nTriangulos];
        
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("\nDigite los valores para el triangulo "+(i+1)+":");
            System.out.print("Introduzca la base: ");
            base = entrada.nextDouble();
            System.out.print("Introduzca el lado: ");
            lado = entrada.nextDouble();
            
            triangulos[i] = new Triangulo_Isosceles(base, lado);
            
            System.out.println("\nEl perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es: "+triangulos[i].obtenerArea());
        }
        System.out.println("\nEl area del triangulo de mayor superficie es: "+mayorArea(triangulos));
    }
    
}
