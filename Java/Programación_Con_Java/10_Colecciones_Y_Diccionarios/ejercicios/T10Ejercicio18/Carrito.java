package T10Ejercicio18;

import java.util.ArrayList;

public class Carrito {
  private ArrayList<Elemento> cesta = new ArrayList<Elemento>();

  public void agrega(Elemento e) {
    boolean encontrado = false;
    for (Elemento elemento : cesta) {
      if (elemento.equals(e)) {
        elemento.setCantidad(elemento.getCantidad()+ e.getCantidad());
        encontrado = true;
      }
    }
    if (!encontrado) {
      cesta.add(e);
    }
  }

  public int numeroDeElementos() {
    return cesta.size();
  }
  
  public double importeTotal() {
    double total = 0;
    for (Elemento e : cesta) {
      total += e.getPrecio() * e.getCantidad();
    }

    return total;
  }

  @Override
  public String toString() {
    String respuesta;
    respuesta = "Contenido del carrito\n"
    + "=====================\n";
    for (Elemento e : cesta) {
      respuesta += e + "\n";
    }
    return respuesta;
  }



}
