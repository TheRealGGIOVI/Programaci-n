Proceso fibonacci
	Definir i, n, a, b, c como entero;
	Escribir "�Cu�ntos n�meros de la sucesi�n de Fibonacci quieres mostrar?";
	Leer n;
	a<-0;
	b<-1;
	Para i<-1 Hasta n Con Paso 1 Hacer
		Escribir a;
		c<-a+b;
		a<-b;
		b<-c;
	FinPara
FinProceso
