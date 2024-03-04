/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
package clases;

public abstract class Mascota {
  

  /////Atributos
  protected static String chip;
  private static String nombre;
  private static int edad;
  private static boolean vacunada;
  static int totalMascotas = 0;


  /////Constructores
  
  public static boolean getVacuna() {
    return vacunada;
  }

  public void setVacunada(boolean vacunada) {
    Mascota.vacunada = false;
  }

  public static String getChip() {
    return chip;
  }

  public static void setNombre(String nombre) {
    Mascota.nombre = nombre;
  }

  public static String getNombre() {
    return nombre;
  }
  
  public static int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    Mascota.edad = edad;
  }

  public static void setTotalMascotas(int totalMascotas) {
    Mascota.totalMascotas = totalMascotas;
  }

  @Override
  public String toString() {
    return Mascota.getNombre() + Mascota.getChip() +Mascota.getEdad();
  }


  /////Métodos
  public static boolean vacunar(){
    return vacunada = true;
  }

  public static void pasear() {
    System.out.println("Mira como paseo!");
  }

 

  
  



}
