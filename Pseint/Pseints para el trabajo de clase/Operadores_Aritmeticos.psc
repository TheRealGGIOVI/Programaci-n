Proceso Operadores_Aritmeticos_2
	Definir a,b como entero;
	Escribir "Introducir valor de a";
	Leer a;
	Escribir "Introducir valor de b";
	Leer b;
	Definir suma, resta, multip, result como entero;
	Definir div Como Real;
	
	suma <- a+b;
	resta <- a-b;
	multip <- a*b;
	div <- a/b; 
	Escribir "Introudzca 1 para la suma, 2 para la resta, 3 para la multiplicación, y 4 para la división";
	Leer result;
	si result=1 Entonces
		Escribir "La suma de ambos números es: ", suma;
	SiNo
		si result=2 Entonces
			Escribir "La resta de ambos números es: ", resta;
		SiNo
			si result=3 Entonces
				Escribir "El producto de ambos números es: ", multip;
			SiNo
				si result=4 Entonces
					Escribir "La divisón de ambos número es; ", div;
				SiNo
					Escribir "Operación seleccionada no válida";
				FinSi
			FinSi
		FinSi
		
	FinSi

FinProceso
