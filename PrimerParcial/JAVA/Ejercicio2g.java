package primerparcial;

import java.util.Scanner;   //importo la utilidad Scanner

public class Ejercicio2g {
     //declaro las funciones
    public static void mostrarArreglo(double[] arreglo) {
        //declaro variables locales a "mostrarArreglo"
        int i;
        for (i=0;i<= (arreglo.length)-1;i++) {
            System.out.println("--> "+arreglo[i]);
	}
    }
    public static double sumarArreglo(double[] arreglo) {
        //declaro variables locales a "sumarArreglo"
        int i;
        double acumulador = 0;
        for (i=0;i<= (arreglo.length)-1;i++) {
            acumulador = acumulador + arreglo[i];
	}
      return acumulador;
    }
    public static void mostrarArregloInvertido(double[] arreglo) {
        //declaro variables locales a "mostrarArregloInvertido"
        int i;
        for (i=0;i<=(arreglo.length)-1 ;i++) {
            System.out.println("--> "+arreglo[((arreglo.length)-1)-i]);
	}
    }
    
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); //instancio el objeto "Leer"
        //declaro variables   
        int largoArreglo = 5;
        int i;
        double num;
        double[] arregloDeNumeros;  //array de numeros 
        arregloDeNumeros = new double[largoArreglo];    //array de "n" elementos (dado por el valor de "largoArreglo")
        //damos valor a cada elemento del array ingresando por teclado
        for (i=0;i<=(arregloDeNumeros.length)-1;i++) {
            System.out.print("Ingrese un numero: ");
            num = leer.nextDouble();
            arregloDeNumeros[i] = num;
	}
        //muestro resultados llamando las funciones declaradas
        System.out.println("Arreglo real: ");
        mostrarArreglo(arregloDeNumeros);
        System.out.println("Suma de los elementos: "+sumarArreglo(arregloDeNumeros));
        System.out.println("Arreglo invertido: ");
        mostrarArregloInvertido(arregloDeNumeros);
    }
}
