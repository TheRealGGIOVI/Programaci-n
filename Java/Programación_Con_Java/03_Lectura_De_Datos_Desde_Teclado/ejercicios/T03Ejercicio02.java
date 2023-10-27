import java.util.Scanner;

/**
 * Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 * convertir debe ser introducida por teclado
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce una cantidad de euros: ");
    double euros = sc.nextDouble();

    System.out.println(euros +" equivaldrían a " +(euros*166.386) +" pesetas");
    sc.close();
  }
}
