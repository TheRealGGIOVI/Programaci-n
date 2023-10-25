/**
 * El horario de clases con colores
 * 
 * @author Giovanni Giove
*/
public class Ejercicio5 {
  public static void main(String[] args) {
    System.out.println("---------------------------------------------------");
    System.out.printf("| %-9s | %-11s | %-22s |\n", "Día", "Horas", "Asignaturas");
    System.out.println("---------------------------------------------------");
    System.out.printf("| %-9s | %-5s |\033[30m %-21s \033[39;49m |\n", "Lunes", "15:15-16:15", "FOL");
    System.out.printf("| %-9s | %-5s |\033[30m %-21s \033[39;49m |\n", "", "16:15-17:15", "FOL");
    System.out.printf("| %-9s | %-5s |\033[30m %-21s \033[39;49m |\n", "", "17:15-18:15", "FOL");
    System.out.printf("| %-9s | %-5s |\033[91m %-21s \033[39;49m |\n", "", "18:30-19:30", "Sistemas Informáticos");
    System.out.printf("| %-9s | %-5s |\033[91m %-21s \033[39;49m |\n", "", "19:30-20:30", "Sistemas Informáticos");
    System.out.printf("| %-9s | %-5s |\033[91m %-21s \033[39;49m |\n", "", "20:30-21:15", "Sistemas Informáticos");
    System.out.println("---------------------------------------------------");
    System.out.printf("| %-9s | %-5s |\033[95m %-21s \033[39;49m |\n", "Martes", "15:15-16:15", "Programación");
    System.out.printf("| %-9s | %-5s |\033[95m %-21s \033[39;49m |\n", "", "16:15-17:15", "Programación");
    System.out.printf("| %-9s | %-5s |\033[92m %-21s \033[39;49m |\n", "", "17:15-18:15", "Bases de Datos");
    System.out.printf("| %-9s | %-5s |\033[92m %-21s \033[39;49m |\n", "", "18:30-19:30", "Bases de Datos");
    System.out.printf("| %-9s | %-5s |\033[33m %-21s \033[39;49m |\n", "", "19:30-20:30", "Lenguaje de marcas");
    System.out.printf("| %-9s | %-5s |\033[33m %-21s \033[39;49m |\n", "", "20:30-21:15", "Lenguaje de marcas");
    System.out.println("---------------------------------------------------");
    System.out.printf("| %-9s | %-5s |\033[36m %-21s \033[39;49m |\n", "Miércoles", "15:15-16:15", "Entorno de Desarrollo");
    System.out.printf("| %-9s | %-5s |\033[36m %-21s \033[39;49m |\n", "", "16:15-17:15", "Entorno de Desarrollo");
    System.out.printf("| %-9s | %-5s |\033[92m %-21s \033[39;49m |\n", "", "17:15-18:15", "Bases de Datos");
    System.out.printf("| %-9s | %-5s |\033[92m %-21s \033[39;49m |\n", "", "18:30-19:30", "Bases de Datos");
    System.out.printf("| %-9s | %-5s |\033[95m %-21s \033[39;49m |\n", "", "19:30-20:30", "Programación");
    System.out.printf("| %-9s | %-5s |\033[95m %-21s \033[39;49m |\n", "", "20:30-21:15", "Programación");
    System.out.println("---------------------------------------------------");
    System.out.printf("| %-9s | %-5s |\033[92m %-21s \033[39;49m |\n", "Jueves", "15:15-16:15", "Base de Datos");
    System.out.printf("| %-9s | %-5s |\033[92m %-21s \033[39;49m |\n", "", "16:15-17:15", "Base de Datos");
    System.out.printf("| %-9s | %-5s |\033[33m %-21s \033[39;49m |\n", "", "17:15-18:15", "Lenguaje de marcas");
    System.out.printf("| %-9s | %-5s |\033[33m %-21s \033[39;49m |\n", "", "18:30-19:30", "Lenguaje de marcas");
    System.out.printf("| %-9s | %-5s |\033[95m %-21s \033[39;49m |\n", "", "19:30-20:30", "Programación");
    System.out.printf("| %-9s | %-5s |\033[95m %-21s \033[39;49m |\n", "", "20:30-21:15", "Programación");
    System.out.println("---------------------------------------------------");
    System.out.printf("| %-9s | %-5s |\033[95m %-21s \033[39;49m |\n", "Viernes", "15:15-16:15", "Programación");
    System.out.printf("| %-9s | %-5s |\033[95m %-21s \033[39;49m |\n", "", "16:15-17:15", "Programación");
    System.out.printf("| %-9s | %-5s |\033[36m %-21s \033[39;49m |\n", "", "17:15-18:15", "Entorno de Desarrollo");
    System.out.printf("| %-9s | %-5s |\033[91m %-21s \033[39;49m |\n", "", "18:30-19:30", "Sistemas Informáticos");
    System.out.printf("| %-9s | %-5s |\033[91m %-21s \033[39;49m |\n", "", "19:30-20:30", "Sistemas Informáticos");
    System.out.printf("| %-9s | %-5s |\033[91m %-21s \033[39;49m |\n", "", "20:30-21:15", "Sistemas Informáticos");
    System.out.println("---------------------------------------------------");
  }
}
