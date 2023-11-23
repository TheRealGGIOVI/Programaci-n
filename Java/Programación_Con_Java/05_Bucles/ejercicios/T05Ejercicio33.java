public class T05Ejercicio33 {
  public static void main(String[] args) {
    System.out.print("Introduzca la altura de la U: ");
    int altura = Integer.parseInt(System.console().readLine());

    //Filas excepto la base: pinto asterisco, seguido de ALTURA - 2 espacios en blanco y terminamos con asterisco + salto de línea.
    for (int i = 1; i < altura; i++) {
      System.out.print("*");
      for (int j = 1; j <= altura - 2; j++) {
        System.out.print(" ");
      }
      System.out.println("*");
    }

    // Base de la U: espacio, seguido de ALTURA - 2 asteriscos y terminamos con espacio en blanco (equivale a no hacer nada)
    System.out.print(" ");
    for (int i = 1; i <= altura - 2; i++) {
      System.out.print("*");
    }
  } 
}
