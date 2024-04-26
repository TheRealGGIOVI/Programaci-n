import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Convertir de un fichero a Arraylist y sacarlo por pantalla
 * 
 * @author Giovanni Giove
*/
public class Ejercicio1 {
  public static void main(String[] args) {
    String ruta = "./fichero.txt";
    ArrayList<String> lines = new ArrayList<>();
    
    try {
      File file = new File(ruta);
      Scanner scanner = new Scanner(file);
      while (scanner.hasNextLine()) {
        String line = scanner.nextLine();
        lines.add(line);
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + ruta);
      return;
    }

    for (String line : lines) {
      System.out.println(line);
    }
  }
}