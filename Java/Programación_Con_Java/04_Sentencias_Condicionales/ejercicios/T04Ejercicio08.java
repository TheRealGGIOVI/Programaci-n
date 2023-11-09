import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Vamos a hacer la media de tres notas, indicame la primera:");
    double primeraNota = sc.nextDouble();

    System.out.println("Ahora la segunda nota:");
    double segundaNota = sc.nextDouble();

    System.out.println("Y por último, la tercera nota:");
    double terceraNota = sc.nextDouble();

    double resultado = (primeraNota + segundaNota + terceraNota) / 3;

    System.out.println("Según las notas que has introducido, la media es de: " + resultado);

    if (resultado >= 0 && resultado <= 4) {
      System.out.println("Tu media es INSUFICIENTE");
    } else if (resultado >= 5 && resultado < 6) {
      System.out.println("Tu media es SUFICIENTE");
    } else if (resultado >= 6 && resultado <= 7) {
      System.out.println("Tu media es BIEN");
    } else if (resultado >= 7 && resultado <= 9) {
      System.out.println("Tu media es NOTABLE");
    } else {
      System.out.println("Tu media es SOBRESALIENTE");
    }

    sc.close();
  }
}
