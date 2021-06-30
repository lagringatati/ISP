package primerparcial;

import java.util.Scanner;   //importo la utilidad Scanner

public class Ejercicio2d {
    public static void main(String[] args){
         Scanner leer = new Scanner(System.in); //instancio 
        //declaro variables   
        double num1, num2;
        //pido dos numeros por teclado al usuario 
        System.out.print("Ingrese un numero: ");
        num1 = leer.nextDouble();
        System.out.print("Ingrese otro numero: ");
        num2 = leer.nextDouble();
        if (num1==num2){    //los numeros son iguales
            System.out.println("Los números ingresados son iguales");
        } else if (num1>num2){  //el primer numero es mayor, muestro resultados
            System.out.println("El primer número ingresado es mayor que el segundo");
            System.out.println("Mayor: "+num1);
            System.out.println("Menor: "+num2);
        } else {    //el segundo numero es mayor, muestro resultados
            System.out.println("El segundo número ingresado es mayor que el primero");
            System.out.println("Mayor: "+num2);
            System.out.println("Menor: "+num1);
        }
    }
}
