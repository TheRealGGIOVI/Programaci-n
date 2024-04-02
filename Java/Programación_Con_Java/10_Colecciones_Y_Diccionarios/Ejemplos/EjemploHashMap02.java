import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap02 {
  public static void main(String[] args) {
    HashMap<Integer, String> m = new HashMap<>();
    


    m.put(111, "Amalia Nuñez");
    m.put(222, "Cindy Nero");
    m.put(333, "César Vázquez");
    m.put(444, "Víctor Tilla");
    m.put(537, "Alan Brito");
    m.put(605, "Esteban Quito");
    m.put(111, "Cindy Nero");

    // System.out.println("Los elementos de m utilzando entrySet son: \n " +m.entrySet());

    
    for (int key : m.keySet()) {
      System.out.println(key + " = " +m.get(key));
    }
  }
}
