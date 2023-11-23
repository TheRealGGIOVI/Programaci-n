import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T05Ejercicio10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numerosIntroducidos = 0; 
    int numerosTotales = 0;
    double sumaNumeros = 0;

    System.out.println("Vamos a calcular la media de los números que introduzcas");
    while (numerosIntroducidos >= 0) {
       System.out.print("Número: ");
       numerosIntroducidos = sc.nextDouble();
       if (numerosIntroducidos > 0){
        sumaNumeros += numerosIntroducidos;
        numerosTotales++;
      }
    }
    sc.close();

    System.out.println("La media de todos los números es: " +sumaNumeros/numerosTotales);


  }
}
