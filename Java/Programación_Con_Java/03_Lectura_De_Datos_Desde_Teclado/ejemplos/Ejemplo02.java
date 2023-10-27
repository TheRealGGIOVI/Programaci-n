/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class Ejemplo02 {
  public static void main(String[] args) {
    //String num1;
    //String num2;

    //System.out.print("Introduce un número: ");
    //num1= System.console().readLine();

    //System.out.print("Introduce otro número: ");
    //num2= System.console().readLine();

    //System.out.println("El resultado es = " +(num1+num2));

    String linea;   //Variable que almacenará cada línea que introduzcamos por teclado

    //System.out.print("Introduce un número entero: ");   //pedimos numero
    //linea = System.console().readLine();

    //int num1;
    //num1 = Integer.parseInt(linea); //convertimos de String a int

    //System.out.print("Introduce otro número entero: ");   //pedimos numero
    //linea = System.console().readLine();

    //int num2;
    //num2 = Integer.parseInt(linea);

    //System.out.printf("El primer número es: %d \n", num1);
    //System.out.printf("El segundo número es: %d \n", num2);

    //System.out.println("El doble del número " +num1 +" es " +(num1*2));
    //System.out.println("La suma de ambos números es " +(num1+num2));

    //Parseamos float
    System.out.println("Introduce un número real: ");
    linea = System.console().readLine();
    float numReal = Float.parseFloat(linea);
    System.out.printf("El número real introducido es: %.2f", numReal);

  }
}
