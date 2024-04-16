import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class T11Ejercicio02 {
  public static void main(String[] args) {
      try {
        FileReader archivo = new FileReader("ficheros/primos.txt");
        BufferedReader br = new BufferedReader(archivo);
        String linea = "";

        while ((linea = br.readLine()) != null) {
        System.out.println(linea);
        }
        
        br.close();


      } catch (IOException ioe) {
        System.out.println("No se pudo leer el archivo " + ioe.getMessage());
      }
  }
}
