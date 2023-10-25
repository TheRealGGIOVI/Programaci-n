SubProceso variable_de_retorno <- Nombre ( Argumentos )
	
FinSubProceso
Proceso Operadores_Logicos
	//Defino una variable "a" entera
	Definir a Como Entero;
	//Escribir "Inserte a";
	//Leer a;
	a <- 3;
	
	//Defino tres variables "operador_Y", "operador_O" y "operador_NO" como lógicas
	Definir operador_Y, operador_O, operador_NO Como Logico;
	operador_Y <- (a >= 3) Y (a < 10) Y (a > 0) Y (a > -2);
	operador_O <- (a = 3) O (a = -2);
	operador_NO <- NO (a < 1);
	Escribir  "Y: ", operador_Y;
	Escribir  "O: ", operador_O;
	Escribir  "NO: ", operador_NO;
FinProceso
