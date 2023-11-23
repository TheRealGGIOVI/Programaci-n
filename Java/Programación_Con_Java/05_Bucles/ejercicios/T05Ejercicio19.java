import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = sc.nextInt();
    System.out.print("Introduce el carácter con el que se pinta la pirámide: ");
    char caracter = sc.next().charAt(0);

    for (int i = 1; i <= altura; i++) {

      for (int j = 1; j <= altura - i; j++) {
        System.out.print(" ");
      }

      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print(caracter);
      }

      System.out.println();
    }

    sc.close();
  }
}
