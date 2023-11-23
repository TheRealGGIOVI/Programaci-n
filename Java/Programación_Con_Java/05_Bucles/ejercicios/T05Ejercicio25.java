import java.util.Scanner;

public class T05Ejercicio25 {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    String num;
    

    System.out.print("Introduce un número: ");
    num = sc.next();

    String numInvertido = "";

    for (int i = num.length() - 1; i >= 0; i--){
      numInvertido += num.charAt(i);
    }

    System.out.println("El número al revés es " +numInvertido);

    sc.close();
  }


}
