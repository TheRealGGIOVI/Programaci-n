import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Vamos a resolver una ecuación de segundo grado. \nIntroduzca los valores de a, b y c. ");
    System.out.println("El valor de a es:");
    double a = sc.nextDouble();

    System.out.println("El valor de b es:");
    double b = sc.nextDouble();

    System.out.println("El valor de c es:");
    double c = sc.nextDouble();

    if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene un número infinito de soluciones");
    } else if ((a == 0) && (b == 0) && (c != 0)) {
      System.out.println("No se puede solucionar la ecuación con los valores proporcionados.");
    } else if ((a != 0) && (b != 0) && (c == 0)) {
      System.out.println("x1 = 0");
      System.out.println("x2 =" + (-b / a));
    } else if ((a == 0) && (b != 0) && (c != 0)) {
      System.out.println("x1 = x2 = " + (-c / b));
    } else if ((a != 0) && (b != 0) && (c != 0)) {
      double sobrante = b * b - (4 * a * c);

      if (sobrante < 0) {
        System.out.println("La ecuación no tiene solución");
      } else {
        System.out.println("x1 = " + (-b * Math.sqrt(sobrante)) / (2 * a));
        System.out.println("x2 = " + (-b * Math.sqrt(sobrante)) / (2 * a));
      }
    }

    sc.close();
  }
}
