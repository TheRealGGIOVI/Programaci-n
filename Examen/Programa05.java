import java.util.Scanner;

public class Programa05 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int TBW;
    
    System.out.println("VIDA ÚTIL SSD");
    System.out.println("");
    System.out.println("=========");
    System.out.println("");
    System.out.print("Introduzca el factor de TBW de tu disco duro SSD: ");
    TBW = sc.nextInt();
    System.out.println("");
    System.out.printf("La cantidad máxima de terabytes que puedes escribir por día es: %.4f TB (%.1f GB)  ",(double)(TBW/6)/365, (double)(TBW/6)/365*1000);
    sc.close();
  }
}
