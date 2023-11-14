import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class ejemploDoWhile02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numPar = 0;
    do {
      System.out.print("Introduce un número par: ");
      numPar = sc.nextInt();
      if (numPar % 2 == 0) {
        System.out.println("Ay que bonito es el número par " +numPar);
      } else{
        System.out.println("No me gustan los números impares. Adiós");
      }
    } while (numPar % 2 == 0);

    sc.close();
  }
}
