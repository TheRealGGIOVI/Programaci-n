Proceso piramide
	
	Definir altura, i, j Como Entero;
	
    Escribir "�Qu� altura tiene la pir�mide?";
    Leer altura;
	
    Para i<-1 Hasta altura Con Paso 1 Hacer
        Para j<-1 Hasta altura-i Con Paso 1 Hacer
            Escribir " " Sin Saltar;
        FinPara
        Para j<-1 Hasta 2*i-1 Con Paso 1 Hacer
            Escribir "#" Sin Saltar;
        FinPara
        Escribir "";
    FinPara
	

FinProceso
