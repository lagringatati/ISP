package primerparcial;

import java.util.Scanner;   //importo la utilidad Scanner

public class Ejercicio2b {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); //instancio 
        //declaro variables   
        int num;
        int pares = 0;
        int impares = 0;
        //pido un numero por teclado al usuario 
        System.out.print("Ingrese un numero: ");
        num = leer.nextInt();
        if (num >= 0){  //si el numero es positivo recorro de forma creciente (del 0 al numero ingresado)
            for (int i=0;i<=num;i++) {
                if ((i%2)==0){ //el numero i es par
                    pares = pares + i;
                } else {    //el numero i es impar
                    impares = impares + i;
                }
            }
        } else {    //si el numero ingresado es negativo, recorro desde el numero hasta el 0
            for (int i=num;i<=0;i++) {
                if ((i%2)==0){ //el numero i es par
                    pares = pares + i;
                } else {    //el numero i es impar
                    impares = impares + i;
                }
            }
        }
        //muestro resultados por pantalla
        System.out.println("La suma de numeros pares desde el 0 hasta el "+ num + " es: "+ pares);
	System.out.println("La suma de numeros impares desde el 0 hasta el "+ num + " es: "+ impares); 
    }
}
