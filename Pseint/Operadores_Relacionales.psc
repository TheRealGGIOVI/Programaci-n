Proceso Operadores_Relacionales
	//Creo dos variables de tipo entero
	Definir a,b como entero;
	Escribir "Introducir valor de a";
	Leer a;
	Escribir "Introducir valor de b";
	Leer b;
    //Defino variables para cada una de las operaciones relacionales
	Definir igual, distinto, menor, menorIgual, mayorIgual Como Logico;
	igual <- a=b;
	distinto <- a<>b;
	menor <- a<b;
	menorIgual <- a<=b;
	mayorIgual <- a>=b;
	
	Escribir "¿Es a igual que b?", igual;
	Escribir "¿Es a distinto que b?", distinto;
	Escribir "¿Es a menor que b?", menor;
	Escribir "¿Es a menor o igual que b?", menorIgual;
	Escribir "¿Es a mayor o igual que b?", mayorIgual;
	
	
FinProceso
