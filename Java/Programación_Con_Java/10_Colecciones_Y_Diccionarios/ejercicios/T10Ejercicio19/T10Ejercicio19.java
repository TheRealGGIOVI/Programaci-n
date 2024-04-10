package T10Ejercicio19;

import java.util.HashMap;

/**
 * Realiza un buscador de sinónimos. Utiliza el diccionario español-inglés que se
  proporciona a continuación. El programa preguntará una palabra y dará una
  lista de sinónimos (palabras que tienen el mismo significado). Por ejemplo, si
  se introduce la palabra “caliente”, el programa dará como resultado: ardiente,
  candente, abrasador. ¿Cómo sabe el programa cuáles son los sinónimos de
  “caliente”? Muy fácil, en el diccionario debe existir la entrada (“caliente”,
  “hot”), por tanto solo tendrá que buscar las palabras en español que también
  signifiquen “hot”; esta información estará en las entradas (“ardiente”, “hot”) y
  (“abrasador”, “hot”). Cuando una palabra existe en el diccionario pero no tiene
  sinónimos, debe mostrar el mensaje “No conozco sinónimos de esa palabra”.
  Si una palabra no está en el diccionario se mostrará el mensaje “No conozco
  esa palabra”. El usuario sale del programa escribiendo la palabra “salir”.
 * 
 * @author Giovanni Giove
*/


public class T10Ejercicio19 {
  
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
          } else {
            System.out.println();
          }
        } else {
          System.out.println("No conozco esa palabra");
        }
        
      }
    } while (salir == false);
  }
  
}
