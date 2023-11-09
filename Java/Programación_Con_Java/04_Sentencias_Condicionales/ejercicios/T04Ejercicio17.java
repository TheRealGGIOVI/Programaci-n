import java.util.Scanner;
/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio17 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número entero: ");
    int numero = sc.nextInt();

    int ultimaCifra = Math.abs(numero) % 10; // Usamos Math.abs para asegurarnos de que el número sea positivo.

    System.out.println("La última cifra del número es: " + ultimaCifra);

    sc.close();
  }
}
