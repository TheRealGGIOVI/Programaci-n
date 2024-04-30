package modules;

// import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Diccionario implements DiccionarioInterface {

  private HashMap<String, String> diccionario;

  public Diccionario() {
    diccionario = new HashMap<String, String>()-,
  }

  @Override
  public void listar() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listar'");
  }

  @Override
  public boolean buscar(String palabra) {
    return diccionario.containsKey(palabra);
  }

  @Override
  public void anadir(String palabra, String significado) {
    diccionario.put(palabra, significado);
    
  }

  @Override
  public void borrar(String palabra) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'borrar'");
  }

  @Override
  public void editar(String palabra, String nuevoSignificado) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'editar'");
  }

  @Override
  public String significado(String palabra) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'significado'");
  }

  @Override
  public void cargar(String archivo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'cargar'");
  }

  @Override
  public void guardar(String archivo) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'guardar'");
  }

  @Override
  public void ordenarAlfabeticamente() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'ordenarAlfabeticamente'");
  }


}