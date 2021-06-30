Algoritmo ejercicio1i
	varSalida <- 'S'
	limite <- 999999999;
	indice <- 1;
	Dimension arregloNumeros[limite];
	sumaPositivos <- 0;
	sumaNegativos <- 0;
	cantidadPositivos <- 0;
	cantidadNegativos <- 0;
	sumaPares <- 0;
	sumaImpares <- 0;
	cantidadPares <- 0;
	cantidadImpares <- 0;
	Mientras varSalida<>'N' Hacer
		Escribir ("Ingrese un número: "); Sin Saltar
		Leer num
		arregloNumeros[indice] <- num;
		indice <- indice + 1;
		Escribir ("Desea ingresar otro número? (presione [N] para salir)"); Sin Saltar
		Leer varSalida
		varSalida <- Mayusculas(varSalida)
	FinMientras
	Para i<-1 Hasta indice Hacer
		Si (arregloNumeros[i] > 0) Entonces
			sumaPositivos <- sumaPositivos + arregloNumeros[i];
			cantidadPositivos <- cantidadPositivos + 1;
		SiNo 
			si (arregloNumeros[i] < 0) Entonces
				sumaNegativos <- sumaNegativos + arregloNumeros[i];
				cantidadNegativos <- cantidadNegativos + 1;
			FinSi
		FinSi
		Si ((arregloNumeros[i] MOD 2)=0) Entonces
			Si (arregloNumeros[i]<>0) Entonces
				sumaPares <- sumaPares + arregloNumeros[i];
				cantidadPares <- cantidadPares + 1;
			FinSi
		SiNo
			sumaImpares <- sumaImpares + arregloNumeros[i];
			cantidadImpares <- cantidadImpares + 1;
		FinSi
	FinPara
	Escribir ("Hay "); sin saltar
	Escribir cantidadPositivos; sin saltar
	Escribir (" numeros positivos y su suma da como resultado "); sin saltar
	Escribir sumaPositivos;
	Escribir ("Hay "); sin saltar
	Escribir cantidadNegativos; sin saltar
	Escribir (" numeros negativos y su suma da como resultado "); sin saltar
	Escribir sumaNegativos;
	Escribir ("Hay "); sin saltar
	Escribir cantidadPares; sin saltar
	Escribir (" numeros pares y su suma da como resultado "); sin saltar
	Escribir sumaPares;
	Escribir ("Hay "); sin saltar
	Escribir cantidadImpares; sin saltar
	Escribir (" numeros impares y su suma da como resultado "); sin saltar
	Escribir sumaImpares;
	Escribir ("El promedio de todos los numeros ingresados es igual a: "); sin saltar
	Escribir ((sumaPares+sumaImpares)/(indice-1));
FinAlgoritmo
