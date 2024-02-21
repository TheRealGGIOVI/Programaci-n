import java.util.ArrayList;
import java.util.Collections;



public class Ejercicio08 {

  class Carta {
    private String palo;
    private String valor;
  
    public Carta(String palo, String valor) {
        this.palo = palo;
        this.valor = valor;
    }
  
    public String toString() {
        return valor + " de " + palo;
    }
  }
    public static void main(String[] args) {
        String[] palos = {"Oros", "Copas", "Espadas", "Bastos"};
        String[] valores = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "Nueve", "Diez", "Sota", "Caballo", "Rey"};

        ArrayList<Carta> baraja = new ArrayList<>();

        // Crear la baraja completa
        for (String palo : palos) {
            for (String valor : valores) {
                baraja.add(new Carta(palo, valor));
            }
        }

        // Mezclar la baraja
        Collections.shuffle(baraja);

        // Seleccionar las 10 cartas aleatoriamente
        ArrayList<Carta> mano = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            mano.add(baraja.get(i));
        }

        // Imprimir las cartas seleccionadas
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }
}
