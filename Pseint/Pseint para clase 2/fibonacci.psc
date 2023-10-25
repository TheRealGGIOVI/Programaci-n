Proceso fibonacci
	Definir i, n, a, b, c como entero;
	Escribir "¿Cuántos números de la sucesión de Fibonacci quieres mostrar?";
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
