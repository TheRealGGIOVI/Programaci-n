import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;

public class Ejemplo01 {
  public static void main(String[] args) {
    try {
      FileReader archivo = new FileReader("C:\\Users\\Wanda\\Desktop\\Champions.txt");
      BufferedReader br = new BufferedReader(archivo);
      String linea = "";

      do {
        linea = br.readLine();
        System.out.println(linea);
      } while (linea != null);

      br.close();

    } catch (FileNotFoundException fnfe) {
      System.out.println("No se ha podido encontrar el fichero Champions.txt" );
      // fnfe.printStackTrace();
    } catch (IOException ioe) {
      System.out.println("Error en la lactura");
      // ioe.printStackTrace();
    }
    
  }
}