Funcion resultado <- esPrimo (num)
		Definir divisores, i, resto como entero;
		i<-1;
		Repetir
			resto<-num MOD i;
			si resto=0 entonces 
				divisores<-divisores+1;
			FinSi
			i<-i+1;
		Hasta Que (i>num) O (divisores > 2)
FinFuncion




Proceso primos
	Definir n, i, div Como entero;
	
	Escribir "Teclea un número para determinar si es factorial";
	Leer n;
	
	div<-0;
	Para i<-1 Hasta n Con Paso 1 Hacer
		si n MOD i = 0 Entonces
			div<-div+1;
		FinSi
	FinPara
	
	si div = 2 Entonces
		Escribir "El número ", n, " es primo";
	SiNo
		Escribir "El número ", n, " no es primo";
	FinSi
	
FinProceso
