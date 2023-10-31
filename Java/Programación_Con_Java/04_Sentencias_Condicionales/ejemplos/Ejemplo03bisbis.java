import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Ejemplo03bisbis {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numSemana;

    System.out.print("Introduce un día de la semana: ");
    numSemana = sc.nextInt();

    switch (numSemana) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
        System.out.println("No es fin de semana");
        break;
      case 6:
      case 7:
        System.err.println("Es fin de semaan!");
        break;
      default:
        System.out.println("** Error no se corresponde a un dia de la semana");
        break;
    }

  sc.close();
  }
}
