/**
 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
 * convertir deberá estar almacenada en una variable.
 * 
 * @author Giovanni Giove
*/
public class Ejercicio05 {
  public static void main(String[] args) {
    double pesetas = 5000;
    double euros = (double) pesetas / 166.386;
    System.out.println(pesetas +" pesetas equivalen a " +euros + " euros");
  }
}
