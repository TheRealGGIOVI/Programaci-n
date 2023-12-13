import java.util.Scanner;

/**
 * Hacer un ejercicio que pida por teclado un carácter y, a continuación, una serie de números enteros (de 0 en adelante) hasta que se introduzca un número negativo. A continuación se mostrará una tabla donde en la primera columna aparecerán los números introducidos y en cada fila aparecerá repetido el carácter introducido tantas veces como indique la primera columna.
 * 
 * @author Giovanni Giove
*/
public class EjercicioPropuesto {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    System.out.print("Introduce un carácter: ");
    char caracter = sc.nextLine().charAt(0);

    
    int numero = 0;
    System.out.println("Introduce números enteros (>= 0). Introduce un número negativo para finalizar: ");

    System.out.println("Tabla:");

    
    System.out.println("Número\t\tCarácter");
    

    boolean continuar = true;
    while (continuar) {
        System.out.print(numero + "\t\t");
        
        for (int i = 0; i < numero; i++) {
            System.out.print(caracter);
        }
        System.out.println();

        
        numero = sc.nextInt();
        
        // numero = sc.nextInt();

        
        if (numero < 0) {
            continuar = false;
        }
    }

    System.out.println("Programa finalizado.");
    sc.close();
  }
}