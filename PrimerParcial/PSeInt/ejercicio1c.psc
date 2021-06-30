Algoritmo ejercicio1c
	Escribir ('Ingrese un número: ') Sin Saltar
	Leer num
	Si (num>0) Entonces
		mayorQueCero <- 'POSITIVO'
	SiNo
		mayorQueCero <- 'NEGATIVO'
	FinSi
	Si num MOD 2=0 Entonces
		paridad <- 'PAR'
	SiNo
		paridad <- 'IMPAR'
	FinSi
	Si num=0 Entonces
		Escribir ('El numero ingresado es CERO')
	SiNo
		Escribir ('El número ingresado es ') Sin Saltar
		Escribir paridad Sin Saltar
		Escribir (' y ') Sin Saltar
		Escribir mayorQueCero
	FinSi
FinAlgoritmo
