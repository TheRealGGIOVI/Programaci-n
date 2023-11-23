import java.util.Scanner;
/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio21 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int numIntroducidos = 0;
  int numPares = 0;
  int numImpares = 0;
  int contador = 0;
  int pares = 0;
  int impares = 0;

  while (numIntroducidos >= 0) {
    System.out.print("Introduzca un número: ");
    numIntroducidos = sc.nextInt();

    contador += 1;

    if (numIntroducidos % 2 == 0) {
      pares += numIntroducidos;  
      numPares ++;
    }

    if (numIntroducidos % 2 != 0) {
      impares += numIntroducidos;
      numImpares ++;
    }

  }

  System.out.println("Se han introducido un total de " +contador + " números");
  System.out.println("La media de los números impares introducidos es: " +(double)(impares/numImpares));
  System.out.println("El número par más grande introducido es: ");
 } 
}
