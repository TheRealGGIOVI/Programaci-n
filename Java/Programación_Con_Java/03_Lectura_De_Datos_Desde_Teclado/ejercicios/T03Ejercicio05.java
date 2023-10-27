import java.util.Scanner;

/**
 * Escribe un programa que calcule el área de un rectángulo.
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Vamos a calcular el área de un ractángulo, para ello introduzca su base y su altura (separadas por un espacio)");
    double base = sc.nextDouble();
    double altura = sc.nextDouble();

    System.out.println("El área del rectángulo será de: " +(base*altura) +" m^2");
    sc.close();
  }
}
