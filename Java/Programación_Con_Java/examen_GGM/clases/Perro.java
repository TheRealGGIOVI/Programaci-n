/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
package clases;

public class Perro extends Mascota{
  

  /////Atributos
  private String raza;
  static int totalPerros = 0;
  public static Object mascota;

  public Perro(String chip, String nombre) {
    System.out.println("[" +chip +"]" +getNombre() +", " +getEdad() +" años");
  }



  /////Constructores
  public void setChip(String chip) {
    Mascota.chip = chip;
  }

  @Override
  public String toString() {
    return "El nombre del perro es " +getNombre() +", y su chip es " +getChip();
  }


  public static void setTotalPerros(int totalPerros) {
    Perro.totalPerros = totalPerros;
  }

  public void setRaza(String raza2) {
    this.raza = raza2;
  }


  /////Métodos
  public static void ladrar() {
    System.out.println("“¡Guau! ¡Guau!");

  }

  public static void gruñir() {
    System.out.println("“Grrrr...");
    
  }

  public static void pasear() {
    if (Mascota.getVacuna() == true) {
      System.out.println(getNombre() + " no puede pasear hasta no estar vacunado/a");
    } else {
      System.out.println("Guau! Guau!");
    }
    
  }

  public static void vacunado() {
    if (Perro.getVacuna()) {
      System.out.println(getNombre() +" se encuentra vacunado/a");

    } else {
      Perro.getVacuna();
      System.out.println("Grrrrr!");
    }
  }



  public String getRaza() {
    return raza;
  }



  

  
}
