package segundoparcial;

public class Ejercicio1g {
     public static void main(String[] args) {
         int x = 2340;
         int y = 54;
         double n = 96.58;
         double m = 2.2;
         
         System.out.println("El valor de X es: "+x);
         System.out.println("El valor de Y es: "+y);
         System.out.println("El valor de N es: "+String.format("%.2f",n));
         System.out.println("El valor de M es: "+String.format("%.2f",m));
         System.out.println("-----------------------------------");
         System.out.println("La suma de X e y es: "+(x+y));
         System.out.println("-----------------------------------");
         System.out.println("La diferencia de X e y es: "+(x-y));
         System.out.println("-----------------------------------");
         System.out.println("El producto de X e y es: "+(x*y));
         System.out.println("-----------------------------------");
         System.out.println("El cociente de X e y es: "+(x/y));
         System.out.println("-----------------------------------");
         System.out.println("El resto de X e y es: "+(x%y));
         System.out.println("-----------------------------------");
         System.out.println("La suma de N y M es: "+String.format("%.2f",n+m));
         System.out.println("-----------------------------------");
         System.out.println("La diferencia de N y M es: "+String.format("%.2f",n-m));
         System.out.println("-----------------------------------");
         System.out.println("El producto de N y M es: "+String.format("%.2f",n*m));
         System.out.println("-----------------------------------");
         System.out.println("El cociente de N y M es: "+String.format("%.2f",n/m));
         System.out.println("-----------------------------------");
         System.out.println("El resto de N y M es: "+String.format("%.2f",n%m));
         System.out.println("-----------------------------------");
         System.out.println("La suma de X y N es: "+String.format("%.2f",(double)x+n));
         System.out.println("-----------------------------------");
         System.out.println("El cociente de Y y M es: "+String.format("%.2f",(double)y/m));
         System.out.println("-----------------------------------");
         System.out.println("El resto de Y y M es: "+String.format("%.2f",(double)y%m));
         System.out.println("-----------------------------------");
         System.out.println("El doble de X es: "+(2*x));
         System.out.println("-----------------------------------");
         System.out.println("El doble de Y es: "+(2*y));
         System.out.println("-----------------------------------");
         System.out.println("El doble de N es: "+String.format("%.2f",2*n));
         System.out.println("-----------------------------------");
         System.out.println("El doble de M es: "+String.format("%.2f",2*m));
         System.out.println("-----------------------------------");
         System.out.println("La suma de X, Y, N y M es: "+String.format("%.2f",(double)x+(double)y+n+m));
         System.out.println("-----------------------------------");
         System.out.println("El producto de X, Y, N y M es: "+String.format("%.2f",(double)x*(double)y*n*m));
     }
}
