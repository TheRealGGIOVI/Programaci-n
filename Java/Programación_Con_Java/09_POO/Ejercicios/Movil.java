public class Movil extends Terminal {


  /////Atrubutos
  private String tarifa;
  private double totalGastos;

  /////Constructores
  public Movil(String numero, String tarifa) {
    super(numero);
    this.tarifa = tarifa;
    this.totalGastos = 0;
  }

  @Override
  public void llama(Terminal t, int tiempoConversación) {
    super.llama(t, tiempoConversación);
    double minutos = (double)tiempoConversación / 60;
    switch (this.tarifa) {
      case "rata":
        totalGastos += minutos * 0.06;
        break;
      case "mono":
      totalGastos += minutos * 0.12;
        break;
      case "bisonte":
      totalGastos += minutos * 0.30;
        break;
      default:
        break;
    }

    
  }

  @Override
  public String toString() {
    return super.toString() +String.format(" - tarificados %.2f euros", totalGastos);
  }


}
