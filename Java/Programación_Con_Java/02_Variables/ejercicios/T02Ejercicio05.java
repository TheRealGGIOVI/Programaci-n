/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Giovanni Giove
*/
public class T02Ejercicio05 {
  public static void main(String[] args) {
    int pesetas = 1000;
    double euros = (double) pesetas / 166.386;
    System.out.printf("%d pesetas equivalen a %.3f euros \n ", pesetas, euros);
  }
}
