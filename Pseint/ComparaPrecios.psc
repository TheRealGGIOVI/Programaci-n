Algoritmo ComparaPrecios
	Definir num1,num2 Como Real;
	Escribir "Introduce un número entero";
	Leer num1;
	Escribir "Introduce un número entero";
	Leer num2;
	Si num1>=num2 Entonces
		Si num1=num2 Entonces
			Escribir "Son iguales";
		SiNo
			Escribir "El primer número (num1) es mayor";
		FinSi
	SiNo
		Escribir "El segundo número (num2) es mayor";
	FinSi
FinAlgoritmo