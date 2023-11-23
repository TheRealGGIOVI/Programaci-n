import java.util.Scanner;

/**
 * Pregunta 3 del examen
 * 
 * @author Giovanni Giove
*/
public class EjCalculadora {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double num1 = 0;
    double num2 = 0;
    String signoAritmetico;

    System.out.print("Escribe el primer operando: ");
    num1 = sc.nextDouble();

    System.out.print("Escribe el código de operación (+, -, *, /, ^, %):");
    signoAritmetico = sc.next();

    System.out.print("Escribe el segundo operando: ");
    num2 = sc.nextDouble();

    sc.close();
    switch (signoAritmetico) {
      case "+":
        System.out.printf("%.2f %s %.2f %s %.2f", num1, signoAritmetico, num2, "=", num1 + num2);
        break;
      case "-":
        System.out.printf("%.2f %s %.2f %s %.2f", num1, signoAritmetico, num2, "=", num1 - num2);
        break;
      case "*":
        System.out.printf("%.2f %s %.2f %s %.2f", num1, signoAritmetico, num2, "=", num1 * num2);
        break;
      case "/":
        System.out.printf("%.2f %s %.2f %s %.2f", num1, signoAritmetico, num2, "=", num1 / num2);
        break;
      case "^":
        System.out.printf("%.2f %s %.2f %s %.2f", num1, signoAritmetico, num2, "=", (Math.pow(num1, num2)));
        break;
      case "%":
        System.out.printf("%.2f %s %.2f %s %.2f", num1, signoAritmetico, num2, "=", num1 % num2);
        break;
      default:
        System.out.println("No has introducido ninguna operación válida");
        break;
    }
  }
}
