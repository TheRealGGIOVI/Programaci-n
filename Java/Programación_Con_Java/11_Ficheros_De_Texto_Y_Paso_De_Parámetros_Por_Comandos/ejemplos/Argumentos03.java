import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/

public class Argumentos03 {
  public static void main(String[] args) {
    
    if (args.length != 1) {
      System.out.println("Este progemaa calcula la media de los números contenidos en un fichero.");
      System.out.println("Uso del programa: java Argumentos03 FICHERO");
      System.exit(0);
    }

    try {
      FileReader archivo = new FileReader(args[0]);
      BufferedReader br = new BufferedReader(archivo);  
      String linea = "0";
      int numlineas = -1;   //Empezamos en -1 porque va a contar la última lína (null)
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
