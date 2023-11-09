import java.util.Scanner;
/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); // Creamos un objeto Scanner para leer la entrada del teclado.

    System.out.print("Introduce el carácter para la pirámide: "); // Solicitamos al usuario que ingrese un carácter.
    char caracter = sc.next().charAt(0); // Leemos el primer carácter ingresado por el usuario y lo almacenamos en
                                              // 'caracter'.

    System.out.println("Selecciona la dirección del vértice de la pirámide:"); // Mostramos un menú para que el usuario
                                                                               // elija la dirección.
    System.out.println("1. Arriba");
    System.out.println("2. Abajo");
    System.out.println("3. Izquierda");
    System.out.println("4. Derecha");

    int opcion = sc.nextInt(); // Leemos la opción seleccionada por el usuario.

    switch (opcion) { // Utilizamos una estructura de control switch para determinar la dirección de
                      // la pirámide.
      case 1:
        System.out.println("  " + caracter); // Imprimimos la pirámide con vértice hacia arriba.
        System.out.println(" " + caracter + caracter + caracter);
        System.out.println(caracter + caracter + caracter + caracter + caracter);
        break;
      case 2:
        System.out.println(caracter + caracter + caracter + caracter + caracter); // Imprimimos la pirámide con vértice
                                                                                  // hacia abajo.
        System.out.println(" " + caracter + caracter + caracter);
        System.out.println("  " + caracter);
        break;
      case 3:
        System.out.println(caracter); // Imprimimos la pirámide con vértice hacia la izquierda.
        System.out.println(caracter + " " + caracter);
        System.out.println(caracter + " " + caracter + " " + caracter);
        System.out.println(caracter + " " + caracter);
        System.out.println(caracter);
        break;
      case 4:
        System.out.println("    " + caracter); // Imprimimos la pirámide con vértice hacia la derecha.
        System.out.println("  " + caracter + " " + caracter);
        System.out.println(caracter + " " + caracter + " " + caracter);
        System.out.println("  " + caracter + " " + caracter);
        System.out.println("    " + caracter);
        break;
      default:
        System.out.println("Opción no válida"); // Imprimimos un mensaje si el usuario elige una opción no válida.
    }

    sc.close();
  }
}
