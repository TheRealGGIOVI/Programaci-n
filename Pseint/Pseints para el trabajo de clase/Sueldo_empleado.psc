Proceso Sueldo_empleado
	Definir num1 Como real;
	Escribir "Introduzca sueldo y le calcularemos su aumento";
	leer num1;
	si num1>500000 Entonces
		Escribir "Su sueldo será aumentado en " , (12/100*(num1)), " euros";
	SiNo
		Escribir "Su sueldo será aumentado en " , (15/100*(num1)), " euros";
	FinSi
	
FinProceso
