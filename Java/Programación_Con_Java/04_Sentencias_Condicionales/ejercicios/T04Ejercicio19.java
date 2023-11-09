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

    System.out.println("El número tiene " + digitos + " dígito(s).");

    sc.close();
  }
}
