import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el número de horas que has trabajado durante la semana");
    int horasTrabajadas = sc.nextInt();
    int sueldoSemanal;

    if (horasTrabajadas >= 40) {
      sueldoSemanal = horasTrabajadas * 12;
    } else {
      sueldoSemanal = (40 * 12) + ((horasTrabajadas - 40) * 16);
    }
    System.out.println("El sueldo que corresponde es de " + sueldoSemanal + " €");

    sc.close();
  }
}
