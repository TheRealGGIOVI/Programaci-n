Proceso cuadrado
	
	//definimos las variables para nuestro rect�ngulo
	Definir b, a, i, j, opcion Como Entero;
	
	//Inicializamos las variables fijas i, j 
	i<-0;
	j<-1;
	
	//Procedemos a preguntar la altura y base del cuadrado en cuesti�n
	Escribir "�Qu� altura desea que tenga el rect�nglo?" Sin Saltar;
	Leer a;
	
	Escribir "�Qu� base desea que tenga el rect�ngulo?" Sin Saltar;
	leer b;
	
	//con los datos de la base y la altrua preguntareos al usuario cualde las 3 opciones quiere realizar
	Escribir "�Cu�l de las tres opciones desea elegir?";
	Escribir "1. Pinta el rect�ngulo verticalmente (normal).";
	Escribir "2. Pinta el rect�ngulo horizontalmente (invertido).";
	Escribir "3. Salir.";
	Leer opcion;
	
	Segun opcion Hacer
		1: //Esta opci�n es para el cuadrado vertical
			Para i<-1 Hasta a Con Paso 1 Hacer
				Para j<-1 Hasta b Con Paso 1 Hacer
					Escribir "*" Sin Saltar;
				FinPara
				Escribir "";
				
			FinPara
		2: //Esta es para el horizontal
			Para i<-1 Hasta b Con Paso 1 Hacer
				Para j<-1 Hasta a Con Paso 1 Hacer
					Escribir "*" Sin Saltar;
				FinPara
				Escribir "";
			FinPara
			
		3: //FInalizamos
			Escribir "Fin del proceso";
	FinSegun
	
	
	
FinProceso
