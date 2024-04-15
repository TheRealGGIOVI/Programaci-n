import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo06 {

  public static void contarPalabras(String nombreArchivo) {
    int cantidadPalabras = 0;
    try {
      BufferedReader br = new BufferedReader(new FileReader(nombreArchivo));
      String linea = br.readLine();
      while (linea != null) {
        String[] palabras = linea.split(" ");
        cantidadPalabras += palabras.length;
        linea = br.readLine();

      }
      System.out.println("El archivo " +nombreArchivo +" contiene " +cantidadPalabras + " palanras");
      br.close();
    } catch (IOException ioe) {
      System.out.println("No es posible contar las palabras");
    }
  }

  public static void main(String[] args) {
    System.out.print("Introduzca el nombre del archivo que desea contar sus palabras: ");
    String nombreArchivo = System.console().readLine();

    contarPalabras(nombreArchivo);
  }
}
