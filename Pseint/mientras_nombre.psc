Proceso mientras_nombre
	Definir nombre Como Caracter;
	Definir i Como Entero;
	Escribir "Escribe tu nombre" Sin Saltar;
	Leer nombre;
	i<-1;
	Mientras i<=10 Hacer
		Escribir 1, " ", nombre;
		i<-i+1;
	FinMientras
	Escribir "Hemos escrito 10 veces el nombre ", nombre;
	Escribir "El contador ahora vale ", i;
FinProceso
