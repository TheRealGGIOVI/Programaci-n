Algoritmo ComparaPrecios
	Definir num1,num2 Como Real;
	Escribir "Introduce un n�mero entero";
	Leer num1;
	Escribir "Introduce un n�mero entero";
	Leer num2;
	Si num1>=num2 Entonces
		Si num1=num2 Entonces
			Escribir "Son iguales";
		SiNo
			Escribir "El primer n�mero (num1) es mayor";
		FinSi
	SiNo
		Escribir "El segundo n�mero (num2) es mayor";
	FinSi
FinAlgoritmo