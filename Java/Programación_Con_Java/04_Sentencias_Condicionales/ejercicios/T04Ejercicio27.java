import java.util.Scanner;

public class T04Ejercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sabor;
        int precio = 0;
        String choco = "";
        String nata;
        double precioNata = 0;
        String nombre;
        double precioNombre = 0;

        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        sabor = sc.next();

        switch (sabor) {
            case "manzana":
                precio = 18;
                break;
            case "fresa":
                precio = 16;
                break;
            case "chocolate":
                System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
                choco = sc.next();

                if (choco.equals("negro")) {
                    precio = 14;
                    choco = "negro";
                }  else if (choco.equals("blanco")){
                    precio = 15;
                    choco = "blanco";
                }
                break;
            default:
                System.out.println("No has introducido ningún sabor válido");
                break;
        }  

        System.out.print("¿Quiere nata? (si o no): ");
        nata = sc.next();

    

        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        nombre = sc.next();


        System.out.println("Tarta de " + sabor + " " + choco + ": " +precio + "€");
        if (nata.equals("si"))  {
            precioNata = 2.50;
           System.out.println("Con nata: " + 2.50 + " €");
        }
        
        if (nombre.equals("si")) {
            precioNombre = 2.75;
            System.out.println("Con nombre: " + 2.75 +" €");

        }

        double precioTotal = precio + precioNata +precioNombre; 

        System.out.println("Total: " +precioTotal + " €");

        sc.close();
    }
}
