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
    double radio = sc.nextDouble();
    
    System.out.print("¿Y cuál es su altura? ");
    double altura = sc.nextDouble();

    double nPi = Math.PI/3;

    System.out.printf("El volumen del cono será de: %.2f cm^3" ,nPi*(radio*radio)*altura);

    sc.close();
  }
}
