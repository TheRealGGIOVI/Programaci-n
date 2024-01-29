/**
 * Ejercicio 1
 * 
 * @author Giovanni Giove
*/
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-D-I-V-I-N-A-R-E-M-");
            System.out.println("Divinarem pensará un número entre los valores que tú decidas");
            System.out.print("Introduzca el valor mínimo del intervalo: ");
            int min = sc.nextInt();
            System.out.print("Introduzca el valor máximo del intervalo: ");
            int max = sc.nextInt();

            int intervaloMin = (int) (Math.random() * (max - min + 1) + min);
            int intervaloMax = (int) (Math.random() * (max - min + 1) + min);

            int intervaloRealMin = Math.min(intervaloMin, intervaloMax);
            int intervaloRealMax = Math.max(intervaloMin, intervaloMax);

            System.out.println("-D-I-V-I-N-A-R-E-M-");
            System.out.println("Estoy pensando en un número entre " + intervaloRealMin + " y " + intervaloRealMax);

            int intentos = (int) (Math.log(intervaloRealMax - intervaloRealMin + 1) / Math.log(2));

            System.out.println("Tienes " + intentos + " intentos");

            int numeroCorrecto = (int) (Math.random() * (intervaloRealMax - intervaloRealMin + 1) + intervaloRealMin);
            boolean haAdivinado = false;

            for (int i = 1; i <= intentos; i++) {
                System.out.print("Escribe el número: ");
                int intento = sc.nextInt();

                if (intento < numeroCorrecto) {
                    System.out.println("Te has quedado corto");
                } else if (intento > numeroCorrecto) {
                    System.out.println("Te has pasado");
                } else {
                    System.out.println("Enhorabuena!!!! has acertado.");
                    System.out.println("Efectivamente el número era: " + numeroCorrecto);
                    haAdivinado = true;
                    break;
                }
            }

            if (!haAdivinado) {
                System.out.println("Has superado el número de intentos.");
                System.out.println("El número que había pensado era: " + numeroCorrecto);
            }

            System.out.println("Elige una opción");
            System.out.println("1. Volver a jugar.");
            System.out.println("2. Salir del juego.");
            System.out.print("Opción: ");
            int opcion = sc.nextInt();

            if (opcion != 1) {
                System.out.println("Gracias por jugar a -D-I-V-I-N-A-R-E-M-");
                break;
            }
        }
    }
}