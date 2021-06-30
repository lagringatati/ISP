Funcion resulPrimo <- esPrimo ( num )
	aux <- Verdadero;
	Si num > 1 Entonces
		indice <- 2;
		Mientras (aux y indice <> num) Hacer
			Si (num MOD indice = 0) Entonces
				aux <- Falso;
			FinSi
			indice <- indice +1;
		Fin Mientras
	FinSi	
resulPrimo <- aux;
Fin Funcion

Algoritmo ejercicio1f
	varSalida <- "S";
	Mientras varSalida <> "N" Hacer
		Escribir ("Ingrese un número entero positivo: "); Sin Saltar
		Leer num	;
		Mientras (num < 1) Hacer
			Escribir ("----------Numero inválido!----------");
			Escribir ("Ingrese un número entero positivo: "); Sin Saltar
			Leer num;
		Fin Mientras
		Si esPrimo(num) Entonces
			Escribir ("El número ingresado es primo");
		SiNo
			Escribir ("El número ingresado NO es primo");
		FinSi
		Escribir ("Ingrese una [N] para salir: "); Sin Saltar
		Leer varSalida;
		varSalida <- Mayusculas(varSalida);
	Fin Mientras
FinAlgoritmo
