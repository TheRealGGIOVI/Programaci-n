import java.util.Scanner;

/**
 * EjercicioPractica31
 */
public class EjercicioPractica31 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int altura = 0;

    System.out.print("Introduzca la altura de la L: ");
    altura = sc.nextInt();
    
    for (int i = 0 ; i <altura - 1; i++) {
      System.out.println("*");
    }

    for (int j= 0; j < altura / 2 + 1; j++){
      System.out.print("* ");
    }

    System.out.println();

    sc.close();
  }

}