import java.util.Scanner;

public class EjercicioPractica33 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    
    System.out.print("Introduzca la altura de la U: ");
    int altura = sc.nextInt();

    for (int i = 1; i < altura; i++) {
      System.out.print("*");
      for (int j = 1; j <= altura - 2; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }
    // for (int i = 1; i < altura; i++) {
    //   System.out.print("*");
    //   for (int j = 1; j <= altura - 2; j++) {
    //     System.out.print(" ");
    //   }
    //   System.out.println("*");
    // }
    System.out.print(" ");
    for (int i = 1; i < altura -1; i++) {
      System.out.print("*");
    }

    sc.close();
  }
}
