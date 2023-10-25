Proceso Numero_Secreto
	Definir num_secreto, num_entrado Como Real;
	num_secreto <- 4;
	Escribir "Escriba un número";
	Leer num_entrado;
	Si num_secreto=num_entrado Entonces
	Escribir "Correcto!";
	SiNo
		Escribir "Incorrecto!";
		Repetir
			Escribir "Escriba un número";
			Leer num_entrado;
			Si num_entrado=num_secreto Entonces
				Escribir "Correcto!";
			SiNo
				Escribir "Incorrecto!";
			FinSi
			
		Hasta Que num_secreto=num_entrado;
		Escribir "Correcto!";
	FinSi
	
FinProceso
