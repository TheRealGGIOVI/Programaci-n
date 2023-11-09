import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String respuesta;
    int puntuacion = 0;

    System.out.println("################ Examén Programación ################");
    System.out.println("Responde a las siguientes cuestiones con S o N.");
    System.out.println("");

    System.out.println("1º Pregunta - ¿Es INT un tipo de dato?");
    respuesta = sc.nextLine();

    if (respuesta.equals("S")) {
      puntuacion++;
    }

    System.out.println("2º Pregunta - ¿System.out.println y System.out.printnextLine es lo mismo?");
    respuesta = sc.nextLine();
    if (respuesta.equals("S")) {
      puntuacion++;
    }

    System.out.println("3º Pregunta - ¿El uso de \\n sirve para mostrar texto formateado?");
    respuesta = sc.nextLine();
    if (respuesta.equals("S")) {
      puntuacion++;
    }

    System.out.println("4º Pregunta - ¿Se puede convertir una variable String a un tipo Float?");
    respuesta = sc.nextLine();
    if (respuesta.equals("N")) {
      puntuacion++;
    }

    System.out.println(
        "5º Pregunta - Si queremos mostrar una cantidad especifica de decimales, usamos $0.3 , VariableDouble");
    respuesta = sc.nextLine();
    if (respuesta.equals("S")) {
      puntuacion++;
    }

    System.out.println("6º Pregunta - ¿Hace falta crear un Scanner para recoger datos a través de la consola?");
    respuesta = sc.nextLine();
    if (respuesta.equals("S")) {
      puntuacion++;
    }

    System.out
        .println("7º Pregunta - ¿Se pueden usar todas las estructuras de bucles en Java para una única solucion?");
    respuesta = sc.nextLine();
    if (respuesta.equals("S")) {
      puntuacion++;
    }

    System.out.println("8º Pregunta - En Java, los Array, ArrayLists y Hashmaps el primer objeto ocupa la posición 1");
    respuesta = sc.nextLine();
    if (respuesta.equals("N")) {
      puntuacion++;
    }

    System.out.println("9º Pregunta - En un switch, debemos colocar break tras cada caso introducido");
    respuesta = sc.nextLine();
    if (respuesta.equals("S")) {
      puntuacion++;
    }

    System.out.println("10º Pregunta - ¿Te gusta Programar?");
    respuesta = sc.nextLine();
    if (respuesta.equals("S") || respuesta.equals("N")) {
      puntuacion++;
    }

    System.out.println("Tu puntuación ha sido: " + puntuacion);

    sc.close();
  }

}
