import java.util.Scanner;

/**
 * Realiza un conversor de Mb a Kb.
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce una cantidad de Mb: ");
    int Mb = sc.nextInt();

    System.out.println(Mb +" equivalen a " +(Mb*1000) +" KiloBytes");

    sc.close();
  }
}
