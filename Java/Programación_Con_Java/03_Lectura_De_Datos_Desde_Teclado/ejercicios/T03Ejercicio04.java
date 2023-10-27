import java.util.Scanner;

/**
 * Escribe un programa que sume, reste, multiplique y divida dos números
 * introducidos por teclado.
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduzca dos números separados por un espacio (pueden llevar decimales): ");
    double num1 = sc.nextDouble();
    double num2 = sc.nextDouble();

    System.out.println("La suma de ambos números es: " +(num1+num2));
    System.out.println("La resta de diferencia de ambos números es: " +(num1-num2));
    System.out.println("La multiplicación de ambos números es: " +(num1*num2));
    System.out.println("La división de ambos números es: " +(num1/num2));
    sc.close();

  }
  
}