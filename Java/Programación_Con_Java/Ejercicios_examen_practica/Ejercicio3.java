import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Convertir un fichero (clave - valor) en dos Arraylist y estos a ficheros de salida: clave.txt y valor.txt
 * 
 * @author Giovanni Giove
*/
public class Ejercicio3 {
  public static void main(String[] args) {
    try {
      File fichero = new File("./fichero2.txt");
      File valores = new File("./values.txt");
      File clave = new File("./keys.txt");


      ArrayList<String> keys = new ArrayList<>();
      ArrayList<String> values = new ArrayList<>();


      BufferedReader br1 = new BufferedReader(new FileReader(fichero));
      BufferedWriter bw1 = new BufferedWriter(new FileWriter(clave));
      BufferedWriter bw2 = new BufferedWriter(new FileWriter(valores));
      
      String linea1 = "";

      while (linea1 != null) {
        linea1 = br1.readLine();
       if (linea1 != null) {
        String[] palabras = linea1.split("-");
        keys.add(palabras[0]);
        values.add(palabras[1]);
       } 
      }

      for (String k : keys) {
        bw1.write(k);
        bw1.newLine();
      }
      for (String v : values) {
        bw2.write(v);
        bw2.newLine(); 
      }


      br1.close();
      bw1.close();
      bw2.close();
    } catch (IOException ioe) {
      
    }
  }
}
