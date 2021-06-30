package primerparcial;

import java.util.Scanner;   //importo la utilidad Scanner

public class Ejercicio2e {

    public static void main(String[] args){
         Scanner leer = new Scanner(System.in); //instancio 
        //declaro variables   
        double num1, num2, resultado;
        //pido dos numeros por teclado al usuario 
        System.out.print("Ingrese un numero: ");
        num1 = leer.nextDouble();
        System.out.print("Ingrese otro numero: ");
        num2 = leer.nextDouble();
        //realizo la suma de los numeros ingresados
        resultado = num1 + num2;
        System.out.println ("La suma de los dos números ingresados da como resultado: "+ resultado);
    }
}
