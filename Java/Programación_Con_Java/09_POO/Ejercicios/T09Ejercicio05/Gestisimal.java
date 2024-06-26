package T09Ejercicio05;

public class Gestisimal {
  static final int N = 10;
  static Articulo[] almacen = new Articulo[N];

  //Funcion para que diga si esta lleno o no el array
  public static int primeraLibre() {
    for (int i = 0; i < N; i++) {
      if (almacen[i].getCodigo() == null) {
        return i;
      }
    }
    return -1;
  }

  public static boolean codigoExiste(String codigo) {
    for (Articulo articulo : almacen) {
      if (articulo.getCodigo().equals(codigo)) {
        return true;
      }
    }
    return false;
  }

  public static int posicionArticulo(String codigo) {
    for (int i = 0; i < N; i++) {
      if (almacen[i].getCodigo().equals(codigo)) {
        return i;
      }
    }
    return -1;
  }


  public static void main(String[] args) {
    for (int i = 0; i < N; i++) {
     Gestisimal.almacen[i] = new Articulo(); 
    }

    int menu;
    String codigoIntroducido;
    String nuevoCodigoIntroducido;
    String descripcionIntroducido;
    Double precioCompraIntroducido;
    Double precioVentaIntroducido;
    int stockIntroducido;
    int i;

    do {
      System.out.println("--- MENÚ GESTISIMAL --");
      System.out.println("1. Listado");
      System.out.println("2. Alta");
      System.out.println("3. Baja");
      System.out.println("4. Modificación");
      System.out.println("5. Entrada de mercancía");
      System.out.println("6. Slaida de mercancía");
      System.out.println("7. Salir");
      System.out.println("Introduzca una opción: ");
      menu = Integer.parseInt(System.console().readLine());

      switch (menu) {
        case 1:     //Listado
          for (Articulo articulo : almacen) {
            if (articulo.getCodigo() != null) {
              System.out.println(articulo);
            }
          }
          break;

        case 2:   //Alta
          if (primeraLibre() == -1) {
            System.out.println("Lo sentimos. No queda hueco para registrar los artículos.");
          } else {
            System.out.print("Código: ");
            codigoIntroducido = System.console().readLine();
            System.out.print("Descripcio: ");
            descripcionIntroducido = System.console().readLine();
            System.out.print("Precio de compra: ");
            precioCompraIntroducido = Double.parseDouble(System.console().readLine());
            System.out.print("Precio de venta: ");
            precioVentaIntroducido = Double.parseDouble(System.console().readLine());
            System.out.print("Stock: ");
            stockIntroducido = Integer.parseInt(System.console().readLine());

            almacen[primeraLibre()] = new Articulo();
          }
          break;


        case 3:   //Baja
          System.out.println("Introduzac el código del artículo a eliminar: ");
          codigoIntroducido = System.console().readLine();
          if (!codigoExiste(codigoIntroducido)) {
            System.out.println("Lo siento el codigo introdudio no existe");
          } else {
            almacen[posicionArticulo(codigoIntroducido)].setCodigo(null);
          }
          break;
        case 4:   //Modificación
          System.out.println("Introduzac el código del artículo a modificar: ");
          codigoIntroducido = System.console().readLine();
          if (!codigoExiste(codigoIntroducido)) {
            System.out.println("Lo siento el codigo introdudio no existe");
          } else {
            // posicionArticulo(codigoIntroducido);
            System.out.print("Nuevo código: ");
            nuevoCodigoIntroducido = System.console().readLine();
            almacen[posicionArticulo(codigoIntroducido)].setCodigo(nuevoCodigoIntroducido);
            System.out.print("Nueva descripcio: ");
            descripcionIntroducido = System.console().readLine();
            almacen[posicionArticulo(codigoIntroducido)].setDescripcion(descripcionIntroducido);
            System.out.print("Nuevo precio de compra: ");
            precioCompraIntroducido = Double.parseDouble(System.console().readLine());
            almacen[posicionArticulo(codigoIntroducido)].setPrecioCompra(precioCompraIntroducido);
            System.out.print("Nuevo precio de venta: ");
            precioVentaIntroducido = Double.parseDouble(System.console().readLine());
            almacen[posicionArticulo(codigoIntroducido)].setPreicoVenta(precioVentaIntroducido);
            System.out.print("Nuevo stock: ");
            stockIntroducido = Integer.parseInt(System.console().readLine());
            almacen[posicionArticulo(codigoIntroducido)].setStock(stockIntroducido);
          }
          break;
        case 5:
          System.out.println("Entrada de mercancía del artículo: ");
          codigoIntroducido = System.console().readLine();
          if (!codigoExiste(codigoIntroducido)) {
            System.out.println("Lo siento el codigo introdudio no existe");
          } else {
            System.out.print("Introduzca la cantidad de unidades a introducir: ");
            stockIntroducido = Integer.parseInt(System.console().readLine());
            i = posicionArticulo(codigoIntroducido);
            almacen[i].setStock(stockIntroducido + almacen[i].getStock());
          }
          break;
        case 6:
        System.out.println("Salida de mercancía del artículo: ");
        codigoIntroducido = System.console().readLine();
        if (!codigoExiste(codigoIntroducido)) {
          System.out.println("Lo siento el codigo introdudio no existe");
        } else {
          System.out.print("Introduzca la cantidad de unidades a retirar: ");
          stockIntroducido = Integer.parseInt(System.console().readLine());
          i = posicionArticulo(codigoIntroducido);
          if (almacen[i].getStock() - stockIntroducido >= 0) {
            almacen[i].setStock(almacen[i].getStock() - stockIntroducido);
          } else {
            System.out.println("Lo sentimos no se puede retirar la cantidad solicitada" + "\n. La cantidad máxima es " + almacen[i].getStock());
          }
        }
        break;

      case 7:
        System.out.println("Adiós");
        break;
        default:
          System.out.println("Opción del manú no válida. Inténtelo de nuevo");
          break;
      }

    } while (menu != 7);
  }
}
