Proceso media_numeros
	Definir i, n, dato Como Entero;
	Definir media, acum como real;
	Escribir "Ingresa la cantidad de datos";
	Leer n;
	acum<-0;
	Para i<-1 Hasta n Hacer
		Escribir "Ingrese el dato ", i, ":";
		Leer dato;
		acum<-acum+dato;
	FinPara
	
	media<-acum/n;
	Escribir "La media es ", media;
	
FinProceso
