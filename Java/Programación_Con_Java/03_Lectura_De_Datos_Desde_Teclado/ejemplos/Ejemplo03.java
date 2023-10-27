import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Ejemplo03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner (System.in, "Windows-1252");   //creamos un onjeto de la clase Scanner, llamamos sc

    System.out.print("Introduce tu nombre: ");
    String nombre = sc.nextLine();          //Guardamos en la variable nombre lo que ontroducimos

    System.out.print("Introduce tu edad: ");
    int edad = sc.nextInt();               //Guardamos en la variable edad lo que introducimos

    System.out.println("Tu nombre es " +nombre +" y tienes " +edad +" años");
    sc.close();
  }
}
