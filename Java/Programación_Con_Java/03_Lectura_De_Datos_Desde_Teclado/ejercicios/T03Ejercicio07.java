import java.util.Scanner;

/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible.
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio07 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in); 

   System.out.println("Introduzca la base imponible de la factura: ");
   double baseImponible = sc.nextDouble();
   double IVA = 1.21;
   double total = baseImponible*IVA;

   System.out.printf("El total de la factura (I.V.A.) includio es de: %.2f euros" ,total );

   sc.close();
  }
}
