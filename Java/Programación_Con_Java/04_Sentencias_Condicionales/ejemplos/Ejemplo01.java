import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Ejemplo01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int nota;

    System.out.print("¿Qué not has sacado? ");
    nota = sc.nextInt();

    //Sentencia if-else
    if (nota >= 5) {
      System.out.println("Enhorabuena has aprobado!");
    } else {
      System.out.println("Lo siento pero has supendido :(");
    }
      
    sc.close();
  }

}