package T10Ejercicio14;

import java.util.HashMap;
import java.util.ArrayList;

public class T10Ejercicio14 {
  public static void main(String[] args) {
    HashMap<String, Double> productos = new HashMap<String, Double>();
    productos.put("avena", 2.21);
    productos.put("garbanzos", 2.39);
    productos.put("tomate", 1.59);
    productos.put("jengibre", 3.13);
    productos.put("quinoa", 4.50);
    productos.put("guisantes", 1.60);
    
    ArrayList<String> listadoProductos = new ArrayList<String>();
    ArrayList<Integer> listadoCantidades = new ArrayList<Integer>();
    boolean continuar = true;
    String productoIntroducido;
    int cantidadIntroducida;
    double total = 0;
    boolean hayDescuento = false;
    double descuento = 0;

    do {
      System.out.print("Producto: ");
      productoIntroducido = System.console().readLine();
      
      if (!productoIntroducido.equalsIgnoreCase("Fin") ) {
        System.out.print("Cantidad: ");
        cantidadIntroducida = Integer.parseInt(System.console().readLine());

        // Si el producto existe en el HashMap
        if (productos.containsKey(productoIntroducido)) {
          // Si el producto ya está en la lista
          if (listadoProductos.contains(productoIntroducido)) {
            int posicion = listadoProductos.indexOf(productoIntroducido);
            listadoCantidades.set(posicion, listadoCantidades.get(posicion) + cantidadIntroducida);
          } else {
            listadoProductos.add(productoIntroducido);
            listadoCantidades.add(cantidadIntroducida);
          }
        } else {
          System.out.println("Lo sentimos, no tenemos este producto.");
        }
      } else {
        continuar = false;
        System.out.print("Introduzca si tiene código de descuento (INTRO si n o tiene ninguno): ");
        String codigoDescuento = System.console().readLine();
        if (codigoDescuento.equals("ECODTO")) {
          hayDescuento = true;
        }
      } 
    }while (continuar);  

    
    System.out.println("");
    System.out.println("Producto Precio Cantidad Subtotal");
    System.out.println("--------------------------------------------------");
    for (int i = 0; i < listadoProductos.size(); i++) {
      String producto = listadoProductos.get(i);
      double precio = productos.get(producto);
      int cantidad = listadoCantidades.get(i);
      double subtotal = precio * cantidad;
      total += subtotal;
      System.out.printf("%-10s %5.2f %6d %8.2f\n", producto, precio, cantidad, subtotal);
    }

    if (hayDescuento) {
      descuento = total * 0.1;  
      total *= 0.9;
    }

    System.out.println("--------------------------------------------------");
    System.out.printf("Descuento: %7.2f€\n", descuento);
    System.out.println("--------------------------------------------------");
    System.out.printf("Total: %7.2f€", total);

      
  }
}

