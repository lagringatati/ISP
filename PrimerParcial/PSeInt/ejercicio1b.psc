Algoritmo ejercicio1b
	Escribir ('Ingrese un numero: ') Sin Saltar
	Leer num
	pares <- 0
	impares <- 0
	Si (num>=0) Entonces
		Para i<-0 Hasta num Hacer
			Si ((i MOD 2)=0) Entonces
				pares <- pares+i
			SiNo
				impares <- impares+i
			FinSi
		FinPara
	SiNo
		Para i<-0 Hasta num Con Paso -1 Hacer
			Si ((i MOD 2)=0) Entonces
				pares <- pares+i
			SiNo
				impares <- impares+i
			FinSi
		FinPara
	FinSi
	Escribir ('La suma de numeros pares desde el 0 hasta el ') Sin Saltar
	Escribir num Sin Saltar
	Escribir (' es: ') Sin Saltar
	Escribir pares
	Escribir ('La suma de numeros impares desde el 0 hasta el ') Sin Saltar
	Escribir num Sin Saltar
	Escribir (' es: ') Sin Saltar
	Escribir impares
FinAlgoritmo
