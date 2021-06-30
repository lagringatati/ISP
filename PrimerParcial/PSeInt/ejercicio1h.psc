Algoritmo ejercicio1h
	num1 <- 0;
	num2 <- 1;
	Escribir ("Ingrese un número entero positivo: "); Sin Saltar
	Leer numIngresado;
	Mientras (numIngresado < 0) Hacer
		Escribir ("----------Numero inválido!----------");
		Escribir ("Ingrese un número entero positivo: "); Sin Saltar
		Leer numIngresado;
	Fin Mientras
	Escribir ("SERIE FIBONACCI HASTA "); sin saltar
	Escribir numIngresado; sin saltar
	Escribir (": ");
	Mientras ((num1<=numIngresado) o (num2<=numIngresado)) Hacer
		Escribir num1; sin saltar
		Escribir ("  "); sin saltar
		si (num2<=numIngresado) Entonces
			Escribir num2; sin saltar
			Escribir ("  "); sin saltar
		FinSi
		num1 <- num1 + num2;
		num2 <- num2 + num1;
	Fin Mientras
	Escribir (" ");
FinAlgoritmo