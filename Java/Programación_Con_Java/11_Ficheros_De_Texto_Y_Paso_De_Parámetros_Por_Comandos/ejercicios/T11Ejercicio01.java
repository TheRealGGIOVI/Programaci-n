import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class T11Ejercicio01 {

  public static boolean esPrimo(int numero) {
    if (numero <= 1) {
        return false;
    }
    if (numero <= 3) {
        return true;
    }
    if (numero % 2 == 0 || numero % 3 == 0) {
        return false;
    }
    int i = 5;
    while (i * i <= numero) {
        if (numero % i == 0 || numero % (i + 2) == 0) {
            return false;
        }
        i += 6;
    }
    return true;  
  }
  
  public static void main(String[] args) {
    try {
      BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/primos.txt"));
      for (int i = 1; i <= 500; i++) {
        if (esPrimo(i)) {
          bw.write(String.valueOf(i)+ "\n");

        }
      }
      bw.close();
    } catch (IOException ioe) {
      System.out.println("No se ha podido escribir en el fichero " +ioe.getMessage());
    }
  }
}
