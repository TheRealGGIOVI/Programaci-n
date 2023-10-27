import java.util.Scanner;

/**
 * Realiza un programa que calcule la nota que hace falta sacar en el segundo
 * examen de la asignatura Programación para obtener la media deseada. Hay
 * que tener en cuenta que la nota del primer examen cuenta el 40% y la del segundo examen un 60%.
 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce la nota del primer examen: ");
    double nota1 = sc.nextDouble();
    

    System.out.print("¿Qué nota quieres sacar en el triestre? ");
    double nota2 = sc.nextDouble();

    double nota3 = (nota2-(nota1*0.4))/0.6;
   
    System.out.println("Para tener un " +nota2 +" en el trimestre necesitas sacar un " +nota3);

    sc.close();
  }
}
