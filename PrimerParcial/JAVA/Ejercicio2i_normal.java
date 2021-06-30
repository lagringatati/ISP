package primerparcial;
//importo utilidades
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;   

public class Ejercicio2i_normal {
  public static void main(String[] args){
        //instancio         
        Scanner leer = new Scanner(System.in); 
        List listaDeNumeros = new ArrayList();
        //declaro variables  
        char varSalida = 'S';
        int num,aux;
        int sumaPares = 0;
        int sumaImpares = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int cantidadDePares = 0;
        int cantidadDeImpares = 0;
        int cantidadDePositivos = 0;
        int cantidadDeNegativos = 0;
        int i;
                
        while (varSalida != 'N'){
            //pido un numero por teclado y lo agrego a mi lista de numeros                      
            System.out.print("Ingrese un numero: ");
            num = leer.nextInt();
            listaDeNumeros.add(num);
            //pido validacion para continuar
            System.out.print("Desea ingresar otro número? (presione [N] para salir): ");
            varSalida = leer.next().charAt(0);    
            varSalida= Character.toUpperCase(varSalida);
        }
        //salgo del mientras con una lista de numeros
        //trabajo sobre esa lista separando lo que necesito
        for (i=0;i<=listaDeNumeros.size()-1;i++) {
            aux = (int) listaDeNumeros.get(i);
            if (aux>0){    //si el elemento de la lista es positivo lo cuento y lo sumo (respectivamente)
                cantidadDePositivos =cantidadDePositivos + 1;
                sumaPositivos = sumaPositivos + aux;
            }else if (aux<0){   //el elemento de la lista es negativo, lo cuento y sumo respectivamente
                cantidadDeNegativos =cantidadDeNegativos + 1;
                sumaNegativos = sumaNegativos + aux;
            }
            if ((aux%2==0) && (aux!=0)){    //si el elemento de la lista es par y distinto de cero, lo cuento y lo sumo (respectivamente)
                cantidadDePares =cantidadDePares + 1;
                sumaPares = sumaPares + aux;
            }else if (aux%2!=0){   //el elemento de la lista es impar, lo cuento y sumo respectivamente
                cantidadDeImpares =cantidadDeImpares + 1;
                sumaImpares = sumaImpares + aux;
            }
        }
        //muestro resultados
        System.out.println("Hay "+cantidadDePositivos+" numeros positivos y su suma total es: "+sumaPositivos);
        System.out.println("Hay "+cantidadDeNegativos+" numeros negativos y su suma total es: "+sumaNegativos);
        System.out.println("Hay "+cantidadDePares+" numeros pares y su suma total es: "+sumaPares);
        System.out.println("Hay "+cantidadDeImpares+" numeros impares y su suma total es: "+sumaImpares);
        //calculo promedio y lo muestro por pantalla
        System.out.println("El promedio de todos los elementos ingresados es igual a: "+(sumaPositivos+sumaNegativos)/listaDeNumeros.size()); 
    }
}
