/**
 * Ejercicio 6 Tema 7
 * 
 * @author Giovanni Giove
*/
public class T07Ejercicio06 {
  public static void main(String[] args) {
    int [] numero = new int[5];

    System.out.println("Intrduzca los número enteros y pulse INTRO");
    
    //Escritura del array
    for (int i = 0; i < numero.length; i++) {
      numero[i] = Integer.parseInt(System.console().readLine());
    }

    //Salida por pantalla de array original
    for (int i : numero) {
      System.out.printf("%3d", i);
    }
    System.out.println();

    //Rotamos
    int aux = numero[4];
    for (int i = numero.length - 1; i > 0; i-- ){
      numero [i] = numero [i - 1];
    }
    numero [0] = aux;

    //Salida por pantalla del array rotado
    for (int i : numero) {
      System.out.printf("%3d", i);
    }
  }
}
