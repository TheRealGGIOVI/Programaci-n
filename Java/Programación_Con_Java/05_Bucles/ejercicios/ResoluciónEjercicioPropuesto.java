/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/

public class ResoluciónEjercicioPropuesto {
  public static void main(String[] args) {
    
    int cifraIntorudica = 0; //Almaceno la cofra introducida
    long numeroCompleto = 0; //Número que se forme al finalizar la inclusión de las cifras
    long numeroVolteado = 0;
    int digito = 0;          //Lee el digito
    int digitoMayor = 0;     //Almacena el digito mayor conforme leo el numero completo
    int numeroDigitos = 0;   //Amacena el número total de dígitos introducidos

    System.out.println("Introduzca números ebtre 0 y 9 y pulsa INTRO. Introduce un número negrativo si desea parar.");
    while (cifraIntorudica >= 0) {
      cifraIntorudica = Integer.parseInt(System.console().readLine());
      if ((cifraIntorudica >= 0 && cifraIntorudica <= 9)) {
        numeroCompleto = (numeroCompleto * 10) + cifraIntorudica;
      }
    }
    
    //le damos la vuelta al número y además vamos a ver cual es el digito mayor
    while (numeroCompleto > 0) {
      digito = (int) (numeroCompleto % 10);
      if (digito > digitoMayor ) {
        digitoMayor = digito;
      }
      numeroVolteado = (numeroVolteado * 10) + digito;
      numeroCompleto /= 10;
      numeroDigitos++;
    }

    //Empezas a mostrarlo en forma de tabla, teniendo en cuenta que hay que pintar digitoMayor +1 columnas y numeroDigitos filas
    int numeroColumnas = digitoMayor + 1;
    int numeroFilas = numeroDigitos;
    

    //Pintamos la primera hilera de guiones
    for (int i = 1; i <= numeroColumnas; i++){
      System.out.print(" ---");

    }
    //Empezamos a pintar las filas
    for (int i = 1; i <= numeroFilas; i++) {
      System.out.println();
      digito = (int) (numeroVolteado % 10);   //Cojo el dígito menos significativo del número volteado
      numeroVolteado /= 10;
      System.out.print("| " +digito +" |");   //Pintamos la 1ª columna, al de los dígitos introducidos

      //Pintamos tantas columnas con asteriscos como indique el digito
      for (int j = 1; j <= digito; j++) {
        System.out.print(" * |");
      }

     //Pintamos el resto de columnas sin asteriscos
     for (int j = 1; j <= numeroColumnas - digito - 1 ; j++) {
      System.out.print("   |");
     }
     System.out.println();
     for (int j = 1; j <= numeroColumnas; j++) {
      System.out.print(" ---");
     }
     
    }


    

  } 
}
