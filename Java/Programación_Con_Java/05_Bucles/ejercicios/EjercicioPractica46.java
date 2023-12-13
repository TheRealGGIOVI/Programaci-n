import java.util.Scanner;

public class EjercicioPractica46 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int altura = 0;
    int anchura =  0;

    System.out.print("Porfavor, introduzca la anchura del rectángulo: ");
    anchura = sc.nextInt();

    System.out.print("Ahora porfavor introduzca la altura: ");
    altura = sc.nextInt();

    if ((altura > 2) && (anchura > 2)) {


      for (int i = 0; i < altura; i++){
        System.out.print("*");

       for (int j = 0; j < anchura; j++) {
        System.out.print(" ");
       }
       System.out.println("*");
      }
    } else {
      System.out.println("Los siento, los datos introducidos no son correctos, el valor mínimo para la anchura y altura a de ser 2");
    }
  }
}
