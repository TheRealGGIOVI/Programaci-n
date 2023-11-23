/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio12 {
  public static void main(String[] args) {
    System.out.println("Este programa muestra los n primeros números de la serie de Fibonacci");
    System.out.print("Porfavor introduzca n: ");
    int n = Integer.parseInt(System.console().readLine());
    switch (n) {
      case 1:
        System.out.println("0");
        break;
      
      case 2:
        System.out.println("0 1");
        break;
      default:
        System.out.print("0 1");
        int primero = 0;
        int segundo = 1;
        int siguiente;
        while (n > 2) {
          siguiente = primero + segundo;
          primero = segundo;
          segundo = siguiente;
          System.out.print(" " + siguiente);
          n--;
        }
        break;
    }
  }
}
