package modules;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public interface DiccionarioInterface {
  void listar();
  boolean buscar(String palabra);
  void anadir(String palabra, String significado);
  void borrar(String palabra);
  void editar(String palabra, String nuevoSignificado);
  String significado(String palabra);
  void cargar(String archivo);
  void guardar(String archivo);
  void ordenarAlfabeticamente();
}