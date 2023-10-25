Proceso Precio_zapatos
	Definir num1 como entero;
	Escribir "¿Cuántos zapatos desea comprar?";
	Leer num1;
	si  num1<=10 Entonces
		Escribir "El precio de sus zapatos será de ", num1*80, " euros";
	SiNo
		si num1>10 Y num1<=20 Entonces
			Escribir "Usted obtiene un 10% de descuento";
			Escribir "El precio de sus zapatos será de ", (num1*80-(0.1*(num1*80))), " euros";
		SiNo
			si num1>20 y num1<=30 Entonces
				Escribir "Usted obtiene un 20% de descuento";
				Escribir "El precio de sus zapatos será de ", (num1*80-(0.2*(num1*80))), " euros";
			SiNo
				si num1>30 Entonces
					Escribir "Usted obtiene un 40% de descuento";
					Escribir "El precio de sus zapatos será de ", (num1*80-(0.4*(num1*80))), " euros";
				FinSi
			FinSi
		FinSi	
	FinSi
	
	
FinProceso
