import java.util.Scanner;

public class Problema03 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double R;
    double r;
    double h;
    
    System.out.println("\033[1;37mVOLUMEN DE UN TRONCO DE CONO\033[0m");
    System.out.println("");
    System.out.println("=====================");
    System.out.println("");
    System.out.print("Introduzca el radio de la base mayor R (cm): ");
    R = sc.nextDouble();
    System.out.println("");
    System.out.print("Introduzca el radio de la base mayor R (cm): ");
    r = sc.nextDouble();
    System.out.println("");
    System.out.print("Introduzca la altura h (cm): ");
    h = sc.nextDouble();
    System.out.println("");
    double RR = R*R;
    double rr = r*r;
    System.out.printf("El volumen del toroide es de: \033[38;5;196m %.4f  cm\u00B3 \033[0m",(h*Math.PI)/3*(RR+rr+R*r) );
    sc.close();
  }
}
