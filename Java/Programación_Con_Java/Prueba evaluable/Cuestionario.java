import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cuestionario {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);;

    Map<String, String> lugar = new HashMap<>();
    ArrayList<String> respuestaIncorrecta = new ArrayList<>();


    /////Agregamos las lugar y paises
    lugar.put("Francia", "París");
    lugar.put("Portugal", "Lisboa");
    lugar.put("Italia", "Roma");
    lugar.put("España", "Madrid");
    lugar.put("Alemania", "Berlín");
    lugar.put("Andorra", "Andorra La Vieja");
    lugar.put("Croacia", "Zagreb");
    lugar.put("Islandia", "Reikiavik");
    lugar.put("Bulgaria", "Sofía");
    lugar.put("Austria", "Viena");
      


    /////Agregamos las respuestas incorrectas al arraylist
    respuestaIncorrecta.add("San Marino");
    respuestaIncorrecta.add("Bucarest");
    respuestaIncorrecta.add("Londres");
    respuestaIncorrecta.add("Varsovia");
    respuestaIncorrecta.add("Riga");
    respuestaIncorrecta.add("Bruselas");
    respuestaIncorrecta.add("Luxemburgo");
    respuestaIncorrecta.add("Riga");
    respuestaIncorrecta.add("Dublín");
    respuestaIncorrecta.add("Tiflis");
    respuestaIncorrecta.add("Chisiniau");
    respuestaIncorrecta.add("Podgorica");
    respuestaIncorrecta.add("Moscú");
    respuestaIncorrecta.add("Ankara");
    respuestaIncorrecta.add("Belgrado");
    respuestaIncorrecta.add("Berna");
    respuestaIncorrecta.add("Mónaco");
    respuestaIncorrecta.add("La Valeta");
    respuestaIncorrecta.add("Skopie");
    respuestaIncorrecta.add("Nursultán");



    /////Usamos el método proporcionado por el enunciado para mezclar las respuestas incorrectas
    Collections.shuffle(respuestaIncorrecta);
    
    /////Creamos lista de países para seleccionar 10 de forma aleatoria
    ArrayList<String> paises = new ArrayList<>(lugar.keySet());
    Collections.shuffle(paises);

    int puntos = 0;

    System.out.println("¡Bienvenido al cuestionario!");

    /////Creamos el cuestionario
    for (int i = 0; i < 10; i++) {
      String pais = paises.get(i);
      String capital = lugar.get(pais);

      /////Se agrega la capital correcta a las respuestas incorrectas
      respuestaIncorrecta.add(capital);
      Collections.shuffle(respuestaIncorrecta);

      System.out.println("¿Cuál es la capital de " + pais + "?");
      for (int j = 0; j < 3; j++) {
        System.out.println(j + ". " + respuestaIncorrecta.get(j));
      }
      System.out.print("Respuesta: ");

      int respuesta = sc.nextInt();
      sc.nextLine(); 

      if (respuestaIncorrecta.get(respuesta).equals(capital)) {
          System.out.println("¡Respuesta correcta!");
          puntos++;
      } else {
          System.out.println("Respuesta incorrecta. La capital de " + pais + " es " + capital + ".");
      }

      /////Eliminar la capital correcta de las respuestas incorrectas
      respuestaIncorrecta.remove(capital);
    }

    System.out.println("¡Cuestionario finalizado!");
    System.out.println("Puntuación: " + puntos);

    if (puntos >= 5) {
      System.out.println("¡Enhorabuena! ¡Has aprobado!");
    } else {
      System.out.println("Lo siento, has suspendido.");
    }

    sc.close();     
     
  }
}
