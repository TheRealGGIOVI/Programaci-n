/**
 * Creación de la clase coche como ejemplo
 * 
 * @author Giovanni Giove Meschian
 */

 public class Coche {

    //Atributos
    String marca;
    String modelo;
    String color;
    String matricula;
    int numeroPuertas;

    //Métodos
    public void arrancar() {
        System.out.println("BRRRRRRRR");
    }
    public void velocidadMaxima(){
        System.out.println("Estoy yendo a 120 km/h");
    }
    public void sonarClaxon() {
        System.out.println("PIPIIIIIIIII");
    }
    
    public static void main (String[] args) {
        //Creamos dos objetos en la clase coche
        Coche car1 = new Coche();
        Coche car2 = new Coche();

        car1.arrancar();
        car2.velocidadMaxima();
    }
 }