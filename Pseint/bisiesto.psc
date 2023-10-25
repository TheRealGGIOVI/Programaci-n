Proceso bisiesto
	
	//definimos las variables que vamos a utilizar para el siguiente problema
	Definir year como entero;
	
	//preguntamos el año que se quiere introducir
	Escribir "Introduzca un año para ver si es bisiesto";
	Leer year;
	
	//procedemos a comprobar si el año introducido es bisiesto
	si (year MOD 4 =0 Y year MOD 100 <> 0) Entonces
		Escribir "El año ", year, " es bisiesto";
	SiNo
		Escribir "El año ", year, " no es bisiesto";
	FinSi
FinProceso
