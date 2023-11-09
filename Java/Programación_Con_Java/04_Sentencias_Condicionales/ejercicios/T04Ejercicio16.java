import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio16 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int puntuacion = 0;
    String respuesta;

    System.out.println("##### ¿Es tu pareja infiel? ####");
    System.out.println("Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("Ha aumentado sus gastos de vestuario");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("Ha perdido el interés que mostraba anteriormente por ti");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion = puntuacion + 3;
    }

    System.out.println(
        "Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuancia (si es mujer)");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("No te deja que mires la agenda de su teléfono móvil");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("A veces tiene llamadas que dice no querer contestar cuando estás tú delante");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("Has notado que últimamente se perfuma más");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("Se confunde y te dice que ha estado en sitios donde no ha ido contigo");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion = puntuacion + 3;
    }

    System.out.println("########################################");

    if (puntuacion >= 0 && puntuacion <= 10) {
      System.out.println("¡Enhorabuena! tu pareja parece ser totalmente fiel");

    } else if (puntuacion >= 11 && puntuacion <= 22) {
      System.out.println(
          "Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. no bajes la guardia.");

    } else
      System.out.println(
          "Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigues que es lo que está pasando por su cabeza.");

    sc.close();
  }
}
