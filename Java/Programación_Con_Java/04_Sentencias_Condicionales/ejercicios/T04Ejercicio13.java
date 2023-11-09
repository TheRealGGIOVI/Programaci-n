import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio13 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese el primer número: ");
    int num1 = sc.nextInt();

    System.out.print("Ingrese el segundo número: ");
    int num2 = sc.nextInt();

    System.out.print("Ingrese el tercer número: ");
    int num3 = sc.nextInt();

    int mayor = Math.max(num1, Math.max(num2, num3));
    int menor = Math.min(num1, Math.min(num2, num3));
    int medio = (num1 + num2 + num3) - mayor - menor;

    System.out.println("Los números ordenados de menor a mayor son: " + menor + ", " + medio + ", " + mayor);

    sc.close();
  } 

}