/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
/**
 * Ejemplos01
 */
public class Ejemplos01 {
 public static void main(String[] args) {
  
  //tipo byte
  byte miNumByte = 100;
  System.out.println("Mi número de tipo byte es: " +miNumByte);

  //Tipo short
  short miNumShort = 5000;
  System.out.println("Mi número de tipo short es: " +miNumShort);

  //Tipo long
  long miNumLong = 150000000L;
  System.out.println("Mi número de tipo long es: " +miNumLong);

  //Tipo float
  float miNumFloat = 5.75f;
  System.out.println("Mi número de tipo float es: " +miNumLong);

  //Tipo bolean
  boolean esJavaDivertido = true;
  boolean esProfeDivertido = false;
  System.out.println("¿Es divertido programar con java? " +esJavaDivertido);
  System.out.println("¿Es el profe divertido? " +esProfeDivertido);

  int numero = 5;
  System.out.println("El valor de una variable es: " +numero);

  double x;
  double y;
  x = 7;
  y = 25.75;
  System.out.println("x vale " +x);
  System.out.println("y vale " +y);

  char letra1 = 99;
  char letra2 = 97;
  System.out.println(letra1);
  System.out.println("" +letra1 +  letra2);

  //No son lo mismo
  String miString = "a";
  char letraA = 'a';
  System.out.println(miString);
  System.out.println(letraA);
 }
  
}