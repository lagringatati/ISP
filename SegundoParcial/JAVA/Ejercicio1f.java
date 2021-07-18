package segundoparcial;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1f {
    public static void main(String[] args) {
    List nombre = new ArrayList(); 
    List edad = new ArrayList(); 
    List salario = new ArrayList(); 
    Scanner leer = new Scanner(System.in);
    char opcion;
    
    do{
        System.out.print("Desea ingresar una persona? [S]: ");
        opcion = Character.toUpperCase(leer.next().charAt(0));
        if (opcion=='S'){
            System.out.print("Nombre: ");
            nombre.add(leer.next());
            System.out.print("Edad: ");
            edad.add(leer.nextInt());
            System.out.print("Salario: ");
            salario.add(leer.nextDouble());
        }
    }while(opcion=='S');
    
    if (nombre.size()!=0){  //hay al menos una persona ingresada
        System.out.print("Ingrese el nombre de la persona a buscar: ");
        String nombrePersona = leer.next();
        if (nombre.contains(nombrePersona)){    //si el nombre buscado se encuentra en la lista de nombres
           System.out.println(nombrePersona+", tiene "+edad.get(nombre.indexOf(nombrePersona))+" años y cobra $ "+salario.get(nombre.indexOf(nombrePersona)));
        }else{  //la persona buscada no se encuentra en la lista de nombres
            System.out.println("No existe actualmente una persona con ese nombre");
        }
    }
  }
}
