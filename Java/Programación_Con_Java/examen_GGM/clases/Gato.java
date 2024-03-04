/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
package clases;

public class Gato extends Mascota{
  
  /////Atributos
  private String pelaje;
  static int totalGatos = 0;
  public static Object mascota;

  public Gato(String chip, String nombre) {
    return;
  }

  /////Constructores
  public void setChip(String chip) {
    Mascota.chip = chip;
  }


  @Override
  public String toString() {
    return "El nombre del gato es " +getNombre() +", y su chip es " +getChip();
  }


  public static void maullar() {
    System.out.println("¡Miaaaaauuuuuu! Brrrrr…");
  }

  public static void bufar() {
    System.out.println("Fuuuuuu…");
  }


  public void setTotalGatos(int totalGatos) {
    Gato.totalGatos = totalGatos;
  }

  public void setPelaje(String pelaje2) {
    this.pelaje = pelaje2;
  }
  /////Métodos
  public static void pasear() {
    if (Mascota.getVacuna() == true) {
      System.out.println(getNombre() + " no puede pasear hasta no estar vacunado/a");
    } else {
      System.out.println("¡Miaaaaauuuuuu! Brrrrr…");
    }
    
  }

  public static void vacunado() {
    if (Perro.getVacuna()) {
      System.out.println(getNombre() +" se encuentra vacunado/a");

    } else {
      Perro.getVacuna();
      System.out.println("Brrrrr!");
    }
  }

  public String getPelaje() {
    return pelaje;
  }

 


}
