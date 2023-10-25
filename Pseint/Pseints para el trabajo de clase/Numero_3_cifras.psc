Proceso Numero_3_cifras
	Definir num1 Como Entero;
	Escribir "Teclea un número para comprobar si tiene 3 dígitos";
	Leer num1;
	si num1>=1000 Y num1<>0 Entonces
		Escribir "Incorrecto!";
	SiNo
		si num1<1000 Y num1>=100 Entonces
			Escribir "Correcto!";
		sino
			si num1>-1000 Y num1<=-100 Entonces
				Escribir "Correcto!";
			SiNo
				si num1<=99 Y num1>=-99 Entonces
					Escribir "Incorrecto!";
				FinSi
			FinSi
		FinSi
	FinSi
	
	
FinProceso
