/**
 * Ejercicio de quiniela aleatoria evaluable
 * 
 * @author Giovanni Giove
*/
public class Quiniela {
  public static void main(String[] args) {
      // Arrays para almacenar las apuestas y los resultados(los he puesto de tipo char porque 
      //luego en el método para general el resultado alaeatorio los cambio con un switch)
      char[][] quiniela = new char[14][3];
      char[] pleno = new char[2]; // Resultado del Pleno al 15

      // Generamos las apuestas aleatorias para cada partido
      for (int i = 0; i < quiniela.length; i++) {
          for (int j = 0; j < quiniela[i].length; j++) {
            quiniela[i][j] = generarResultadoAleatorio();
          }
      }

      // Generamos el resultado del Pleno al 15
      pleno[0] = generarResultadoPleno();
      pleno[1] = generarResultadoPleno();

      // Mostrar las apuestas y los resultados
      System.out.println("Apuestas de la quiniela:");
      for (int i = 0; i < quiniela.length; i++) {
        System.out.print("Partido "+(i+1) +":");
          for (int j = 0; j < quiniela[i].length; j++) {
            System.out.print(" " +quiniela[i][j] + " ");
          }
          System.out.println();
      }
      System.out.print("-------------------------------");
      System.out.println("\nResultado del Pleno al 15: " + pleno[0] + "-" + pleno[1] +"|");
      System.out.print("-------------------------------");
      // Calcular y mostrar el número de aciertos por apuesta
      int[] aciertos = new int[3];
      for (int i = 0; i < quiniela.length; i++) {
          char resultadoReal = generarResultadoAleatorio();
          for (int j = 0; j < quiniela[i].length; j++) {
              if (quiniela[i][j] == resultadoReal) {
                aciertos[j]++;
              }
          }
      }

      System.out.println("\nNúmero de aciertos:");
      for (int i = 0; i < 3; i++) {
          System.out.println("Apuesta " + (i + 1) + ": " + aciertos[i] + " aciertos");
          if (aciertos[i] >= 10) {
            System.out.println("¡Enhorabuena! Has sido premiado con la apuesta " + (i + 1) + ".");
          }
      }
  }



  /////////////Funciones
  
  // Método para generar un resultado aleatorio (1, X o 2)
  public static char generarResultadoAleatorio() {
      int resultado = (int) (Math.random() * 3);
      if (resultado == 0) {
        return '1';
      } else if (resultado == 1) {
        return 'X';
      } else {
        return '2';
      }
  }

  // Método para generar un resultado aleatorio del Pleno al 15 (0, 1, 2 o M)
  public static char generarResultadoPleno() {
      int resultado = (int) (Math.random() * 4);
      if (resultado == 0) {
        return '0';
      } else if (resultado == 1) {
        return '1';
      } else if (resultado == 2) {
        return '2';
      } else {
        return 'M';
      }
  }
}


