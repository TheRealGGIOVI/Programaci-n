import java.time.LocalTime;

/**
 * Explica tu código aquí
 * 
 * @author Giovanni Giove
*/
public class T04Ejercicio11 {

  public static void main(String[] args) {
    // Obtengo mi hora a través de LocalTime
    LocalTime horaActual = LocalTime.now();

    // Calculo los segundos que faltan hasta las 00:00
    long segundosHastaMedianoche = horaActual.until(LocalTime.MAX, java.time.temporal.ChronoUnit.SECONDS);

    // Controlo que sea media noche por si acaso
    if (segundosHastaMedianoche == 0) {
      System.out.println("¡Es medianoche!");
    } else {
      // Imprimir los segundos restantes hasta medianoche
      System.out.println("Segundos hasta medianoche: " + segundosHastaMedianoche);
    }

  }
}

