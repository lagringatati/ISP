package segundoparcial;

import java.util.Scanner;   //importo la utilidad Scanner

public class Ejercicio1a {
    //declaro funciones
    public static int[] cargarDatosArray(int numero){
        //declaro variables locales a cargarDatosArray
        int[] arrayNumeros;
        int i;
        //instancio
        Scanner leer = new Scanner(System.in);
        arrayNumeros = new int[numero];
        //cuerpo de la función
        for (i=0;i<numero;i++) {    //cargo numeros en el arreglo  
            System.out.print("Ingrese un numero: ");
            arrayNumeros[i] = leer.nextInt();
        }
        return arrayNumeros;
    }
    public static int sumarDatosArray(int[] array){
        //declaro variables locales a sumarDatosArray
        int i;
        int auxSuma=0;
        //cuerpo de la función
        for (i=0;i<array.length;i++) {    //recorro el arreglo  
            auxSuma=auxSuma+array[i];
        }
        return auxSuma;
    }
    public static void mostrarDatosArray(int[] array){
        //declaro variables locales a mostrarDatosArray
        int i;
        //cuerpo de la función
        for (i=0;i<array.length;i++) {    //recorro el arreglo  
            System.out.println(array[(array.length-1)-i]);
        }
    }
    
    public static void main(String[] args) {
        int[] arregloEnteros;
        int suma;
        arregloEnteros = new int[5];
        arregloEnteros = cargarDatosArray(5);
        System.out.println("La suma de los elementos cargados es: "+sumarDatosArray(arregloEnteros));
        System.out.println("Elementos en orden inverso: ");
        mostrarDatosArray(arregloEnteros); 
    }
}
