import java.util.Scanner;
/**
 * Ejercicio 3
 * 
 * @author Giovanni Giove
*/
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEntero = 0;
        int sumaDivisores = 0;

        System.out.print("Porfavor introduzca un número entero. ");
        numEntero = sc.nextInt();

        for (int i = 1; i <= numEntero/2; i++) {
            if (numEntero % i == 0) {
                System.out.print(i + " ");
                sumaDivisores += i;
            }
        }

        System.out.println("\nSuma de los divisores propios y el 1: " + (sumaDivisores));

        if (sumaDivisores  == numEntero) {
            System.out.println("Es un número perfecto.");
        } else {
            System.out.println("No es un número perfecto.");
        }

      sc.close();
    }
}
