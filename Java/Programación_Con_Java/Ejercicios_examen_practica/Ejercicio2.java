import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Convertir un fichero (clave - valor) a un HashMap y sacarlo por pantalla
 * 
 * @author Giovanni Giove
*/
public class Ejercicio2 {
  public static void main(String[] args) {
    try {
      File file = new File("./fichero2.txt");

      Scanner scanner = new Scanner(file);
      HashMap<String, String> hashMap = new HashMap<>();

      while (scanner.hasNextLine()) {   
        String[] keyValue = scanner.nextLine().split("-");  
        hashMap.put(keyValue[0], keyValue[1]);
      }
      scanner.close();

      for (String key : hashMap.keySet()) {
        System.out.println(key + " - " + hashMap.get(key));
      }
    } catch (FileNotFoundException e) {
      System.out.println("File not found: " + e.getMessage());
    }
  }
}
