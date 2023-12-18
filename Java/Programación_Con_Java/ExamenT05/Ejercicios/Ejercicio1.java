import java.util.Scanner;

/**
 * Ejercicio 1
 * 
 * @author Giovanni Giove
*/
public class Ejercicio1 {

    public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);

      while (true) {
        System.out.print("Introduce tu nombre y apellidos (Apellido1 Apellido2, Nombre)): ");
        String nombre = sc.nextLine();

        System.out.print("Porfavor introduzca la nota del primer trimestre (0-10): ");
        int primerTrimestre = sc.nextInt();
        System.out.print("Porfavor introduzca la nota del segundo trimestre (0-10): ");
        int segundoTrimestre = sc.nextInt();
        System.out.print("Porfavor introduzca la nota del tercer trimestre (0-10): ");
        int tercerTrimestre = sc.nextInt();

        if (primerTrimestre < 0 || primerTrimestre > 10 || segundoTrimestre < 0 || segundoTrimestre > 10 || tercerTrimestre < 0 || tercerTrimestre > 10) {
          System.out.println("Nota inválida, porfavor inténtelo de nuevo y asegúrese de que la nota sea entre 0 y 10.");
          
        }

        double notaFinal = (primerTrimestre + segundoTrimestre + tercerTrimestre) / 3.0;

        System.out.print("\033[32m"); 
        if (notaFinal < 5) {
          System.out.print("\033[31m"); 
        }
        System.out.printf("%-" + nombre.length() + "s %10d %10d %10d %10.2f\n", nombre, primerTrimestre, segundoTrimestre, tercerTrimestre, notaFinal);
        System.out.print("\033[0m"); 

        System.out.print("¿Quieres continuar introduciendo notas de nuevos alumnos? (S/N): ");
        String respuesta = sc.next();

        if (respuesta.equalsIgnoreCase("N")) {
          System.out.println("Programa finalizado!");
          
        } else if (respuesta.equalsIgnoreCase("S")) {
          
        } else {
          System.out.println("Respuesta no válida porfavor introduzca 'S' o 'N'.");
          
          }
        }

    }
}