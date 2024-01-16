/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T07Ejercicio03_bidim {
  public static void main(String[] args) {
    int[][] tabla = new int[4][5];
    int fila;
    int columna;

    //Rellenar el array
    for (fila = 0; fila < tabla.length; fila++) {
      for (columna = 0; columna < tabla[fila].length; columna++) {
        tabla[fila][columna] = (int)(Math.random()*900 + 100);
      }
    }
   
    //Mostramos el array
    int sumaFila;
    for (fila = 0; fila < tabla.length; fila++) {
      sumaFila = 0;
      for (columna = 0; columna < tabla[fila].length; columna++) {
        System.out.printf("%8d", tabla[fila][columna]);
        sumaFila += tabla[fila][columna];
      }
      System.out.printf("|%8d\n", sumaFila );   //Muestro la suma de la fila y salto de línea
    }

    //Muestra las sumas parciales de las columnas
    for (columna = 0; columna < 40; columna++) {
      System.out.print("-");
    }
    System.out.println();

    int sumaColumnas;
    int sumatotal = 0;

    for (columna = 0; columna < tabla[0].length; columna++) {
      sumaColumnas = 0;
      for (fila = 0; fila < tabla.length; fila++) {
        sumaColumnas += tabla[fila][columna];
      }
      System.out.printf("%8d", sumaColumnas);   //Muestro la suma de la fila y salto de línea
      sumatotal += sumaColumnas;
    }
    System.out.printf("|%8d\n",sumatotal);
  }
}
