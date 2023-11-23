import java.util.Scanner;

public class T04Ejercicio26 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("\033[1;32mVenta de entrada CineCampa\033[0m");
    System.out.println("\033[1;32m==========================\033[0m");
    System.out.print("Número de entradas: ");
    int numEntrada = sc.nextInt();
    sc.nextLine();
    System.out.print("Día de la semana: ");
    String dia = sc.nextLine().toLowerCase();

    System.out.print("¿Tienes tarjeta CineCampa? (s/n): ");
    String tarjeta = sc.nextLine().toLowerCase();
    sc.close();

    // Precio de la entrada normal
    int precioBase = 8;

    // Determinar precio final según el día de la semana.

    double precioFinal = 0;
    double precioParejas = 5.5;
    String especial = "individual";

    switch (dia) {
        case "lunes": case "martes": case "viernes": case "sabado": case "sábado": case "domingo":
            precioFinal = precioBase*numEntrada;
            break;

        case "miercoles": case "miércoles":
            precioBase = 5;
            precioFinal = precioBase*numEntrada;
            break;

        case "jueves":
            if (numEntrada%2==0) {
                precioFinal = precioParejas*numEntrada;
            } else {
                especial = "mezcla";
                precioParejas = 5.5;
                precioFinal = (precioParejas*(numEntrada-1))+precioBase;
            }
            break;
    
        default:
            System.out.println("El día de la semana que ha introducido no es válido.");
            break;
    }

    //Determinar descuento
    double descuento = 0;

    if (tarjeta.equals("s")) {
        descuento = precioFinal*0.1;
    }


    System.out.println("");
    System.out.println("Aquí tiene sus entradas. ¡Gracias por su compra!");
    System.out.println("");

    if (especial.equals("individual")) {
        System.out.printf("Entradas individuales: %13d\n", numEntrada);
        System.out.printf("Precio por entrada individual: %5d \u20AC\n", precioBase);

    } else if (especial.equals("pareja")) {
        System.out.printf("Entradas de pareja: %18d\n", (numEntrada/2));
        System.out.printf("Precio por entradas de pareja: %5.0f \u20AC\n", precioParejas*2);

    } else if (especial.equals("mezcla")) {
        System.out.printf("Entradas individuales: %15d\n", 1);
        System.out.printf("Entradas de pareja: %18d\n", ((numEntrada-1)/2));
        System.out.printf("Precio por entrada individual: %5d \u20AC\n", precioBase);
        System.out.printf("Precio por entradas de pareja: %5.0f \u20AC\n", precioParejas*2);
    }

    System.out.printf("Total: %29.2f \u20AC\n", precioFinal);
    System.out.printf("Descuento: %25.2f \u20AC\n", descuento);
    System.out.printf("A pagar: %27.2f \u20AC\n", (precioFinal-descuento));
    

    }
}
