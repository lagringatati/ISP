package primerparcial;

import java.util.Scanner;   //importo la utilidad Scanner

public class Ejercicio2f {
    //declaro las funciones
    public static boolean esPrimo(int numero){
        //declaro variables locales a "esPrimo"
        boolean aux = true;
        if (numero>1){
            int indice = 2;
            while (aux && (indice!=numero)) {
        	if (numero%indice==0){
                    aux = false;
                }
                indice = indice +1;
            }
        }
        return aux;
    }
       
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in); //instancio  
        //declaro variables   
        char varSalida = 'S';
        int num;
        while (varSalida != 'N'){
            //pido un numero por teclado y valido que el número ingresado sea entero positivo                       
            System.out.print("Ingrese un numero entero positivo: ");
            num = leer.nextInt();
            while (num < 1) {
        	System.out.println("----------Numero invalido!----------");
		System.out.print("Ingrese un numero entero positivo: ");
		num = leer.nextInt();
            }
            //utilizo el metodo "esPrimo" con el numero ingresado para ver si es o no un numero primo
            if (esPrimo(num)){
                System.out.println("El número ingresado es primo"); //muestro resultado por pantalla
            }else{
                System.out.println("El número ingresado NO es primo");
            }
            //pido validacion para continuar
            System.out.print("Ingrese una [N] para salir: ");
            varSalida = leer.next().charAt(0);    
            varSalida= Character.toUpperCase(varSalida);
        }               
    }
}
