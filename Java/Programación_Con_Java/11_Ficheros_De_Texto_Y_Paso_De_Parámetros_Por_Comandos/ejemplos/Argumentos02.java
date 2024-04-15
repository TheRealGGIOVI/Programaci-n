public class Argumentos02 {
  public static void main(String[] args) {
    double suma = 0;

    for (int i = 0; i < args.length; i++) {
      suma += Double.parseDouble(args[i]);
    }

    System.out.println("La suma de ");
    
    for (int i = 0; i < args.length; i++) {
      if (i == args.length -1) {
        System.out.println(args[i] + " es ");
      } else {
        System.out.println(args[i] + " + ");
      }
      
    }
    System.out.println(suma);
  }
}
