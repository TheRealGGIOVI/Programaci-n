/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T07Ejercicio05_bidim {
   public static void main(String[] args) {
    int[][] array = new int[6][10];
    // Rellenar el array con números aleatorios entre 0 y 1000
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        array[i][j] = (int)(Math.random()*1001);
      }
    }

    // Encontrar el máximo y el mínimo y sus posiciones
    int max = array[0][0];
    int min = array[0][0];
    int maxI = 0, maxJ = 0, minI = 0, minJ = 0;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (array[i][j] > max) {
          max = array[i][j];
          maxI = i;
          maxJ = j;
        }
        if (array[i][j] < min) {
          min = array[i][j];
          minI = i;
          minJ = j;
        }
      }
    }

    // Imprimir el array y las posiciones del máximo y mínimo
    System.out.println("Array:");
    for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array.length; j++) {
            System.out.printf("%6d|", array[i][j]);
        }
        System.out.println();
    }
    System.out.println("Máximo: " + max + " en la fila " + maxI + ", y columna " + maxJ);
    System.out.println("Mínimo: " + min + " en la fila " + minI + ", y columna " + minJ);
  }
}
