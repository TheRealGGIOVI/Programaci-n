import java.util.Scanner;
/**
 * Ejercicio 2
 * 
 * @author Giovanni Giove
*/
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String jugador1;
        String jugador2;
        int puntajeJugador1 = 0;
        int puntajeJugador2 = 0;

        System.out.print("Porfavor indique el nombre del jugador 1: ");
        jugador1 = sc.next();

        System.out.print("Porfavor indique el nombre del jugador 2: ");
        jugador2 = sc.next();

        while (puntajeJugador1 < 3 && puntajeJugador2 < 3) {
            System.out.print("Porfavor " +jugador1 +" introduce tu jugada (piedra, papel, tijera): ");
            String jugadaJugador1 = sc.next();
            System.out.println("\033[H\033[2J");

            System.out.print("Porfavor " +jugador2 +" introduce tu jugada (piedra, papel, tijera): ");
            String jugadaJugador2 = sc.next();

            if (jugadaJugador1.equalsIgnoreCase("piedra") && jugadaJugador2.equalsIgnoreCase("tijera")) {
                puntajeJugador1++;
            } else if (jugadaJugador1.equalsIgnoreCase("papel") && jugadaJugador2.equalsIgnoreCase("piedra")) {
                puntajeJugador1++;
            } else if (jugadaJugador1.equalsIgnoreCase("tijera") && jugadaJugador2.equalsIgnoreCase("papel")) {
                puntajeJugador1++;
            } else if (jugadaJugador2.equalsIgnoreCase("piedra") && jugadaJugador1.equalsIgnoreCase("tijera")) {
                puntajeJugador2++;
            } else if (jugadaJugador2.equalsIgnoreCase("papel") && jugadaJugador1.equalsIgnoreCase("piedra")) {
                puntajeJugador2++;
            } else if (jugadaJugador2.equalsIgnoreCase("tijera") && jugadaJugador1.equalsIgnoreCase("papel")) {
                puntajeJugador2++;
            }

            System.out.println("\033[H\033[2J");
            System.out.println("Puntaje: " + jugador1 + " - " + puntajeJugador1 + ", " + jugador2 + " - " + puntajeJugador2);
        }

        // System.out.println("\033[H\033[2J");
        if (puntajeJugador1 > puntajeJugador2) {
            System.out.println("El ganador es " + jugador1);
        } else if (puntajeJugador1 < puntajeJugador2) {
            System.out.println("El ganador es " + jugador2);
        } else {
            System.out.println("Empate");
        }
      
      sc.close();
    }
}