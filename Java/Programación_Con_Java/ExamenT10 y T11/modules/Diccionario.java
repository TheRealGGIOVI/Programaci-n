package modules;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.io.*;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Diccionario implements DiccionarioInterface {

  HashMap<String, String> almacen = new HashMap<String, String>();

  //Métodos
  public void listar() {
    //Este método nos muestra por pantalla todas las palabras del diccionario(clave)
    System.out.println("Palabras en el diccionario: ");
    for (String palabra : almacen.values()) {
      System.out.println(palabra);
    }
  }

  public boolean buscar(String palabra) {
    //Nos indica si una palabra(clave) está o no en el diccionario
    if (almacen.containsKey(palabra)) {
    return true;
  } else {
    return false;
  }
  }


  public void anadir(String palabra, String significado) {
    //Nos pedirá que añadamos un par nuevo de clave valor al diccionario y además se la mostraremos por pantalla
    almacen.put(palabra, significado);
    System.out.println("Palabra " +palabra +" añadida al diccionario");
  }


  public void borrar(String palabra) {
    //Nos permitirá borrar la palabra y su correspondiente significado del diccionario
    almacen.remove(palabra);
    System.out.println("Palabra " +palabra +" borrada correctaemnte del diccionario");
  }


  public void editar(String palabra, String nuevoSignificado) {
    //Nos permite editar el significado de una palabra, es decir modificar el valor de una clave que exista
    almacen.put(palabra, nuevoSignificado);
    System.out.println("Significado de  " +palabra +" editado correctamente");
  }

 
  public String significado(String palabra) {
    //Nos devuelve el significado de una palabra, es decir el valor de la clave.
    return almacen.get(palabra);
  }

  
  public void cargar(String archivo) {
    //Lee el fichero que le introducimos por parámetro y nos añade el par de clave y valor correspondiente a nuestro HashMap
      try {
      BufferedReader br = new BufferedReader(new FileReader(archivo));
      String linea = "";
      do {
        if (linea != null) {
          linea = br.readLine();
          String[] palabras = linea.split(":");
          almacen.put(palabras[0], palabras[1]);
        }
        br.close();
        System.out.println("Diccionario cargado correctamente desde el archivo");
      } while (!archivo.isEmpty());
    } catch (IOException ioe) {
      System.out.println("No se ha encpntrado la ruta al archivo " +ioe.getMessage());
    }

  }


  public void guardar(String archivo) {
    //Lee todo nuestro HashMap y lo guarda en el archivo con el formato de: clave:valor
   try {
    BufferedWriter br = new BufferedWriter(new FileWriter(archivo));
    br.write(almacen.keySet() + ":" +almacen.get(archivo));
    br.close();
   } catch (IOException ioe) {
    System.out.println("No se ha encontrado la ruta al archivo " +ioe.getMessage());
    }
  }


  public void ordenarAlfabeticamente() {
    ArrayList<String> claves = new ArrayList<String>(almacen.keySet());
    System.out.println("Diccionario orrdenado correctamente");
    Collections.sort(claves);
    
  }


}