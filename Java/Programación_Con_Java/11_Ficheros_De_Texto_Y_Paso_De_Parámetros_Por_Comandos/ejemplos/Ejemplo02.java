import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/

public class Ejemplo02 {
  public static void main(String[] args) {
    try {
      FileReader archivo = new FileReader("ficheros/numeros.txt");
      BufferedReader br = new BufferedReader(archivo);
      String linea = "0";
      int numlineas = -1;   //Empezamos en -1 porque va a contar la última línra (null)
      double suma = 0;

      do {
        suma += Double.parseDouble(linea);
        linea = br.readLine();
        numlineas ++;
      } while (linea != null);

      System.out.println("Número de líneas leídas:  " +numlineas);
      System.out.println("Suma: " + suma);
      System.out.println("Media: " +suma/numlineas);

      br.close();

    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero numeros.txt" );
      System.out.println(fnfe.getMessage());
    } catch (IOException ioe) {
      System.out.println("Error en la lactura");
      System.out.println(ioe.getMessage());
    }
  }
}
