import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Ejemplo05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    System.out.print("Introduce tres números (pueden contener decimales) separados por espacio\s: ");

    double x1 = sc.nextDouble();
    double x2 = sc.nextDouble();
    double x3 = sc.nextDouble();
    
    double media = (x1 + x2 + x3) / 3;

    System.out.println("La media de esos tres números es " + media);  
    sc.close();
  }
}
