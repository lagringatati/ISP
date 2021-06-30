package primerparcial;

import java.util.Scanner;   //importo la utilidad Scanner

public class Ejercicio2c {
     public static void main(String[] args){
         Scanner leer = new Scanner(System.in); //instancio 
        //declaro variables   
        int num;
        String mayorQueCero;
        String paridad;
        //pido un numero por teclado al usuario 
        System.out.print("Ingrese un numero: ");
        num = leer.nextInt();
        if (num>0) { //el numero ingresado es positivo
            mayorQueCero = "POSITIVO";
	} else {    //el numero ingresado es negativo
            mayorQueCero = "NEGATIVO";
	}
	if (num%2==0) { //el numero ingresado es par
            paridad = "PAR";
	} else {    //el numero ingresado es impar
            paridad = "IMPAR";
	}
	if (num==0) {   //si el numero ingresado es cero lo informo
            System.out.println("El numero ingresado es CERO");
	} else {    //si el numero ingresado NO es cero informo lo procesado antes
            System.out.println("El número ingresado es "+ paridad +" y "+mayorQueCero);
	}
     }
}
