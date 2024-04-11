import java.io.File;

public class Ejemplo06 {
  public static void main(String[] args) {
    File f = new File(".");

    String[] listaArchivos = f.list();

    for (String nombreArchivo : listaArchivos) {
      System.out.println(nombreArchivo);
    }
  }
}
