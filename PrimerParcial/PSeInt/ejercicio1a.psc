Algoritmo ejercicio1a
	ESCRIBIR ("Ingrese un numero entero positivo: ");SIN SALTAR
	LEER num;
	Mientras (num < 0) Hacer
		ESCRIBIR("----------Numero invalido!----------");
		ESCRIBIR ("Ingrese un numero entero positivo: ");SIN SALTAR
		LEER num;
	Fin Mientras
	aux = 1;
	PARA i<-1 HASTA num CON PASO 1 HACER
		aux = aux*i
	FIN PARA
	ESCRIBIR ("El factorial del numero "); SIN SALTAR
	ESCRIBIR num; SIN SALTAR
	ESCRIBIR (" es: "); SIN SALTAR
	ESCRIBIR aux;	
FinAlgoritmo
