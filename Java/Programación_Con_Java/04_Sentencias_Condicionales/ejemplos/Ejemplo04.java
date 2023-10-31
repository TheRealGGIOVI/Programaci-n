import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Ejemplo04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int edad;

    System.out.print("Introduzca tu edad: ");
    edad = sc.nextInt();

    if ((edad >= 0) && (edad <=17)) {
      System.out.println("Eres aún menor de edad");
 
    } else {
       if ((edad >= 18) && (edad <=64)) {
      System.out.println("Eres mayor de edad");

      } else {
         if (edad >=65) {
        System.out.println("Ya estas jubilado");
        }
      }
    }
     
    sc.close();
  }
}
