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
	Escribir "Introudzca 1 para la suma, 2 para la resta, 3 para la multiplicaci�n, y 4 para la divisi�n";
	Leer result;
	si result=1 Entonces
		Escribir "La suma de ambos n�meros es: ", suma;
	SiNo
		si result=2 Entonces
			Escribir "La resta de ambos n�meros es: ", resta;
		SiNo
			si result=3 Entonces
				Escribir "El producto de ambos n�meros es: ", multip;
			SiNo
				si result=4 Entonces
					Escribir "La divis�n de ambos n�mero es; ", div;
				SiNo
					Escribir "Operaci�n seleccionada no v�lida";
				FinSi
			FinSi
		FinSi
		
	FinSi

FinProceso
