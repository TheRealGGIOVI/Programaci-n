import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio07 {
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

    sc.close();
  }
}
