import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo03 {
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/fruta.txt", true));

      bw.write("sandía");
      bw.newLine();
      bw.write("melocoton");
      bw.newLine();
      bw.write("tomate");
      bw.newLine();

      bw.close();

    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero " + ioe.getMessage());
    }
  }
}
