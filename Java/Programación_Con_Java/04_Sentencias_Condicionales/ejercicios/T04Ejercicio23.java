import java.util.Scanner;

public class T04Ejercicio23 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double baseImponible;
    String IVA;
    String codigoProm;
    System.out.print("Introduzca la base imponible: ");
    baseImponible = sc.nextDouble();
    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    IVA = sc.next();

    switch (IVA) {
      case "general":
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        codigoProm = sc.next();
        switch (codigoProm) {
          case "nopro":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (21%)", baseImponible/21);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.21);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (nopro):", 00.00);
            System.out.printf("%-22s %6.2f \n", "TOTAL", baseImponible*1.21);
            break;
          
          case "mitad":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (21%)", baseImponible/21);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.21);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (mitad):",(baseImponible*1.21)/2 );
            System.out.printf("%-22s %6.2f \n", "TOTAL", (baseImponible*1.21)/2);
            break;

          case "meno5":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (21%)", baseImponible/21);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.21);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (meno5):",5.00 );
            System.out.printf("%-22s %6.2f \n", "TOTAL", (baseImponible*1.21)-5);
            break;

          case "5porc":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (21%)", baseImponible/21);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.21);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (nopro):",0.05*(baseImponible*1.21) );
            System.out.printf("%-22s %6.2f \n", "TOTAL", (baseImponible*1.21)-(0.05*(baseImponible*1.21)));
          break;
          default:
            System.out.println("El código promocional no coincide");
            break;
        }
        break;
      
      case "reducido":
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        codigoProm = sc.next();
        switch (codigoProm) {
          case "nopro":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (10%)", baseImponible/10);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.10);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (nopro):", 00.00);
            System.out.printf("%-22s %6.2f \n", "TOTAL", baseImponible*1.10);
            break;
          
          case "mitad":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (10%)", baseImponible/10);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.10);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (mitad):",(baseImponible*1.10)/2 );
            System.out.printf("%-22s %6.2f \n", "TOTAL", (baseImponible*1.10)/2);
            break;

          case "meno5":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (10%)", baseImponible/10);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.10);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (meno5):",5.00 );
            System.out.printf("%-22s %6.2f \n", "TOTAL", (baseImponible*1.10)-5);
            break;

          case "5porc":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (10%)", baseImponible/10);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.10);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (nopro):",0.05*(baseImponible*1.10) );
            System.out.printf("%-22s %6.2f \n", "TOTAL", (baseImponible*1.10)-(0.05*(baseImponible*1.10)));
          break;
          default:
            System.out.println("El código promocional no coincide");
            break;
        }
        break;

      case "superreducido":
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        codigoProm = sc.next();
        switch (codigoProm) {
          case "nopro":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (4%)", baseImponible/04);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.04);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (nopro):", 00.00);
            System.out.printf("%-22s %6.2f \n", "TOTAL", baseImponible*1.04);
            break;
          
          case "mitad":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (4%)", baseImponible/4);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.04);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (mitad):",(baseImponible*1.04)/2 );
            System.out.printf("%-22s %6.2f \n", "TOTAL", (baseImponible*1.04)/2);
            break;

          case "meno5":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (4%)", baseImponible/4);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.04);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (meno5):",5.00 );
            System.out.printf("%-22s %6.2f \n", "TOTAL", (baseImponible*1.04)-5);
            break;

          case "5porc":
            System.out.printf("%-22s %6.2f \n", "Base imponible", baseImponible);
            System.out.printf("%-22s %6.2f \n", "IVA (4%)", baseImponible/4);
            System.out.printf("%-22s %6.2f \n", "Precio con IVA", baseImponible*1.04);
            System.out.printf("%-21s -%6.2f \n", "Cód. promo. (nopro):",0.05*(baseImponible*1.04));
            System.out.printf("%-22s %6.2f \n", "TOTAL", (baseImponible*1.04)-(0.05*(baseImponible*1.04)));
          break;
          default:
            System.out.println("El código promocional no coincide");
            break;
        }
        break;

      default:
        System.out.println("El tipo de IVA introducido no corresponde con ninguno de los propuestos. ");
        break;
    }

    sc.close();
  }
}
