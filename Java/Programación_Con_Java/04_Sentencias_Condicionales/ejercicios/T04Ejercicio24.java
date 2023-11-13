import java.util.Scanner;

public class T04Ejercicio24 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String cargo;
    double sueldo = 0;
    int dias = 0;
    String estadoCivil;
    int IRPF = 0;
    double sueldoBruto = 0;
    double sueldoNeto = 0;

    System.out.print("¿Qué cargo obstenta el empleado (junior, senior, jefe)? ");
    cargo = sc.next();
    switch (cargo) {
      case "junior":
        sueldo = 950;
        break;
    
      case "senior":
        sueldo = 1200;
        break;

      case "jefe":
        sueldo = 1600;
        break;

      default:
        System.out.println("ERROR el cargo introducido no corresponde con ninguno de los 3");
        break;
    }
    System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
    dias = sc.nextInt();
    System.out.print("Introduzca su estado civil (soltero, casado): ");
    estadoCivil = sc.next();

    switch (estadoCivil) {
      case "soltero":
        IRPF = 25;
        break;

      case "casado":
        IRPF = 20;
        break;

      default:
        System.out.println("ERROR estado civil introducido no es correcto");
        break;
    }

    sueldoBruto = sueldo + (dias*30);
    sueldoNeto = sueldoBruto - ((IRPF*sueldoBruto) / (100));

    System.out.println("----------------------------------");
    System.out.printf("| %-22s %6.2f | \n", "Sueldo base", sueldo);
    System.out.printf("| %-3s (%-1d %-13s %6.2f | \n", "Dietas", dias,"viajes)", (double)dias*30);
    System.out.println("|--------------------------------|");
    System.out.printf("| %-22s %6.2f | \n", "Sueldo bruto", sueldoBruto);
    System.out.printf("| %-4s (%d%%) %9.2f | \n", "Retención IRPF", IRPF, (sueldo * IRPF)/100 );
    System.out.println("----------------------------------");
    System.out.printf("| %-22s %6.2f | \n", "Sueldo neto", sueldoNeto);
    System.out.println("----------------------------------");

    sc.close();
  }
}
