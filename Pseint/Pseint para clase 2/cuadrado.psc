Proceso cuadrado
	Definir n, i, j Como Entero;
	Escribir "¿Qué altura tendrá el cuadrado?";
	leer n;
	i<-0;
	j<-0;
	Para i<-1 Hasta n Con Paso 1 Hacer
		
		Si i=n+(1-n) O i=n Entonces
			Para j<-1 Hasta n Con Paso 1 Hacer
				Escribir "*" Sin Saltar;
			FinPara
			
		SiNo
			Escribir "*" Sin Saltar;
			Para j<-1 hasta n-2 Con Paso 1 Hacer
				Escribir " " Sin Saltar;
			FinPara
			Escribir "*" Sin Saltar;
		FinSi
		Escribir "";
	FinPara
	
FinProceso