import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la base, debe ser un número real: ");
    double base = sc.nextDouble();
    System.out.print("Introduce el exponente entero y positivo: ");
    int exponente = sc.nextInt();

    for (int i = 1; i <= exponente; i++) {
      double resultado = 1;
      for (int j = 1; j <= i; j++) {
        resultado *= base;
      }
      System.out.println(base + " elevado a la " + i + " es igual a " + resultado);
    }

    sc.close();
  }
}
