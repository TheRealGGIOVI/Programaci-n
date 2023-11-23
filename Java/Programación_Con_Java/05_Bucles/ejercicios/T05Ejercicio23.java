import java.util.Scanner;

public class T05Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numIntroducidos = 0;
    int contador = 0;
    int suma = 0;

    System.out.println("Vamos a introducir números hasta que la suma de ellos sea mayor que 10000");

   while (suma < 10000) {
      System.out.print("Introduzca números: ");
      numIntroducidos = sc.nextInt();

      suma += numIntroducidos;
      contador ++;
   }

    System.out.println("La cantidad de números totales introducidos es de: " +contador);
    System.out.println("Y la media de los números introducidos es de: " +(double)(suma/contador));

    sc.close();
  }
}
