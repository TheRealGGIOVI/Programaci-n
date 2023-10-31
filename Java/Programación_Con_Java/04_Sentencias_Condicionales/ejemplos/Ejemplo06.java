import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Ejemplo06 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int opcion;
    double base;
    double altura;

    System.out.print("Selecciona una de las siguientes opcciones para calcular un área: \n 1-Cuadrado \n 2-Rectángulo \n 3-Triángulo \n");
    opcion = sc.nextInt();

    switch (opcion) {
      case 1:
        System.out.print("Introduzca el valor de un lado del cuadrado: ");
        base = sc.nextDouble();
        
        System.out.printf("El área del cuadrado es de: %2.f m^2", base*2);
        break;
      case 2:
        System.out.print("Introduce el valor de la base y la altura del rectángulo (separados por un espacio): ");
        base = sc.nextDouble();
        altura = sc.nextDouble();

        System.out.printf("El área del rectángulo es de: %.2f m^2", base*altura);
        break;
      case 3:
        System.out.printf("Introduce el valor de la base y de la altura del triángulo (separados por un espacio): ");
        base = sc.nextDouble();
        altura = sc.nextDouble();

        System.out.printf("El área del triángulo es de: %.2f m^2", (base*altura)/2);
        break;
        default:
        System.out.println("**Error: elige una de las tres opciones");
        break;
    }

    sc.close();
  }
}
