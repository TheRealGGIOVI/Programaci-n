import java.io.File;

public class Ejemplo09 {
  public static void listaArchivos(String rutaCarpeta) {
    File carpeta = new File(rutaCarpeta);

    if (carpeta.isAbsolute()) {
      File[] lista = carpeta.listFiles();
      for (File f : lista) {
        if (f.isFile()) {
          System.out.println(f.getPath());
        } else if(f.isDirectory()) {
          listaArchivos(f.getName());   //recursividad: una función se llama a si misma
        }
      }
    }
  }

  public static void main(String[] args) {
    String ruta = ".";
    listaArchivos(ruta);
  }
}
