package primerparcial;

import java.util.Scanner;   //importo la utilidad Scanner

public class Ejercicio2a {
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        //declaro variables   
        int num;
        int aux = 1;
        //valido que el número ingresado por teclado sea entero positivo                       
        System.out.print("Ingrese un numero entero positivo: ");
        num = leer.nextInt();
        while (num < 0) {
        	System.out.println(("----------Numero invalido!----------"));
		System.out.print(("Ingrese un numero entero positivo: "));
		num = leer.nextInt();
	}
        //calculo el factorial del número ingresado por teclado
        for (int i=1;i<=num;i++) {
            aux = aux*i;
	}
        //muestro resultados por pantalla
	System.out.println("El factorial del numero "+num+" es: "+aux);
    }  
}
