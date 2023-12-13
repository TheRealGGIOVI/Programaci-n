import java.util.Scanner;

public class EjercicioPractica24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    int nivel = 1;

    System.out.print("Introduzca un número: ");
    n = sc.nextInt();

    int espaciosDelante = n -1;

    while (nivel <= n) {
      for (int i = 1; i <= espaciosDelante; i++) {
        System.out.print(" ");
      }

      for (int i = 1; i <= n; i++) {
        System.out.print(i);
      }

      for (int i = nivel - 1; i >= 1; i--) {
        System.out.print(i);
      }
      System.out.println();
      nivel++;
      espaciosDelante--;
    }
  }
}
