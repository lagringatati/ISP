package segundoparcial;

import java.util.Scanner;

public class Ejercicio1i {
  public static void main(String[] args) {
    double velocidadInicial;
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese una velocidad en [km/h]: ");
    velocidadInicial = leer.nextDouble();
    System.out.println(String.format("%.2f",velocidadInicial)+" [km/h] equivalen a "+String.format("%.2f",(velocidadInicial*1000/3600))+" [m/s]");
  }  
}