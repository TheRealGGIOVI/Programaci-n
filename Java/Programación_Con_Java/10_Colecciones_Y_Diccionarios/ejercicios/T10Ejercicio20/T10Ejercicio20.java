package T10Ejercicio20;
/**
 * Amplía el programa anterior de tal forma que sea capaz de aprender palabras y
  sinónimos. Cuando una palabra no tiene sinónimos, es decir, cuando aparece la
  palabra en español con su traducción y esa traducción no la tiene ninguna otra
  palabra española, se le preguntará al usuario si quiere añadir uno (un sinónimo)
  y, en caso afirmativo, se pedirá la palabra y se añadirá al diccionario. Se puede
  dar la circunstancia de que el usuario introduzca una palabra en español que
  no está en el diccionario; en tal caso, se mostrará el consiguiente mensaje y
  se dará la posibilidad al usuario de añadir la entrada correspondiente en el
  diccionario pidiendo, claro está, la palabra en inglés.
 * @author Giovanni Giove
*/
import java.util.HashMap;

public class T10Ejercicio20 {
  public static void main(String[] args) {
    HashMap<String, String> diccionario = new HashMap<String, String>();

    diccionario.put("caliente", "hot");
    diccionario.put("rojo", "red");
    diccionario.put("ardiente", "hot");
    diccionario.put("verde", "green");
    diccionario.put("helado", "stiff");
    diccionario.put("abrasador", "hot");
    diccionario.put("hierro", "iron");
    diccionario.put("grande", "big");

    boolean salir = false;


    do {
      System.out.print("Introduce una palabra y le daré los sinónimos: ");
      String palabraIntroducida = System.console().readLine();

      if (palabraIntroducida.equalsIgnoreCase("salir")) {
        salir = true;
      } else {
        if (diccionario.containsKey(palabraIntroducida)) {
          String palabraIngles = diccionario.get(palabraIntroducida);
          boolean tieneSinonimos = false;
          for (String palabra : diccionario.keySet()) {
            if (diccionario.get(palabra).equals(palabraIngles) && !palabra.equals(palabraIntroducida)) {
              if (!tieneSinonimos) {
                System.out.print("Sinónimos de " + palabraIntroducida + ": " + palabra);
                tieneSinonimos = true;
              } else {
                System.out.print(", " + palabra);
              }
            }
          }
          if (!tieneSinonimos) {
            System.out.println("No conozco sinónimos de esa palabra");
            System.out.print("¿Quiere añadir alguno? (s/n): ");
            String respuesta = System.console().readLine();
            if (respuesta.equalsIgnoreCase("s")) {
              System.out.print("Introduzca el sinónimo de " + palabraIntroducida + " : ");
              String nuevoSinonimo = System.console().readLine();
              diccionario.put(nuevoSinonimo, palabraIngles);
              System.out.println("Gracias por enseñarme nuevos sinónimos.");
            }
          } else {
            System.out.println();
          }
        } else {
          System.out.print("No conozco esa palabra, quieres añadirla? (s/n): ");
          String respuesta = System.console().readLine();
          if (respuesta.equalsIgnoreCase("s")) {
            System.out.print("Introduzca la traducción de " + palabraIntroducida + " : ");
            String palabraTraducida = System.console().readLine();
            diccionario.put(palabraIntroducida, palabraTraducida);
            System.out.println("Gracias por enseñarme nuevas palabras.");
          }
        }
        
      }
    } while (salir == false);
  }
}
