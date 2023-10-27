import java.util.Scanner;

/**
 * Escribe un programa que calcule el salario semanal de un empleado en base a
 * las horas trabajadas, a razón de 12 euros la hora.

 * 
 * @author Giovanni Giove
*/
public class T03Ejercicio08 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("¿Cuantas horas a la semana trabajas? ");
    int horas = sc.nextInt();

    System.out.println("Tu salario semanal será de: " +(horas*12) +" euros");

    sc.close();
  }
}
