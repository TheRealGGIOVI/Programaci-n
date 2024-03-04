/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Clinica {
  Scanner sc = new Scanner(System.in);
  ArrayList<Mascota> listado = new ArrayList<Mascota>(100);
  
  /////Métodos
  public boolean esVacia(boolean vacio) {
    if (listado.size() == 0) {
      return true;
    } else  {
      return false;
    }
  }

  public boolean esLlena(boolean lleno) {
    if (listado.size() == 100) {
      return true;
    } else  {
      return false;
    }
  }

  public int totalPerros() {
    return Perro.totalPerros;
  }

  public int totalGatos() {
    return Gato.totalGatos;
  }

  public int totalMascotas() {
    return Mascota.totalMascotas;
  }

  public String buscarChip(String chip) {
    System.out.println("Introduzca el número del chip: ");
    chip = sc.next();
    if (chip.equals(Mascota.getChip())) {
      return Mascota.getChip();
    } else {
      return null;
    }
  }

  public void agregar(Gato gato) {
    listado.add(gato);
  }

  public void agregar(Perro perro) {
    listado.add(perro);
  }

  public void listar() {
    System.out.println(listado);
  }


}


