import java.util.Scanner;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/public class T05Ejercicio20 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la altura de la pirámide: ");
    int altura = sc.nextInt();
    System.out.print("Introduce el carácter con el que se pinta la pirámide: ");
    char caracter = sc.next().charAt(0);

   
    int nivel = 1;    //variable que controla en qué nivel estoy de la pirámide, siendo 1 la cima de la pirámide
    int espaciosPorDelante = altura - 1;
    int espaciosPorDentro = 0; 


    //pintamos toda la pirámide excepto la base
    while (nivel < altura) {
      //pintamos los espacios por delante
      for (int i = 1; i <= espaciosPorDelante; i++){
        System.out.print(" ");
      }

      //pintamos el caracter
      System.out.print(caracter);

      //pintamos los espacios por dentro
      for (int i = 1; i < espaciosPorDentro; i++){
        System.out.println(" ");
      }

      if (nivel > 1) {
        //pintamos el caracter
      System.out.print(caracter);
      }

      //saltamos de línea
      System.out.println();

      nivel++;    //aumenta el nivel de la pirámide
      espaciosPorDelante--;   //En cada nivel pintamos un espacio por delante menos
      espaciosPorDentro += 2;   //En cada nivel pintamos 2 huecos más
    }

    //base de la pirámide
    for (int i = 1; i < altura * 2; i++){
      System.out.print(caracter);
    }
    sc.close();
  }
}
