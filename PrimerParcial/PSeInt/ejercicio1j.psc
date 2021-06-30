Algoritmo ejercicio1j
	limite <- 999999
	Dimension empleados[limite,3]
	Dimension nombreEmpleados[limite]
	Escribir ('Ingrese la cantidad de empleados a cargar: ') Sin Saltar
	Leer num
	Mientras (num<1) Hacer
		Escribir ('----------Numero inválido!----------')
		Escribir ('Ingrese la cantidad de empleados a cargar: ') Sin Saltar
		Leer num
	FinMientras
	Para i<-1 Hasta num Hacer
		Escribir ('Ingrese el nombre del empleado numero ') Sin Saltar
		Escribir i Sin Saltar
		Escribir (': ') Sin Saltar
		Leer nombre
		nombreEmpleados[i] <- nombre
		Escribir ('Ingrese la edad de ') Sin Saltar
		Escribir nombre Sin Saltar
		Escribir (' :') Sin Saltar
		Leer edad
		empleados[i,2]<-edad
		Escribir ('Ingrese el salario de ') Sin Saltar
		Escribir nombre Sin Saltar
		Escribir (' :') Sin Saltar
		Leer salario
		empleados[i,3]<-salario
	FinPara
	Para i<-1 Hasta num Hacer
		aux <- empleados[i,2]
		nombre <- nombreEmpleados[i]
		Si (aux<16) Entonces
			Escribir (nombre) Sin Saltar
			Escribir (' no tiene edad para trabajar')
		SiNo
			Si (aux>=16 Y aux<50) Entonces
				Escribir (nombre) Sin Saltar
				Escribir (' tendra un 5% mas de salario')
				salario <- empleados[i,3]*1.05
				empleados[i,3]<-salario
				Escribir ('Nuevo salario: ') Sin Saltar
				Escribir salario
			SiNo
				Si (aux>=51 Y aux<60) Entonces
					Escribir (nombre) Sin Saltar
					Escribir (' tendra un 10% mas de salario')
					salario <- empleados[i,3]*1.10
					empleados[i,3]<-salario
					Escribir ('Nuevo salario: ') Sin Saltar
					Escribir salario
				SiNo
					Si aux>=60 Entonces
						Escribir (nombre) Sin Saltar
						Escribir (' tendra un 15% mas de salario')
						salario <- empleados[i,3]*1.15
						empleados[i,3]<-salario
						Escribir ('Nuevo salario: ') Sin Saltar
						Escribir salario
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
FinAlgoritmo
