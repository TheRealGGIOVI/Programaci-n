/**
 * Ejercicio 2
 * 
 * @author Giovanni Giove
*/
public class Ejercicio2 {

//Función para sumar dos filas
public static int sumarFila(int[][] tabla, int filas) {
  int sum = 0;
  if (filas < 1 || filas > tabla[0].length) {
      System.out.println("El número de fila introducida no es válido.");
      return -1;
  }
  for (int[] row : tabla) {
      sum += row[filas - 1];
  }
  return sum;
}

//FUnción para sumar dos culomnas
public static int sumarColumna(int[][] tabla, int columnas) {
  int sum = 0;
  if (columnas < 1 || columnas > tabla[0].length) {
      System.out.println("El número de columna introducida no es válido.");
      return -1;
  }
  for (int[] row : tabla) {
      sum += row[columnas - 1];
  }
  return sum;
}


  public static void main(String[] args) {
    int[][] tabla = null;
    boolean continuar = true;
    int filas = 0;
    int columnas = 0;
    int fila1 = 0;
    int col1 = 0;
    int fila2 = 0;
    int col2 = 0;
    int filaSuma = 0;
    int colSuma = 0;
    int maxAleatorio = 0;

    while (continuar) {
      System.out.println("\n--- Menú ---");
      System.out.println("1. Generar tabla aleatoriamente");
      System.out.println("2. Generar tabla manualmente");
      System.out.println("3. Mostrar tabla");
      System.out.println("4. Intercambiar dos filas");
      System.out.println("5. Intercambiar dos columnas");
      System.out.println("6. Sumar elementos de una fila");
      System.out.println("7. Sumar elementos de una columna");
      System.out.println("8. Salir");

      System.out.print("Seleccione una opción: ");
      int opcion = Integer.parseInt(System.console().readLine());

      switch (opcion) {
        case 1:
        System.out.print("¿Cuántas filas quieres que tenga la tabla? ");
        filas = Integer.parseInt(System.console().readLine());
    
        System.out.print("¿Cuántas columnas quieres que tenga la columna? ");
        columnas = Integer.parseInt(System.console().readLine());
    
        System.out.println("¿Cuál quieres que sea el valor máximo que aparezca en la tabla? ");
        maxAleatorio = Integer.parseInt(System.console().readLine());
    
    
        for (int i = 0; i < filas; i++) {
          for (int j = 0; j < columnas; j++) {
            tabla[i][j] = (int) (Math.random() * maxAleatorio + 1);
          }
        }
          break;
        case 2:
        System.out.print("¿Cuántas filas quieres que tenga la tabla? ");
        filas = Integer.parseInt(System.console().readLine());
    
        System.out.print("¿Cuántas columnas quieres que tenga la columna?");
        columnas = Integer.parseInt(System.console().readLine());
    
        
    
        for (int i = 0; i < filas; i++) {
          for (int j = 0; j < columnas; j++) {
            System.out.println("Rellene los valores de cada posición de la tabla: ");
            tabla[i][j] = Integer.parseInt(System.console().readLine());
          }
        }
          break;
        case 3:
          if (tabla == null) {
            System.out.println("Primero debe generar la tabla.");
          }
  
          for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
              System.out.print(tabla[i][j] + " ");
            }
          System.out.println();
          }
          break;
        case 4:
            if (tabla == null) {
              System.out.println("La tabla está vacía. No se pueden intercambiar filas.");
            }
        
          System.out.print("Introduzca el número de la primera fila a intercambiar: ");
          fila1 = Integer.parseInt(System.console().readLine());
          System.out.print("Introduzca el número de la segunda fila a intercambiar: ");
          fila2 = Integer.parseInt(System.console().readLine());
        
          if (fila1 <= 0 || fila1 > tabla.length || fila2 <= 0 || fila2 > tabla.length) {
              System.out.println("Los números de fila introducidos no son válidos.");
        
          }
        
          for (int i = 0; i < tabla[0].length; i++) {
              int temp = tabla[fila1 - 1][i];
              tabla[fila1 - 1][i] = tabla[fila2 - 1][i];
              tabla[fila2 - 1][i] = temp;
          }
          break;
        case 5:
          if (tabla == null) {
            System.out.println("La tabla está vacía. No se pueden intercambiar columnas.");
          }
        
          System.out.print("Introduzca el número de la primera columna a intercambiar: ");
          col1 = Integer.parseInt(System.console().readLine());
          System.out.print("Introduzca el número de la segunda columna a intercambiar: ");
          col2 = Integer.parseInt(System.console().readLine());
        
          if (col1 <= 0 || col1 > tabla[0].length || col2 <= 0 || col2 > tabla[0].length) {
            System.out.println("Los números de columna introducidos no son válidos.");
          }
        
          for (int i = 0; i < tabla.length; i++) {
            int temp = tabla[i][col1 - 1];
            tabla[i][col1 - 1] = tabla[i][col2 - 1];
            tabla[i][col2 - 1] = temp;
          }
          break;
        case 6:
          System.out.print("Introduzca el número de la fila a sumar: ");
          colSuma = Integer.parseInt(System.console().readLine());
          int sumaFila = sumarFila(tabla, filaSuma);
          if (sumaFila != -1) {
              System.out.println("La suma de los elementos de la columna " + colSuma + " es: " + sumaFila);
          }
          break;
          case 7:
          System.out.print("Introduzca el número de la columna a sumar: ");
          colSuma = Integer.parseInt(System.console().readLine());
          int sumaCol = sumarColumna(tabla, colSuma);
          if (sumaCol != -1) {
              System.out.println("La suma de los elementos de la columna " + colSuma + " es: " + sumaCol);
          }
          break;
        case 8:
          System.out.println("¡Gracias!");
          continuar = false;
          break;
        default:
          System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
      }
    }
  }
}