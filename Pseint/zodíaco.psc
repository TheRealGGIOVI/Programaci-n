Proceso signo_zodiaco

	//Definimos las variables
	Definir dia, mes Como entero;
	Definir nombre, repit Como Caracter;;
	
	repit<-"si";
	Mientras repit="si" O repit="Si" Hacer
		Escribir "Vamos a averiguar tu signo del Zodíaco";
		Escribir "¿Cómo te llamas?";
		leer nombre;
		
		Repetir
			Escribir "Introduce tu mes de nacimiento (el número)" Sin Saltar;
			leer mes;
			si mes>=1 Y mes<=12 Entonces
				Escribir "Ahora dinos";
			sino 
				Escribir "Tu mes es incorrecto porfavor escríbalo de nuevo";
				leer mes;
			FinSi
			
		Hasta Que mes>=1 Y mes<=12
		//Preguntamos el mes en el que ha nacido, tiene que ser del 1 al 12
		
		Segun mes Hacer
			1:
				Repetir
					Escribir "¿Qué día de enero has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=31 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=31;
			2:
				Repetir
					Escribir "¿Qué día de febrero has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=29 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
					FinSi
				Hasta Que dia>=1 Y dia<=29;
			3:
				Repetir
					Escribir "¿Qué día de marzo has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=31 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=31;
			4:
				Repetir
					Escribir "¿Qué día de abril has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=30 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=30;
			5:
				Repetir
					Escribir "¿Qué día de mayo has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=31 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=31;
			6:
				Repetir
					Escribir "¿Qué día de julio has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=30 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=30;
			7:
				Repetir
					Escribir "¿Qué día de julio has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=31 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=31;
			8:
				Repetir
					Escribir "¿Qué día de agosto has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=31 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=31;
			9:
				Repetir
					Escribir "¿Qué día de septiembre has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=30 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=30;
			10:
				Repetir
					Escribir "¿Qué día de octubre has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=31 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=31;
			11:
				Repetir
					Escribir "¿Qué día de noviembre has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=30 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=30;
			12:
				Repetir
					Escribir "¿Qué día de diciembre has nacido?" Sin Saltar;
					leer dia;
					si dia>=1 Y dia<=31 Entonces
						Escribir nombre, " tu signo del zodíaco es:";
					sino 
						Escribir "Tu dia es incorrecto porfavor escríbalo de nuevo";
						
					FinSi
				Hasta Que dia>=1 Y dia<=31;
		FinSegun
		
		
		//Ahora segun la fecha de nacimiento introducida vamos a determinar el signo del zodíaco
		si (dia>=21 Y dia<=31 Y mes=3) O (dia>=1 Y dia<=19 Y mes=4) Entonces
			
			Escribir "Aries";
		FinSi
		
		si (dia>=20 Y dia<=30 Y mes=4) O (dia>=1 Y dia<=21 Y mes=5) Entonces
			
			Escribir "Tauro";
		FinSi
		
		si (dia>=21 Y dia<=31 Y mes=5) O (dia>=1 Y dia<=20 Y mes=6) Entonces
			
			Escribir "Géminis";
		FinSi
		
		si (dia>=21 Y dia<=30 Y mes=6) O (dia>=1 Y dia<=22 Y mes=7) Entonces
			
			Escribir "Cáncer";
		FinSi
		
		si (dia>=23 Y dia<=31 Y mes=7) O (dia>=1 Y dia<=22 Y mes=8) Entonces
			
			Escribir "Leo";
		FinSi
		
		si (dia>=23 Y dia<=31 Y mes=8) O (dia>=1 Y dia<=22 Y mes=9) Entonces
			
			Escribir "Virgo";
		FinSi
		
		si (dia>=23 Y dia<=30 Y mes=9) O (dia>=1 Y dia<=22 Y mes=10) Entonces
			
			Escribir "Libra";
		FinSi
		
		si (dia>=23 Y dia<=31 Y mes=10) O (dia>=1 Y dia<=21 Y mes=11) Entonces
			
			Escribir "Escorpio";
		FinSi
		
		si (dia>=22 Y dia<=30 Y mes=11) O (dia>=1 Y dia<=21 Y mes=12) Entonces
			
			Escribir "Sagitario";
		FinSi
		
		si (dia>=22 Y dia<=31 Y mes=12) O (dia>=1 Y dia<=19 Y mes=1) Entonces
			
			Escribir "Capricornio";
		FinSi
		
		si (dia>=20 Y dia<=31 Y mes=1) O (dia>=1 Y dia<=18 Y mes=2) Entonces
			
			Escribir "Acuario";
		FinSi
		
		si (dia>=19 Y dia<=29 Y mes=2) O (dia>=1 Y dia<=20 Y mes=3) Entonces
		
		Escribir "Piscis";
		FinSi
		//Ahora preguntaremos al usuario si desea repetir el proceso o no
		Repetir
			Escribir "¿Desea repetir? (si o no)";
			leer repit;
		Hasta Que repit="si" O repit="no" O repit="Si" O repit="No"
	FinMientras
	
FinProceso
