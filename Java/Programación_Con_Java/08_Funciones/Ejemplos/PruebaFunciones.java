import matematicas.Varias;
import matematicas.Volumen;
public class PruebaFunciones {
  public static void main(String[] args) {
    // int n;

    // //Probams la funciones esPrimo(), alojada en la clase Varias dentro del paquete matemáticas

    // System.out.print("Introduzca un número entero positivo: ");
    // n = Integer.parseInt(System.console().readLine());

    // if (Varias.esPrimo(n)) {
    //   System.out.println("El " + n + " es primo.");
    // } else {
    //   System.out.println("El " + n + " no es primo.");
    // }

    // //Prueba digitos(), alojada en la calse Varias dentro del paquete matematicas
    // System.out.print("Introduzca un número entero positivo: ");
    // n = Integer.parseInt(System.console().readLine());

    // int numDigitos = Varias.digitos(n);
    // System.out.println(n+ "tiene " +numDigitos + " dígitos");

    // double r;
    // double h;
    // System.out.print("Introduzca el radio del cilindro: ");
    // r = Double.parseDouble(System.console().readLine());
    // System.out.print("Introduzca la altura del cilindro: ");
    // h = Double.parseDouble(System.console().readLine());

    // System.out.println("El volumen del cilindro es: " +Volumen.volumenCilindro(r, h) +" u^3");

    // System.out.print("Introduzca un número para voltear: ");
    // long x = Long.parseLong(System.console().readLine());
    // System.out.println("El número " + x + " volteado es: " + Varias.voltea(x));

    // //Prueba de la función int voltea()
    // System.out.print("Introduzca un número para voltear: ");
    // int num = Integer.parseInt(System.console().readLine());
    // System.out.println("El número " + num + " volteado es: " + Varias.voltea(num));

    // System.out.print("Introduzca un número para ver si es capicua: ");
    // long x = Long.parseLong(System.console().readLine());
    // if (Varias.esCapicua(x)) {
    //   System.out.println("El número es capicua");
    // } else {
    //   System.out.println("El número no es capicua");
    // }

    System.out.print("Introduzca un número para conocer el siguiente primo: ");
    int x = Integer.parseInt(System.console().readLine());
    System.out.println("El siguiente primo a " + x + " es " + Varias.siguienePrimo(x));
  }
}
