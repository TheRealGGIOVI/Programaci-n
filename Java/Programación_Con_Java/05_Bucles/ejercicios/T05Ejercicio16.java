import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce un número");
    int numero = sc.nextInt();

    boolean esPrimo = true;

    if (numero <= 1) {
      esPrimo = false;
    } else {
      boolean divisorEncontrado = false;
      for (int i = 2; i <= Math.sqrt(numero); i++) {
        if (numero % i == 0) {
          esPrimo = false;
          divisorEncontrado = true;
        }
      }

      if (divisorEncontrado) {
        esPrimo = false;
      }
    }

    if (esPrimo) {
      System.out.println(numero + " es un número primo.");
    } else {
      System.out.println(numero + " no es un número primo.");
    }
    sc.close();
  }
}
