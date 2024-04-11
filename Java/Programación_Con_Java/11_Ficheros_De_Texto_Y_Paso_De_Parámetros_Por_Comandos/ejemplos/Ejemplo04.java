import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Ejemplo04 {

  public static void crearLineas (String nombreArchivo, int n) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo));  

      for (int i = 0; i <= n; i++) {
      bw.write("Esta es la línea " +i +"\n");
      }
      bw.close();
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero " + ioe.getMessage());
    }
  }
  public static void main(String[] args) {
    System.out.println("Introduc el nombre del fichero: ");
    String nombreArchivo = System.console().readLine();

    System.out.print("Cuántas líneas quieres escribir? ");
    int numlineas = Integer.parseInt(System.console().readLine());

   
    crearLineas(nombreArchivo, numlineas);
      
  }
}
