import java.util.Scanner;

public class T04Ejercicio25 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double altura = 0;
    double anchura = 0;
    String bordado;
    double area = 0;
    String sin = "Sin escudo:";

    System.out.print("Introduzca la altura de la bandera en cm: ");
    altura = sc.nextDouble();

    System.out.print("Ahora introduzca la anchura: ");
    anchura = sc.nextDouble();

    System.out.print("¿Quiere escudo bordado? (si/no): ");
    bordado = sc.next();

    area = altura * anchura;
    double precio = area * 0.01;
    double precioBrodado = 0;
    

    if (bordado == "si") {
        precioBrodado += 2.50;
        
        sin = "Con escudo:"; 
    }

    double total = precio + precioBrodado + 3.25;

    System.out.printf("%-11s %.2f cm2: %8.2f € \n", "Bandera de", area, precio);
    System.out.printf("%-24s  %6.2f € \n", sin, precioBrodado);
    System.out.printf("%-24s  %6.2f € \n", "Gastos de envío:", 3.25);
    System.out.printf("%-24s  %6.2f € \n", "Total", total);

    sc.close();

   } 
}
