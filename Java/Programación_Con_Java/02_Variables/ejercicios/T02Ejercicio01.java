/**
 * Escribe un programa en el que se declaren las variables enteras x e y. Asígnales
 * los valores 144 y 999 respectivamente. A continuación, muestra por pantalla
 * el valor de cada variable, la suma, la resta, la división y la multiplicación.
 * 
 * @author Giovanni Giove
*/
public class T02Ejercicio01 {
  public static void main(String[] args) {
    int num1 = 144;
    int num2 = 999;
    int suma = num1+num2;
    int resta = num1-num2;
    double divi = (double) num1/(double) num2;
    int multip = num1*num2;
    System.out.println("El valor de la primera variable es: " +num1);
    System.out.println("El valor de la segunda variable es: " +num2);
    System.out.println("La suma de ambas variables es: " +suma);
    System.out.println("Laresta de las dos variables es de: " +resta);
    System.out.println("El valor de la división de ambas variables es de: " + (double) divi);
    System.out.println("La división de las dos variabkes es de: " +multip);
  }
}
