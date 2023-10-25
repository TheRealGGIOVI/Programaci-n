  /**
   * Salida formateada utilizando distintos flags
   * 
   * @author Giovanni Giove
  */
  public class SalidaFormateada02 {
  public static void main(String[] args) {
    System.out.printf("%8d\n", 100);
    System.out.printf("%+8d\n", 100);
    System.out.printf("%+d\n", 100);
    System.out.printf("%-8d\n", 100);

    System.out.println(" Artículo Precio/caja Nº cajas");
    System.out.println("-----------------------------------------");
    System.out.printf("%-10s %8.2f %6d\n", "manzanas", 4.5, 10);
    System.out.printf("%-10s %8.2f %6d\n", "peras", 2.75, 120);
    System.out.printf("%-10s %8.2f %6d\n", "aguacates", 10.0, 6);
  }
}
