Proceso calculo_IMC
	Definir peso, estatura, div como real;
	
	Escribir "Porfavor indique su peso en kg";
	leer peso;
	Escribir "Porfavor indique su estatura en m";
	leer estatura;
	
	div<-peso/(estatura^2); 
	Escribir div;
	si 18.5>div Entonces
		Escribir "Peso inferior al normal";
	SiNo 
		si 24.9>div Entonces
			Escribir "Tu peso es normal";
		SiNo
			si	29.9>div Entonces
				Escribir "Peso superior al normal";
			SiNo
				si 30<div Entonces
					Escribir "Obesidad";
					
				FinSi
			FinSi
		FinSi
		
	FinSi
FinProceso
