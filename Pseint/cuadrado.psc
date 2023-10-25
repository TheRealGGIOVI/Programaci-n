Proceso cuadrado
	
	//definimos las variables para nuestro rectángulo
	Definir b, a, i, j, opcion Como Entero;
	
	//Inicializamos las variables fijas i, j 
	i<-0;
	j<-1;
	
	//Procedemos a preguntar la altura y base del cuadrado en cuestión
	Escribir "¿Qué altura desea que tenga el rectánglo?" Sin Saltar;
	Leer a;
	
	Escribir "¿Qué base desea que tenga el rectángulo?" Sin Saltar;
	leer b;
	
	//con los datos de la base y la altrua preguntareos al usuario cualde las 3 opciones quiere realizar
	Escribir "¿Cuál de las tres opciones desea elegir?";
	Escribir "1. Pinta el rectángulo verticalmente (normal).";
	Escribir "2. Pinta el rectángulo horizontalmente (invertido).";
	Escribir "3. Salir.";
	Leer opcion;
	
	Segun opcion Hacer
		1: //Esta opción es para el cuadrado vertical
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
