import java.util.Scanner;

/**
 * Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 * convertir debe ser introducida por teclado.
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca una cantidad de pesetas: ");
    int pesetas = sc.nextInt();

    System.out.println(pesetas +" pesetas equivaldrían a " +(double)(pesetas*0.00601012) +" euros");
    sc.close();
  }
}
