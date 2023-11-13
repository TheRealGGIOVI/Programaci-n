import java.util.Scanner;
/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número entero: ");
    int numero = sc.nextInt();

    int digitos = String.valueOf(Math.abs(numero)).length();

    if (digitos >= 6) {
      System.out.println("El número introducido tiene más de 5 digitos");
    } else {
      System.out.println("El número tiene " + digitos + " dígitos.");
    }

    sc.close();
  }
}
