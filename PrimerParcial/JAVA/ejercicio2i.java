package primerparcial;
//importo utilidades
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;   

public class ejercicio2i {
    
    //declaro las funciones
    public static List cargarLista() {
        Scanner leer = new Scanner(System.in); //instancio  
        //declaro variables locales a "cargarLista"
        char varSalida = 'S';
        double num;
        List listaLlena = new ArrayList();
        while (varSalida != 'N'){
            //pido un numero por teclado y lo agrego a mi lista de numeros                      
            System.out.print("Ingrese un numero: ");
            num = leer.nextDouble();
            listaLlena.add(num);
            //pido validacion para continuar
            System.out.print("Desea ingresar otro número? (presione [N] para salir): ");
            varSalida = leer.next().charAt(0);    
            varSalida= Character.toUpperCase(varSalida);
        }
        return listaLlena;
    }
    
    public static double sumarPositivosLista(List lista) {
        //declaro variables locales a "sumarPositivosLista"
        double suma, aux;
        suma = 0;
        int i;
        for (i=0;i<=lista.size()-1;i++) {
            aux = (double) lista.get(i);
            if (aux>0){    //si el elemento de la lista es positivo lo sumo
            suma = suma+aux;
            }
	}   
        return suma;
    }
    
    public static double sumarNegativosLista(List lista) {
        //declaro variables locales a "sumarNegativosLista"
        double suma, aux;
        suma = 0;
        int i;
        for (i=0;i<=lista.size()-1;i++) {
            aux = (double) lista.get(i);
            if (aux<0){    //si el elemento de la lista es negativo lo sumo
            suma = suma+aux;
            }
	}   
        return suma;
    }
    
    public static double cuentaPositivosLista(List lista) {
        //declaro variables locales a "cuentaPositivosLista"
        double total, aux;
        total = 0;
        int i;
        for (i=0;i<=lista.size()-1;i++) {
            aux = (double) lista.get(i);
            if (aux>0){    //si el elemento de la lista es positivo lo cuento
            total = total + 1;
            }
	}   
        return total;
    }
    
    public static double cuentaNegativosLista(List lista) {
        //declaro variables locales a "cuentaNegativosLista"
        double total, aux;
        total = 0;
        int i;
        for (i=0;i<=lista.size()-1;i++) {
            aux = (double) lista.get(i);
            if (aux<0){    //si el elemento de la lista es negativo lo cuento
            total = total + 1;
            }
	}   
        return total;
    }
    
    public static double sumarParesLista(List lista) {
        //declaro variables locales a "sumarParesLista"
        double suma, aux;
        suma = 0;
        int i;
        for (i=0;i<=lista.size()-1;i++) {
            aux = (double) lista.get(i);
            if ((aux%2)==0){    //si el elemento de la lista es par lo sumo
            suma = suma+aux;
            }
	}   
        return suma;
    }
    
    public static double sumarImparesLista(List lista) {
        //declaro variables locales a "sumarImparesLista"
        double suma, aux;
        suma = 0;
        int i;
        for (i=0;i<=lista.size()-1;i++) {
            aux = (double) lista.get(i);
            if ((aux%2)!=0){    //si el elemento de la lista es impar lo sumo
            suma = suma+aux;
            }
	}   
        return suma;
    }
    
    public static double cuentaParesLista(List lista) {
        //declaro variables locales a "cuentaParesLista"
        double total, aux;
        total = 0;
        int i;
        for (i=0;i<=lista.size()-1;i++) {
            aux = (double) lista.get(i);
            if (((aux%2)==0)&& (aux!=0)){    //si el elemento de la lista es par y diferente de cero lo cuento
            total = total + 1;
            }
	}   
        return total;
    }
    
    public static double cuentaImparesLista(List lista) {
        //declaro variables locales a "cuentaImparesLista"
        double total, aux;
        total = 0;
        int i;
        for (i=0;i<=lista.size()-1;i++) {
            aux = (double) lista.get(i);
            if ((aux%2)!=0){    //si el elemento de la lista es impar lo cuento
            total = total + 1;
            }
	}   
        return total;
    }
    
    public static double promedioLista(List lista) {
        //declaro variables locales a "promedioLista"
        double suma, aux;
        suma = 0;
        int i;
        for (i=0;i<=lista.size()-1;i++) {   //sumo todos los elementos de la lista
            aux = (double) lista.get(i);
            suma = suma + aux;
	}   
        return (suma/lista.size());     //divido la suma total por la cantidad de elementos que contiene la lista
    }
    
    public static void main(String[] args){
        //declaro variables   
        List listaDeNumeros = new ArrayList();
        //utilizo las funciones creadas mas arriba para cargar datos y mostrar resultados
        
        listaDeNumeros = cargarLista();
        System.out.println("Hay "+cuentaPositivosLista(listaDeNumeros)+" numeros positivos y su suma total es: "+sumarPositivosLista(listaDeNumeros));
        System.out.println("Hay "+cuentaNegativosLista(listaDeNumeros)+" numeros negativos y su suma total es: "+sumarNegativosLista(listaDeNumeros));
        System.out.println("Hay "+cuentaParesLista(listaDeNumeros)+" numeros pares y su suma total es: "+sumarParesLista(listaDeNumeros));
        System.out.println("Hay "+cuentaImparesLista(listaDeNumeros)+" numeros impares y su suma total es: "+sumarImparesLista(listaDeNumeros));
        System.out.println("El promedio de todos los elementos ingresados es igual a: "+Math.round(promedioLista(listaDeNumeros))); 
    }    
}
