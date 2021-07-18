package segundoparcial;

import java.util.Scanner;

public class Ejercicio1j {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] empleado = new String[2][20]; //el empleado tendrá 2 filas (nombre y sueldo) y 20 columnas (serán 20 empleados)
        String[][] empleadoMejorPago = new String[2][1]; //almacenaré los datos del empleado mejor pago
        empleadoMejorPago[0][0] = "";
        empleadoMejorPago[1][0] = "0";
        for (int i=0;i<20;i++) {    //recorro el arreglo  
           System.out.print("Ingrese el nombre del empleado número "+(i+1)+": ");
           empleado[0][i]=leer.next();
           System.out.print("Ingrese el sueldo del empleado número "+(i+1)+": ");
           empleado[1][i]=leer.next();
           if (Double.parseDouble(empleadoMejorPago[1][0])<Double.parseDouble(empleado[1][i])){
            empleadoMejorPago[0][0] = empleado[0][i];   //nombre
            empleadoMejorPago[1][0] = empleado[1][i];   //sueldo
           }
        }
        System.out.println("El empleado que más gana es: "+empleadoMejorPago[0][0]);
        System.out.println("Su sueldo es de: $"+empleadoMejorPago[1][0]);
        
    }
    
}
