Funcion sumaTotal <- sumaArreglo ( arreglo, limite )
	Para i<-1 Hasta limite Con Paso 1 Hacer
		acumulador <- acumulador + arreglo[i];
	Fin Para
	sumaTotal <- acumulador;
Fin Funcion

Algoritmo ejercicio1g
	n = 5;
	Dimension arregloDeNumeros[n];
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir ("Ingrese un número: "); Sin Saltar
		Leer num;
		arregloDeNumeros[i] <- num;
	Fin Para
	Escribir ("Valores reales: ");
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir (" --> "); sin saltar
		Escribir arregloDeNumeros[i];		
	Fin Para
	Escribir ("La suma de los elementos del arreglo es: "); sin saltar
	Escribir (sumaArreglo(arregloDeNumeros,n));
	Escribir ("Valores invertidos:"); 
	Para i<-n Hasta 1 Con Paso -1 Hacer
		Escribir (" --> "); sin saltar
		Escribir arregloDeNumeros[i];		
	Fin Para
FinAlgoritmo