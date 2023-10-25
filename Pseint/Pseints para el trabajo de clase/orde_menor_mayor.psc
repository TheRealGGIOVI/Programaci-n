Proceso orde_menor_mayor
	Definir num1, num2, num3 como real;
	Escribir "Escriba 3 números para ordenarlos de menor a mayor";
	leer num1, num2, num3;
	si  num1<num2 Y num2<num3 Entonces
		Escribir num1, "-", num2, "-", num3;
	SiNo
		si num1<num3 Y num3<num2 Entonces
			Escribir num1, "-", num3, "-", num2;
		SiNo
			si num3<num2 Y num2<num1 Entonces
				Escribir num3, "-", num2, "-", num1;
			sino 
				si num3<num1 Y num1<num2 Entonces
					Escribir num3, "-", num1, "-", num2;
				SiNo
					si num2<num3 Y num3<num1 Entonces
						Escribir num2, "-", num3, "-", num1;
					sino 
						si num2<num1 Y num1<num3 Entonces
							Escribir num2, "-", num1, "-", num3;
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinSi
FinProceso