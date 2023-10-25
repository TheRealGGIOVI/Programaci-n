/**
 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Giovanni Giove
*/
public class Ejercicio04 {
  public static void main(String[] args) {
    double euros = 8;
    double pesetas = (double) euros * 166.386;
    System.out.println(euros +" euros equivales a " +pesetas + " pesetas");
  }
}
