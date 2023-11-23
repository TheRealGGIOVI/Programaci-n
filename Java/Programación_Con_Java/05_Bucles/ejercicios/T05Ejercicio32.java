import java.util.Scanner;

public class T05Ejercicio32 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Por favor, introduzca un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    long numeroVolteado = 0;
    int numeroCifras = 0;
    int digito;
    int sumaPares = 0;

    //Al tener que mostrarlos de izquierda a derecha, mejor voltearemos el número como haciamos en el Ejercicio 25
    //y de paso calculamos el número de cifras
    while (numeroIntroducido > 0) {
      numeroVolteado = (numeroIntroducido % 10) + (numeroVolteado * 10);
      numeroIntroducido /= 10;
      numeroCifras++;
    }

    System.out.print("Dígitos pares: ");

    for (int i = 0; i < numeroCifras; i++) {
      digito = (int)  (numeroVolteado % 10);   // (int) es para pasar el Long de numeroVolteado a in, es decir para castearlo
      //Una vez tomada la cifra, vemos si es par haciendo la operacion MOD 2
      if (digito % 2 == 0) {
        System.out.print(digito + " ");   // Muestra los dígitos pares
        sumaPares += digito;
      }
      numeroVolteado /= 10;   //Dividimos por 10 para obtener la siguiente cifra del número volteado
    }
    System.out.println("\nLa suma de los dígitos pares es " + sumaPares);

      sc.close();
  }
}
