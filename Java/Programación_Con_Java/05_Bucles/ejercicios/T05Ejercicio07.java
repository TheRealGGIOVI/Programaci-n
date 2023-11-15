import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int intentos = 0;
    int codigo = 1234;
    boolean accesoCaja = false;
    
    while (!accesoCaja && intentos <= 3) {
       System.out.print("Profavor introduzca el número secreto de 4 cifras (solo tienes 4 intentos): ");
       codigo = sc.nextInt();
      if (codigo == 1234) {
        accesoCaja = true;
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
      }else {
        System.out.println("Lo siento, esa no es la combinación");
        intentos++;
      }
    }

    sc.close();
  }
}
