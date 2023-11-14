import java.util.Scanner;
/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class ejemploWhile02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numeroIntroducido = 0;   //variable que controle la salida del bucle
    int cuentaNumeros = 0;      //variable contadora de numeros positivos introducidos
    int suma = 0;              //variable acumuladora de los números positivos introducidos

    System.out.println("Porfavor, introduce números enteros positivos: ");
    System.out.println("El programa finalizará cuando se introduzca un número negativo");
    
    while (numeroIntroducido >= 0) {
      System.out.print("Número: ");
      numeroIntroducido = sc.nextInt();
      if (numeroIntroducido > 0) {
        cuentaNumeros++;
        suma += numeroIntroducido; //suma = suma + numeroIntroducido
      }
    }
    System.out.println("Has introducido " +cuentaNumeros +" números positivos");
    System.out.println("La suma total de ellos es: " +(suma));

    sc.close();
  }
}
