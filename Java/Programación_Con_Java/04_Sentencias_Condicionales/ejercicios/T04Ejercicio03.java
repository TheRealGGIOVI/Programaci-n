import java.util.Scanner;
/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Escribe un número del 1 al 7.");
    String num = sc.nextLine();

    switch (num) {
      case "1":
        System.out.println("Es lunes");
        break;
      case "2":
        System.out.println("Es martes");
        break;
      case "3":
        System.out.println("Es miercoles");
        break;
      case "4":
        System.out.println("Es jueves");
        break;
      case "5":
        System.out.println("Es viernes");
        break;
      case "6":
        System.out.println("Es sábado");
        break;
      case "7":
        System.out.println("Es domingo");
        break;
      default:
        System.out.println("Has introducido un valor inválido");
        break;
    }

    sc.close();
  }
}
