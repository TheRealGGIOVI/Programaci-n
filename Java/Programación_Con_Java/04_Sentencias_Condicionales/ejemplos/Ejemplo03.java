import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Ejemplo03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numSemana;

    System.out.print("Introduce un día de la semana: ");
    numSemana = sc.nextInt();

    switch (numSemana) {
      case 1,2,3,4,5:
        System.out.println("No es fin de semana");
        break;
      // case 2:
      //   System.out.println("No es fin de semana");
      //   break;
      // case 3:
      //   System.out.println("No es fin de semana");
      //   break;
      // case 4:
      //   System.out.println("No es fin de semana");
      //   break;
      // case 5:
      //   System.out.println("No es fin de semana");
      //   break;
      case 6,7:
        System.err.println("Es fin de semaan!");
        break;
      // case 7:
      //   System.out.println("Es fin de semana!");
      //   break;
      default:
        System.out.println("** Error no se corresponde a un dia de la semana");
        break;
    }

  sc.close();
  }
}
