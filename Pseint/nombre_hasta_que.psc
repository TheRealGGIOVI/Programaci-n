Proceso nombre_hasta_que
	Definir nombre Como Caracter;
	Definir i, veces Como Real;
	Escribir "Escribe tu nombre";
	leer nombre;
	Escribir "Cuántas veces quieres repetir tu nombre?";
	Leer veces;
	i<-0;
	Repetir
		Escribir nombre;
		i<-i+1;
	Hasta Que i=veces;
	Escribir "Hemos escrito tu nombre, ", nombre, " ", i, " veces";
	Escribir "El contador ahora vale ", i, " Y hemos salido del bucle";
	
FinProceso
