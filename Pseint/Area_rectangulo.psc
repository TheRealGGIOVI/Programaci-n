Proceso Area_rectangulo
	Definir base,altura, area como entero;
	Definir continuar Como Caracter;
	
	Escribir "Cáculo del área de un rectángulo";
	repetir
		Escribir "Teclea la base (en cm^2)";
		Leer base;
	Hasta Que base > 0;
	Repetir
		Escribir "Teclea la altura (en cm^2)";
		Leer altura;
	Hasta Que altura > 0;
		area<- base*altura;
		Escribir "El área es: ", area, " cm2";
FinProceso
