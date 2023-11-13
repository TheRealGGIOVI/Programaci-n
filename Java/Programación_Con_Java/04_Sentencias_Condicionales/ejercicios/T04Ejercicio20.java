
/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio20 {
  public static void main(String[] args) {
    
    int n;
    boolean capicua = false;

    System.out.print("Introduce un número (de 5 cifras como máximo) para saber si es capicua: ");
    n = Integer.parseInt(System.console().readLine());

    //numeros de 1 cifra
    if (n < 10) {
      capicua= true;
      
    }
    
    //numeros 2 cifras
    if ((n >=100) && (n < 100)) {
      if ((n / 10) == (n % 10)) {
        capicua = true;
        
      }
    }
    
    //numeros 3 cifras
    if ((n >= 100) && (n < 1000)) {
      if ((n / 100) == (n % 10)) {
        capicua = true;
        
      }
      
    }

    //numeros 4 cifras
    if ((n>= 1000) && (n < 10000)) {
      if (((n / 1000) == (n % 10)) && (((n / 100) % 10) == ((n / 10) % 10))) {
        capicua = true;
      }
    }
  }
}