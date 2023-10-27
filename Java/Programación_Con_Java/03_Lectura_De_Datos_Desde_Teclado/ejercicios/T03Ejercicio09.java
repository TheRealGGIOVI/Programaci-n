import java.util.Scanner;

/**
 * Escribe un programa que calcule el volumen de un cono según la fórmula V =1/3πr^2h
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("vamos a calcular la base de un cono");

    System.out.print("¿Cuál es el radio del cono? ");
    int radio = sc.nextInt();
    
    System.out.print("¿Y cuál es su altura? ");
    double altura = sc.nextDouble();

    double nPi = 3.1416/3;

    System.out.printf("El volumen del cono será de: %.2f m^3" ,nPi*(radio^2)*altura);

    sc.close();
  }
}
