import java.util.Scanner;
/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la hora (formato de 0 a 23): ");
    int hora = sc.nextInt();

    if (hora >= 6 && hora <= 12) {
      System.out.println("Buenos días");
    } else if (hora >= 13 && hora <= 20) {
      System.out.println("Buenas tardes");
    } else {
      System.out.println("Buenas noches");
    }

    sc.close();
  }
}
