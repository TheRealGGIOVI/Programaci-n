import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    System.out.print("Introduce un número del 1 al 10: ");
    num = sc.nextInt();

    
    for(int j = 0; j <= 10; j++){
      System.out.println(num + " * " +j + " = " +num*j);
    }
    

    sc.close();
  }
}
