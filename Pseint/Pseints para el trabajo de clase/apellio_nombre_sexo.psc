Proceso apellio_nombre_sexo
	Definir apellidos, nombre, sexo Como Caracter;
	Escribir "¿Cómo se llama?";
	Leer nombre;
	Escribir "¿Cúales son sus apellidos?";
	Leer apellidos;
	Escribir "¿Es hombre o mujer?";
	Leer sexo;
	Si sexo<>"mujer" Entonces
		Escribir "Bienvenido Sr. ", nombre, " ", apellidos;
	SiNo
		Escribir "Bienvenida Sra. ", nombre, " ",  apellidos;
	FinSi
	
	
FinProceso
