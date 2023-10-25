/**
 * Escribe un programa que calcule el total de una factura a partir de la base
 * imponible (precio sin IVA). La base imponible estará almacenada en una
 * variable.
 * 
 * @author Giovanni Giove
*/
public class T02Ejercicio06 {
  public static void main(String[] args) {
    double baseImponible = 37.81;

    System.out.printf("Base Imponible  %8.2f\n", baseImponible);
    System.out.printf("IVA             %8.2f\n", 01.21);
    System.out.printf("---------------------\n");
    System.out.printf("Improte total:  %8.2f\n", baseImponible * 1.21);
  }
}
