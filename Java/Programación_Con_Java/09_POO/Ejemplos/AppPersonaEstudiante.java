/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class AppPersonaEstudiante {
  public static void main(String[] args) {
    
    Persona p = new Persona("Pepe Rodríguez", 30, "123456789A");
    Estudiante e = new Estudiante("Paula Gómez", 21, "555554444B");
    Profesor prof = new Profesor("Sergio Sánchez", 34, "95874321B", "Informática", 10000.25);

    System.out.println(p.toString());
    System.out.println(p);

    System.out.println(e.toString());
    System.out.println(e);

    System.out.println(prof.toString());
    System.out.println(prof);


  }
}
