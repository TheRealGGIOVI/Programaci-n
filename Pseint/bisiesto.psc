Proceso bisiesto
	
	//definimos las variables que vamos a utilizar para el siguiente problema
	Definir year como entero;
	
	//preguntamos el a�o que se quiere introducir
	Escribir "Introduzca un a�o para ver si es bisiesto";
	Leer year;
	
	//procedemos a comprobar si el a�o introducido es bisiesto
	si (year MOD 4 =0 Y year MOD 100 <> 0) Entonces
		Escribir "El a�o ", year, " es bisiesto";
	SiNo
		Escribir "El a�o ", year, " no es bisiesto";
	FinSi
FinProceso
