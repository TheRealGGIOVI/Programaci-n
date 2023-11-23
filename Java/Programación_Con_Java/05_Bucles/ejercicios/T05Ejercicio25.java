import java.util.Scanner;

public class T05Ejercicio25 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   int numeroVolteado = 0;
    System.out.print("Introduzca un número entero:");
    int numIntroducido = sc.nextInt();

    sc.close();

    int copiaNumero = Math.abs(numIntroducido);

    //Obtenemos la cifra de las unidades, decenas, centenas....del resto de dividir por 10
    while (copiaNumero > 0) {
      numeroVolteado = (copiaNumero % 10) + (numeroVolteado * 10);
      copiaNumero /= 10;
    }

    if (numIntroducido > 0) {
      System.out.println("El número " + numIntroducido + " volteado es " + numeroVolteado);
    }else {
      System.out.println("El número " + numIntroducido + " volteado es -" + numeroVolteado);
    }
  }


}
