Funcion total<-sumatorio (n)
	
	Definir total como entero;
	total<-0;  //acumulador
	
	Mientras (n >= 1) Hacer
		total <- total + n;
		n <- n - 1;
	FinMientras
	
FinFuncion

Proceso funcion_sumatorio
	
	Definir n, resultado Como Entero;
	
	Escribir "Introduzca un número para calcualr su sumatorio";
	leer n;
	resultado<-sumatorio(n);   //Invoco o llamo a la función
	
	Escribir "El sumatorio de ", n, " es igual = ", sumatorio(n);
	
FinProceso
