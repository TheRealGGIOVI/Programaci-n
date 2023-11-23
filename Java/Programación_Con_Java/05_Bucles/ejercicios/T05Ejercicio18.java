import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el primer número: ");
    int numero1 = sc.nextInt();
    System.out.print("Introduce el segundo número, este debe ser distinto del primero: ");
    int numero2 = sc.nextInt();

    if (numero1 == numero2) {
      System.out.println("Los números introducidos son iguales, deben ser distintos.");
    } else {
      int menor = Math.min(numero1, numero2);
      int mayor = Math.max(numero1, numero2);

      System.out.println("Números enteros entre " + menor + " y " + mayor + " (incremento de 7):");
      for (int i = menor; i <= mayor; i += 7) {
        System.out.println(i);
      }
    }

    sc.close();
  }
}
