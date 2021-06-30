package primerparcial;

import java.util.Scanner;//importo la utilidad Scanner

public class Ejercicio2j {
    
     public static void main(String[] args){
         Scanner leer = new Scanner(System.in); //instancio  
        //declaro variables   
        int cantEmpleados, i, aux, edad;
        String nombre;
        double salario;
        
        //pido un numero por teclado y valido que el número ingresado sea entero positivo
            System.out.print("Ingrese la cantidad de empleados: ");
            cantEmpleados = leer.nextInt();
            while (cantEmpleados < 1) {
        	System.out.println("----------Numero invalido!----------");
                System.out.print("Ingrese la cantidad de empleados: ");
		cantEmpleados = leer.nextInt();
            }
            
            String [][] empleados = new String[cantEmpleados][3]; //creo un nuevo arreglo bidimensional 
            
            for (i=0;i<=(cantEmpleados-1);i++) {    //cargo datos de cada empleado (nombre, edad, salario)  
                aux = i+1;
                System.out.print(("Ingrese el nombre del empleado numero ")+aux+(": "));
                empleados[i][0] = leer.next();
                System.out.print(("Ingrese la edad del empleado numero ")+aux+(": "));
                empleados[i][1] = leer.next();
                System.out.print(("Ingrese el salario del empleado numero ")+aux+(": "));
                empleados[i][2] = leer.next();
            }  
            for (i=0;i<=(cantEmpleados-1);i++) {   //muestro datos de acuerdo a lo establecido y actualizo salario en caso de que corresponda
                edad = Integer.parseInt(empleados[i][1]);
                salario = Double.parseDouble(empleados[i][2]);
                if (edad<16){
                    System.out.println(empleados[i][0]+" NO tiene edad para trabajar");
                } else if (edad>=16 && edad<50){
                    System.out.println(empleados[i][0]+" tendra un 5% mas en el salario");
                    empleados[i][2]=(String.format("%.2f", salario*1.05));
                    System.out.println("SALARIO NUEVO: $"+ empleados[i][2] );
                }else if (edad>=51 && edad<60){
                    System.out.println(empleados[i][0]+" tendra un 10% mas en el salario");
                    empleados[i][2]=(String.format("%.2f", salario*1.10));
                    System.out.println("SALARIO NUEVO: $"+ empleados[i][2] );
                    
                }else if (edad>=60){
                    System.out.println(empleados[i][0]+" tendra un 15% mas en el salario");
                    empleados[i][2]=(String.format("%.2f", salario*1.15));
                    System.out.println("SALARIO NUEVO: $"+ empleados[i][2] );
                }  
            }   
     }
}
