package segundoparcial;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Ejercicio1h {
    public static void main(String[] args) {
    double cat1, cat2, hip;
    Scanner leer = new Scanner(System.in);
    do{
        System.out.print("Ingrese el valor del primer cateto: ");
        cat1 = leer.nextDouble();
        if (cat1<1){
            System.out.println("El valor debe ser un número positivo");    
        }
    } while (cat1<1);
    do{
        System.out.print("Ingrese el valor del segundo cateto: ");
        cat2 = leer.nextDouble();
        if (cat2<1){
            System.out.println("El valor debe ser un número positivo");    
        }
    }while (cat2<1);
    hip = sqrt((cat1*cat1)+(cat2*cat2));
    System.out.println("La hipotenusa del triángulo rectángulo cuyos catetos son "+cat1+" y "+cat2+" es: "+String.format("%.2f",hip));
    }  
}
