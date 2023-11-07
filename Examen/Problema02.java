import java.util.Scanner;

public class Problema02 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int dias;
    

    System.out.println("\033[1;37mCalculadora De Tiempo\033[0m");
    System.out.println("");
    System.out.println("=====================");
    System.out.println("");
    System.out.print("Introduce una cantidad de días: ");
    dias = sc.nextInt();
    int años = (dias/365);
    int meses = (dias%365)/30;
    int dias1 = (dias%365)%30;
    
    System.out.println("");
    System.out.println(dias +" días son " +"\033[0;41m" +años +" años\033[0m"+", " +"\033[0;43m" +meses +" meses\033[0m" +"y " +"\033[0;42m" +dias1 +" días\033[0m" );
    sc.close();
  } 
}
