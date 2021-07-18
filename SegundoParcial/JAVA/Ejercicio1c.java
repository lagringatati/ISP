package segundoparcial;

import java.util.Scanner;

public class Ejercicio1c {
    //declaro funciones
    public static int mostrarMenu(){
        //declaro variables locales a mostrarMenu e instancio
        int aux;
        Scanner leer = new Scanner(System.in);
        //cuerpo de la función
        do{
            System.out.println(" ---------------------");
            System.out.println("| [1] | SUMAR         |");
            System.out.println(" ---------------------");
            System.out.println("| [2] | RESTAR        |");
            System.out.println(" ---------------------");
            System.out.println("| [3] | MULTIPLICAR   |");
            System.out.println(" ---------------------");
            System.out.println("| [4] | DIVIDIR       |");
            System.out.println(" ---------------------");
            System.out.println("| [5] | SALIR         |");
            System.out.println(" ---------------------");
            System.out.print("Seleccione un numero: ");
            aux = leer.nextInt();
            if (aux<1 || aux>5){
                System.out.println("NUMERO INVALIDO!!");
            }
        }while (aux<1 || aux>5);
        return aux;
    }
    public static void main(String[] args) {
        double num1,num2;
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
            opcion = mostrarMenu();
            if (opcion!=5){
                System.out.print("Ingrese el primer número: ");
                num1 = entrada.nextDouble();
                System.out.print("Ingrese el segundo número: ");
                num2 = entrada.nextDouble();
                switch (opcion){
                    case 1:
                        System.out.println("El resultado de la suma es: "+(num1+num2));
                        break;
                    case 2:
                        System.out.println("El resultado de la resta es: "+(num1-num2));
                        break;
                    case 3:
                        System.out.println("El resultado de la multiplicación es: "+(num1*num2));
                        break;
                    case 4:
                        if (num2==0){
                            System.out.println("ERROR, no se puede dividir por cero");
                        } else{
                            System.out.println("El resultado de la división es: "+(num1/num2));
                        }
                        break;
                }
            }
        }while (opcion!=5); 
    }
}