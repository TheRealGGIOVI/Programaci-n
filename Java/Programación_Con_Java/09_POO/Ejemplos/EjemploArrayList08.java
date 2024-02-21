import java.util.ArrayList;
import java.util.Collection;

/**
*
* ArrayList de objetos: creación y adición a la lista de objetos de la clase Gato
*
* @author: Giovanni Giove
*/

public class EjemploArrayList08 {
    public static void main(String[] args) {

        ArrayList<GatoSimple> g = new ArrayList<GatoSimple>();

        //Se añaden 5 elementos
       g.add(new GatoSimple("null", "null", "null", "null"));
       g.add(new GatoSimple("null", "null", "null", "null"));
       g.add(new GatoSimple("null", "null", "null", "null"));
       g.add(new GatoSimple("null", "null", "null", "null"));
       g.add(new GatoSimple("null", "null", "null", "null"));

        Collection.sort(g);

        System.out.println("Listado de gatos: ");

       for (GatoSimple gato : g) {
            System.out.println(gato);
       }
    }
}
