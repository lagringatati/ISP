package segundoparcial;

import java.util.Scanner;

public class Ejercicio1e {
     //declaro funciones
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
    public static void main(String[] args) {
        int num1, num2;
        Scanner leer = new Scanner(System.in);
        do{
            System.out.print("Ingrese un número entero positivo: ");
            num1 = leer.nextInt();
        } while(num1<1);
        do{
            System.out.print("Ingrese otro número: ");
            num2 = leer.nextInt();
            if (num1>num2 || num1==num2){
                System.out.println("EL SEGUNDO NUMERO NO PUEDE SER MENOR O IGUAL QUE EL PRIMERO!");    
            }
        } while(num1>num2 || num1==num2);
        for (int i=num1; i<=num2; i++){
            if (esPrimo(i)){
                System.out.println("El número "+i+" es primo");
            }else{
                System.out.println("El número "+i+" NO es primo");
            }
        }
    }
}
