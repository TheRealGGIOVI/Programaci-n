import java.util.Scanner;

public class T05Ejercicio31 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la altura de la L: ");
    int altura = sc.nextInt();

    if (altura < 2) {
      System.out.println("La altura es demasiado baja para dibujar una L.");
    } else {
      
      for (int i = 0; i < altura - 1; i++) {
        System.out.println("*");
      }

      
      for (int i = 0; i < altura / 2 + 1; i++) {
        System.out.print("* ");
      }

      System.out.println();
    }

    sc.close();
  }
}