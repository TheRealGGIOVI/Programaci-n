Proceso Multiplos
	Definir num1, num2 Como Entero;
	Escribir "Teclea el primer n�mero para ver si es m�ltiplo del segundo";
	Leer num1;
	Escribir "Teclea el segundo n�mero";
	Leer num2;
	Definir resto Como Real;
	resto<- num1 Mod num2;
	si	resto=0 Entonces
		Escribir "Verdadero";
	sino
		Escribir "Falso";
	FinSi

FinProceso
