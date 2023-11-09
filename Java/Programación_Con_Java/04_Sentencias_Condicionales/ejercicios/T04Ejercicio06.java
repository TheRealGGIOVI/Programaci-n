import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    final double G = 9.81;

    System.out.println("Vamos a calcular el tiempo que tarda en caer un objeto, indicame una altura:");
    float altura = sc.nextFloat();

    if (altura <= 0) {
      System.out.println("La altura no puede ser igual o menor que 0");
    }

    double resultado = Math.sqrt(2 * altura / G);
    if (resultado < 0) {
      System.out.println("Resultado inváido");
    }

    System.out.println("El objeto tarda en caer: " + resultado + " segundos");

    sc.close();
  }
}
