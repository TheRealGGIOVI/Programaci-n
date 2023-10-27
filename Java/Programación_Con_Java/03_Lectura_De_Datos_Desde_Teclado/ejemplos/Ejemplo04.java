import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Ejemplo04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);      //creamos un objeto scanner llamado sc

    System.out.print("Introduce tu nombre y tu edad (Separados por un espacio): ");
    String nombre = sc.next();
    int edad = sc.nextInt();

    System.out.println("Tu nombre es " +nombre +" y tienes " +edad +" años");
    sc.close();

  }
}
