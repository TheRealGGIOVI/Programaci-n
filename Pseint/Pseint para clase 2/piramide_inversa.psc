Proceso piramide_inversa
	Definir altura, i, j Como Entero;
	
    Escribir "�Qu� altura tiene la pir�mide invertida?";
    Leer altura;
	
    Para i<-altura Hasta 1 Con Paso -1 Hacer
        Para j<-1 Hasta altura-i Con Paso 1 Hacer
            Escribir " " Sin Saltar;
        FinPara
        Para j<-1 Hasta 2*i-1 Con Paso 1 Hacer
            Escribir "#" Sin Saltar;
        FinPara
        Escribir "";
    FinPara
FinProceso
