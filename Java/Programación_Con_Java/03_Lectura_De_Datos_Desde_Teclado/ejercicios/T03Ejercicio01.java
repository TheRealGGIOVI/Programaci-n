import java.util.Scanner;

/**
 * Realiza un programa que pida dos números y que luego muestre el resultado
 * de su multiplicación.
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio01 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce dos número separados por espacios (puden ser decimales): ");
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();

    System.out.println("El resultado de la multiplicación de ambos número es " +(num1*num2));
    sc.close();


  }
}
