import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio09 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long numeroIntroducido;
    int numeroCfiras = 1;     //en caso de no entrar en el siguiente bucle, entinces es porque el número es de 1 cifra
    
    System.out.print("Introduzca un número entero y le diré cuantos dígitos tiene: ");
    numeroIntroducido = sc.nextLong();
    long n = numeroIntroducido;
    sc.close();
    
    while (n >= 10) {
      n /= 10;   // n /= 10 <--> n = n / 10
      numeroCfiras++;
    }

    if(numeroCfiras == 1){
      System.out.println(numeroIntroducido + " tiene 1 cifra");

    }else {
      System.out.println(numeroIntroducido + " tiene " + numeroCfiras + " cifras");
    }
  }
}
