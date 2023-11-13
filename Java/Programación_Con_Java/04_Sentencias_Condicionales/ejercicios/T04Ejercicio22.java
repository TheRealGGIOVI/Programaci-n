import java.util.Scanner;

public class T04Ejercicio22 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final int MINUTOSTOTALES = (4 * 24 * 60) + (15 * 60);
    int diasTranscurridos = 0;

    System.out.print("Porfavor intoduzca un día de la semana (de lunes a viernes): ");
    String dia = sc.nextLine();
    

    switch (dia) {
      case "lunes":
        diasTranscurridos = 0;
        break;
      
      case "martes":
        diasTranscurridos = 1;
        break;

      case "miercoles":
      case "miércoles":
        diasTranscurridos = 2;
        break;

      case "jueves":  
        diasTranscurridos = 3;
        break;

      case "viernes":
        diasTranscurridos = 4;
        break;
      default:
         System.out.println("No has introducido un día correcto");
        break;
    }
    System.out.print("Por favor, introduce una hora: ");
    int horas = sc.nextInt();
    System.out.print("Por favor, introduce los minutos: ");
    int minutos = sc.nextInt();

    int minutosTranscurridos = (diasTranscurridos * 24 * 60) + (horas * 60) + minutos;
    System.out.println("Faltan " +(MINUTOSTOTALES - minutosTranscurridos) +" minutos para llegar al fin de semana");

    sc.close();
  }
}
