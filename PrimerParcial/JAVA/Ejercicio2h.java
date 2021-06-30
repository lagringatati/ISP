package primerparcial;

import java.util.Scanner;   //importo la utilidad Scanner

public class Ejercicio2h {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); //instancio  
        //declaro variables   
        int num1 = 0;
        int num2 = 1;
        int numIngresado;
        //pido un numero por teclado y valido que el número ingresado sea entero positivo
            System.out.print("Ingrese un numero entero positivo: ");
            numIngresado = leer.nextInt();
            while (numIngresado < 0) {
        	System.out.println("----------Numero invalido!----------");
		System.out.print("Ingrese un numero entero positivo: ");
		numIngresado = leer.nextInt();
            }
        //muestro serie de Fibonacci por pantalla sin permitir que se pase del numero ingresado
        System.out.println("SERIE FIBONACCI HASTA "+numIngresado+" :");
        while ((num1<=numIngresado)||(num2<=numIngresado)) {
        	System.out.print(num1);
                if (num2<=numIngresado){
                    System.out.print(" "+num2+" ");
                }
                num1 = num1 + num2;
                num2 = num2 + num1;
            }
        System.out.println(" ");
    }
}
