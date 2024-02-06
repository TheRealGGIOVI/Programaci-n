public class Terminal {
  

  /////Attributos
  private String numero;
  private int tiempoConversación;   //En segundos
 

  /////Constructores
  public Terminal(String numero) {
    this.numero = numero;
  }



  /////Getters
  
  public String getNumero() {
    return numero;
  }


  public int getTiempoConversación() {
    return tiempoConversación;
  }



  /////Setters
  public void setNumero(String numero) {
    this.numero = numero;
  }


  public void setTiempoConversación(int tiempoConversación) {
    this.tiempoConversación = tiempoConversación;
  }



  @Override
  public String toString() {
    return "Nº " + numero +" - " + tiempoConversación +"s de conversación"; 
  } 

  public void llama(Terminal t, int tiempoConversación) {
    this.tiempoConversación += tiempoConversación;
    t.tiempoConversación += tiempoConversación;
  }

}
