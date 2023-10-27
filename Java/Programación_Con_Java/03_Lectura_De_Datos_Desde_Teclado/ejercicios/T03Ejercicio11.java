import java.util.Scanner;

/**
 * Realiza un conversor de Kb a Mb.
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce una cantidad de Kb: ");
    int Kb = sc.nextInt();

    System.out.println(Kb +" equivalen a " +(double)(Kb/1000) +" MegaBytes");

    sc.close();
  }
}
