/**
 * Estudiante que hereda de la clase Persona
 * 
 * @author Giovanni Giove
*/
public class Estudiante extends Persona {
 
  
  /////Attributos
  private int creditos;

  /////Constructores
  public Estudiante(String nombre, int edad, String dni) {
    super(nombre, edad, dni);
    this.creditos = 60;
  }

  public Estudiante(String nombre, int edad, String dni, int creditos) {
    super(nombre, edad, dni);
    this.creditos = creditos;
  }

  public int geCreditos() {
    return this.creditos;
  }

  @Override
  public String toString() {
    return super.toString() + " [Estudiante] Créditos: " + creditos;
  }

  

  // @Override
  // public void mostrarDatos() {
  //   super.mostrarDatos();     //Llamo al método mostrarDatos de la superclase (Persona)
  //   System.out.println("Estudiante matriculado de " +creditos +" créditos");
  // }
  

}
