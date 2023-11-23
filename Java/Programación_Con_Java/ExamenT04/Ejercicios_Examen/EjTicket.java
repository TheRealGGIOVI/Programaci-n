import java.util.Scanner;

/**
 * Pregunta 1 del examen
 * 
 * @author Giovanni Giove
*/
public class EjTicket {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int seccion;
    int producto;
    double iva = 0;
    int unidades = 0;
    String nombreProducto;
    double precioUnidad = 0;
    

    System.out.print("Escoja el tipo de seccion en la que quiere comprar \n 1. Alimentación \n 2.Farmacia \n 3.Electrónica \n 4.Moda \n Opción: ");
    seccion = sc.nextInt();

    switch (seccion) {
      case 1:
        System.out.println("Introduzca el tipo de alimento");
        System.out.println("1. Huevos (4% IVA)\r\n" + //
            "2. Pan (4% IVA)\r\n" + //
            "3. Leche (4% IVA)\r\n" + //
            "4. Fruta (4% IVA)\r\n" + //
            "5. Carne (10% IVA)\r\n" + //
            "6. Agua (10% IVA)\r\n" + //
            "7. Verdura (4% IVA)\r\n" + //
            "8. Otros (10% IVA)");
        System.out.print("Opción:");
        producto = sc.nextInt();
          switch (producto) {
            case 1, 2, 3, 4, 7:
              iva = 4;
              break;
            case 5, 6, 8:
              iva = 10;
            default:
              System.out.println("No has seleccionado ningun producto válido");
              break;
          }

        break;
      case 2:
        iva = 4;
          break;
      case 3, 4:
          iva = 21;
          break;
      default:
          System.out.println("No has introducido ninguna sección válida");
        break;
    }

    System.out.print("Introduzca el nombre del producto: ");
    nombreProducto = sc.next();

    System.out.print("Introduzca la cantidad de productos: ");
    unidades = sc.nextInt();

    System.out.print("Introduzca el precio por unidad del producto: ");
    precioUnidad = sc.nextDouble();

    double precioNoIva = unidades * precioUnidad;

    String promo = "";

    System.out.print("Introduzca código promocional: ");
    promo = sc.next();

   if (promo.equals("SINIVA")) {
    iva = 0;
   }
   if (promo.equals("PROMO50")) {
    precioNoIva /= 2;
    promo = "Descuento (50%)";
   }
   if (promo.equals("PROMO3X2")) {
    promo = "Promoción (3x2)";
   }
   if (promo.equals("NO")) {
    promo = "";
   }

   System.out.println("Factura");
   System.out.println("----------------------------------------");
   System.out.printf("%-41s %20s", "Artículo", nombreProducto);
   System.out.printf("%-41s %6.2f €/unidad", "Precio", precioUnidad );
   System.out.printf("%-41s %6.2f", "Cantidad", unidades );
   System.out.printf("%-41s %6.2f", "Total", precioNoIva );
   System.out.printf("%-41s -%6.2f", promo, precioNoIva );
   System.out.printf("%-41s %6.2f", "Total con descuento", precioNoIva );
   System.out.printf("%-1s %d%% %40.2f", "IVA al", iva, precioNoIva/iva );
   System.out.println("----------------------------------------");
   System.out.printf("%-41s %6.2f", "Total con IVA", precioNoIva+(precioNoIva/iva) );

   sc.close();
  }
}
