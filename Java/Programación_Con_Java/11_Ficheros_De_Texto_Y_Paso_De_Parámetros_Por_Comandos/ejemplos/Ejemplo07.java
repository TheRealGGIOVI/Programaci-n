import java.io.File;

public class Ejemplo07 {
  public static void main(String[] args) {
    System.out.print("Introduzca el nombre del archivo a borrar: ");
    String nombreFichero = System.console().readLine();

    File fichero = new File(nombreFichero);

    if (fichero.exists()) {
      fichero.delete();
      System.err.println("El fichero se ha eliminado correctamente");
    } else {
      System.out.println("El fichero " +nombreFichero +" no existe. ");
    }
  }
}
