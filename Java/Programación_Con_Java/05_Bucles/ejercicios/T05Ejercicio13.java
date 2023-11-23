import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int positivos = 0;
    int negativos = 0;

    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce diez números enteros");
      int numero = sc.nextInt();

      if (numero > 0) {
        positivos++;
      } else {
        negativos++;
      }
    }

    System.out.println("Números positivos: " + positivos);
    System.out.println("Números negativos: " + negativos);
    sc.close();
  }
}
