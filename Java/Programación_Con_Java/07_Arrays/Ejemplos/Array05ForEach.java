  /**
 * Mostramos un arrayde tipo double que almacena notas de alumnos al estilo ForEach
 * 
 * @author Giovanni Giove
*/
public class Array05ForEach {
  public static void main(String[] args) {
    double[] notas = new double[3];
    double media = 0;
    double suma = 0;

    //Escrituras en el array
    for (int i = 0; i < notas.length; i++) {
      System.out.print("Nota de examen nº " +(i + 1) + ": ");
      notas[i] = Double.parseDouble(System.console().readLine());
    }

    //Lectura del array
    System.out.println("Tus notas son:");
    for (double n : notas) {
      System.out.print(n + "\t");
      suma += n;
    }


    media = suma / notas.length;

    System.out.println("\nTu nota media es de: " + media);
  }
}
