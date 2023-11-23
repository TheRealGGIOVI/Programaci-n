import java.util.Scanner;

/**
 * Pregunta 2 del examen
 * 
 * @author Giovanni Giove
*/
public class EjAscensor {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //Declaraciones globales
    int pisoDestino = 0;
    int pisoActual = 0;
    int numPersonas = 0;
    int pesoTotal = 0;

    

    //Bucle para ejecutar el programa hasta que el usuario desee finalizar.
    while (pisoDestino != -1) {
      System.out.print("¿A qué piso desea viajar? ");
    pisoDestino = sc.nextInt();
     if ((pisoDestino <= 10) && (pisoDestino >= 0) ) {
      
      if ((pisoDestino - pisoActual != 1) && (pisoDestino - pisoActual != -1)) {
        System.out.print("¿Cuántas personas vais a viajar? ");
        numPersonas = sc.nextInt();

        System.out.print("¿Cuál es el peso total? ");
        pesoTotal = sc.nextInt();
        
        if (numPersonas > 4) {
          System.out.println("Lo sentimos se excede el número de personas permitidas en el ascensor");
        } else if (pesoTotal > 300) {
          System.out.println("Lo sentimos el peso actual excede el máximo permitido");
        } else if (pisoDestino > pisoActual) {
          System.out.println("Subiendo a " +pisoDestino);
          pisoActual = pisoDestino;
        } else {
          System.out.println("Bajando a " +pisoDestino);
          pisoActual = pisoDestino;
        }
 
      } else{
        System.out.println("Para 1 solo piso coge las escaleras vago");
      } 
    }
    
  }
}
}
    

