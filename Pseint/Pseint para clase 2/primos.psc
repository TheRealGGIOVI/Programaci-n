Proceso primos
	Definir n, i, div Como entero;
	
	Escribir "Teclea un n�mero para determinar si es primo";
	Leer n;
	
	Mientras n<2 Hacer
		Escribir "El n�mero introducido no puede ser menor que 2, porfavor introduzca otro";
		leer n;
	FinMientras
	div<-0;
	Para i<-1 Hasta n Con Paso 1 Hacer
		si n MOD i = 0 Entonces
			div<-div+1;
		FinSi
	FinPara
	
	si div = 2 Entonces
		Escribir "El n�mero ", n, " es primo";
	SiNo
		Escribir "El n�mero ", n, " no es primo";
	FinSi
FinProceso
