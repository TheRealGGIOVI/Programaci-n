import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Ejemplo02 {
  public static void main(String[] args) {
    try {
      FileReader archivo = new FileReader("numeros.txt");
      BufferedReader br = new BufferedReader(archivo);
      String linea = "0";
      int numlineas = -1;
      double suma = 0;

      do {
        suma += Double.parseDouble(linea);
        linea = br.readLine();
        // System.out.println(linea);
        numlineas ++;
      } while (linea != null);
      System.out.println(suma);
      System.out.println(suma/numlineas);

      br.close();

    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero numeros.txt" );
      // fnfe.printStackTrace();
    } catch (IOException ioe) {
      System.out.println("Error en la lactura");
      // ioe.printStackTrace();
    }
    
  }
}
