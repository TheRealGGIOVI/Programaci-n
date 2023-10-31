import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Ejemplo02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Introduce un número entre el 1 y el 100: ");
    numero = sc.nextInt();

    if ((numero >= 1) && (numero <=100)) {
      System.out.println("El valor introducido está en el rango correcto");
    } else {
      System.out.println("Te he dicho un valor entre el 1 y el 100!");
    }

    sc.close();
  }
  
}