import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double a;
    double b;

    System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
    System.out.println("Por favor, introduzca el valor de a:");
    a = sc.nextDouble();

    System.out.println("Ahora introduzca el valor de b:");
    b = sc.nextDouble();

    if ((a == 0) && (b != 0)) {
      System.out.println("No tiene solución real");
    } else if ((a == 0) && (b == 0)) {
      System.out.println("x = 0");
    } else {
      System.out.println("x = " + (-b / a));
    }

    sc.close();
  }
}
