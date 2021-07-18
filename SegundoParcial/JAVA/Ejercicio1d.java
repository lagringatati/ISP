package segundoparcial;

import java.util.Scanner;

public class Ejercicio1d {

    public static void main(String[] args) {
    //instancio
    Scanner leer = new Scanner(System.in);
    int num1, num2,aux,aux1,j;
    int i = 1;
    double aux3;
    
    System.out.print("Ingrese el primer número: ");
    num1 = leer.nextInt();
    int base=num1;
    System.out.print("Ingrese el segundo número: ");
    num2 = leer.nextInt();
    if (num2>0){
        if (num1<0){
            num1=num1*(-1);
        }
        aux = num1;
        while(i<num2){
            aux1=aux;
            i=i+1;
            j=1;
            while (j<num1){
                aux=aux+aux1;
                j=j+1;
            }
        }
        aux3=aux;
    }else if (num2==0){
             aux3=1;
          } else{   //num2<0
                num2=num2*(-1);
                if (num1<0){
                    num1=num1*(-1);
                }
                aux = num1;
                while(i<num2){
                    aux1=aux;
                    i=i+1;
                    j=1;
                    while (j<num1){
                        aux=aux+aux1;
                        j=j+1;
                    }
                }
                aux3=1/(double)aux;
            }
    if ((base<0)&&(num2%2!=0)){
        System.out.println("La potencia del primer número elevado al segundo es: "+(aux3*(-1)));
    }else {
        System.out.println("La potencia del primer número elevado al segundo es: "+aux3);
    }
  }
}
    
    
    
    
    
