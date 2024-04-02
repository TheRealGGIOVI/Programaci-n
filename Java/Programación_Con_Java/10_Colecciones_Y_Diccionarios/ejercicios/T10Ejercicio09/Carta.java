/**
 * Ejercicio 9 Tema 10
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Sergio Sánchez
 */
public class Carta implements Comparable<Carta>{
  private static String[] p = {"Oros", "Bastos", "Espadas", "Copas"};
  private static int[] n = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

  String palo;
  int valor;

  public Carta(){
    this.palo = p[(int)(Math.random()*2)];
    this.valor = n[(int)(Math.random()*4)];
  }

  public String getPalo() {
    return palo;
  }

  public int getValor() {
    return valor;
  }

  @Override
  public String toString() {
    return valor + " de " + palo;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Carta other = (Carta) obj;
    if (valor != (other.valor))
      return false;
    if (!palo.equals(other.palo))
      return false;
    return true;
  }
  
  // @Override
  // public int compareTo(Carta c) {
  //   if (this.palo.equals(c.getPalo())) {
  //     return this.valor.compareTo(c.getValor());
  //   } else {
  //     return this.palo.compareTo(c.getPalo());
  //   }
  // }

  @Override
  public int compareTo(Carta c) {
    if (this.palo.equals(c.getPalo())) {
      return Integer.compare(this.valor, c.getValor());
    } else {
      return this.palo.compareTo(c.getPalo());
    }
  }
}

