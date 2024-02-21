/**
*
* Ejemplo Gato Simple en POO
*
* @author: Giovanni Giove
*/

public class GatoSimple {

    //Atributos 

    String color, raza, sexo, nombre;
    int edad;
    double peso;

    //Métodos

    //Constructor
    GatoSimple (String s, String color, String raza, String nombre) {
        this.sexo = s;
        this.color = color;
        this.raza = raza;
        this.nombre = nombre;
    }

    //Getter
    public String getSexo() {
        return this.sexo;
    }

    public String getNombre () {
        return this.nombre;
    }

    public String getColor() {
        return color;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public double getPeso() {
        return peso;
    }

    /**
     * Hace que el gato maulle
     */

    void maulla() {
        System.out.println("Miaaaau");
    }


    public int compareTo (GatoSimple g) {
        return (this.nombre).compareTo(g.getNombre());
    }
    /**
    * Hace que el gato ronronee
    */

    void ronronea() {
     System.out.println("prrrrr");
    }

    /**
    * Hace que el gato coma.
    *  * @param comida  la comida que se le ofrece al gato
    */

    void come(String comida) {
        if (comida.equals("pescado")) {
          System.out.println("Hmmmm, gracias");
        } else {
            System.out.println("Lo siento, sólo como pescado");
        }
    }

    /**
    * Pone a pelear dos gatos.
    * Solo se van a pelear dos machos entre sí.
    *
    * @param contrincante es el gato contra el que pelear
    */

    void peleaCon(GatoSimple contrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println("no me gusta pelear");
        } else {
            if (contrincante.getSexo().equals("hembra")) {
                System.out.println("no peleo contra gatitas");
            } else {
                System.out.println("ven aquí que te vas a enterar");
            }
        }
    }

    @Override
    public String toString() {
        return "GatoSimple [color=" + color + ", raza=" + raza + ", sexo=" + sexo + "]";
    }
}
