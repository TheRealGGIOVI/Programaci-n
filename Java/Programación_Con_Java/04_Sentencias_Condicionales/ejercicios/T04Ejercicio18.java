import java.util.Scanner;

public class T04Ejercicio18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numero;
    int primera = 0; //almaceno la 1ª cifra del numero

    System.out.print("Porfavor introduzca un número entero positivo de hasta 5 cifras como máximo: ");
    numero = sc.nextInt();
    
    if(numero < 10) { // 1 cifra
      primera = numero;
    }

     
    if((numero >= 10) && (numero <100)) { // 2 cifras
      primera = numero/10;

    }

    if((numero >= 100) && (numero <1000)) { // 3cifras
      primera = numero/100;
      
    }

    if((numero >= 1000) && (numero <10000)) { // 4 cifras
      primera = numero/1000;
      
    }


    if((numero >= 10000) && (numero <100000)) { // 5 cifras
      primera = numero/10000;
      
    }


    System.out.println("La primera cifra del número: " +numero +" es el " +primera);
    sc.close();

  }
}
