Proceso Numero_termina_en_5
	Definir num1, ultdig Como Entero;
	Escribir "Escriba un n�mero";
	Leer num1;
	Si num1<0 Entonces
		num1<-num1*(-1);
		
	FinSi
	si	num1>0 Entonces
		ultdig<-num1-trunc(num1/10)*10;
	FinSi
	Si	ultdig=5 Entonces
		Escribir "El n�mero escrito termina en 5";
	SiNo
		Escribir "El n�mero escrito no termina en 5";
	FinSi
FinProceso
