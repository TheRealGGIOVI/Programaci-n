import java.util.Scanner;

/**
 * Escribe un programa que calcule el área de un triángulo.
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Vamos a calcular el área de un triángulo, para ello escriba su base y su altura (separadas por un espacio): ");
    double base = sc.nextDouble();
    double altura = sc.nextDouble();

    double area = base*altura;
    System.out.println("El área del triñangulo será de: " +(area/2) +" m^2");
    sc.close();
  }
}
