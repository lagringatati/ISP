package segundoparcial;

import java.util.Scanner;

public class Ejercicio1b {
        //declaro funciones
    public static double[] cargarDatosArray(int numero){
        //declaro variables locales a cargarDatosArray e instancio
        int i = 0;
        char seguir = 'S';
        Scanner leer = new Scanner(System.in);
        double[] arrayNumeros = new double[numero];
        //cuerpo de la función
        while ((i<numero) && (seguir!='N')){
            System.out.print("Ingrese un numero: ");
            arrayNumeros[i] = leer.nextDouble();
            i=i+1;
            if (i<numero){
                System.out.print("Desea continuar? [N para finalizar]: ");
                seguir = leer.next().charAt(0);
                seguir = Character.toUpperCase(seguir);
            }
        }
        return arrayNumeros;
    }
    public static void mostrarDatosArray(double[] array){
        //declaro variables locales a mostrarDatosArray
        int i;
        //cuerpo de la función
        for (i=0;i<array.length;i++) {    //recorro el arreglo  
            System.out.println(array[i]);   //imprimo por pantalla
        }
    }
    public static int posicionEnArray(double[] array, double numero){
        //declaro variables locales a mostrarDatosArray
        int i;
        //cuerpo de la función
        for (i=0;i<array.length;i++) {    //recorro el arreglo  
            if(array[i]==numero){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Cuántos números desea ingresar?: ");
        int num = entrada.nextInt();
        double[] arreglo = new double[num];
        arreglo = cargarDatosArray(num);
        System.out.println("Los números ingresados son: ");
        mostrarDatosArray(arreglo);
        System.out.print("Ingrese un número para buscar su posicion: ");
        double num1 = entrada.nextDouble();
        num = posicionEnArray(arreglo, num1);
        if (num==-1){
            System.out.println("El número elegido no se encuentra entre los ingresados previamente");
        }else{
            System.out.println("El número elegido se encuentra en la posición número "+(num+1));
        }
    }
}
