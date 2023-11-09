import java.util.Scanner;
/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Dime un dia de autla semana para saber que asignatura tienes a primera hora");
    String dia = sc.nextLine();
    dia.toLowerCase();

    switch (dia) {
      case "lunes":
        System.out.println("Tienes FOL, aunque si la conválidas, tu primera asignatura es SINF.");
        break;
      case "martes":
        System.out.println("Tienes Programación");
        break;
      case "miercoles":
        System.out.println("Tienes Entornos de Desarrollo");
        break;
      case "jueves":
        System.out.println("Tienes BBDD");
        break;
      case "viernes":
        System.out.println("Tienes Programación");
        break;
      case "sabado":
        System.out.println("No hay clases los sábados");
        break;
      case "domingo":
        System.out.println("No hay clases los domingos");
        break;
      default:
        System.out.println("El dato introducido no es un día.");
    }

    sc.close();
  }

}