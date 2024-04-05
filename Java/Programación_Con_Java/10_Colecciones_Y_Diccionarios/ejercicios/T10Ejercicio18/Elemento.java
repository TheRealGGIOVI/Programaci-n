package T10Ejercicio18;

public class Elemento {
  private String producto;
  private double precio;
  private int cantidad;

  public Elemento(String producto, double precio, int cantidad) {
    this.producto = producto;
    this.precio = precio;
    this.cantidad = cantidad;
  }

  @Override
  public String toString() {
    return this.producto 
      + " PVP: " + String.format("%.2f ", this.precio )
      + " Unidades: " + this.cantidad 
      + " Subtotal: " + String.format("%.2f ", this.precio * this.cantidad );
  }

  

  public double getPrecio() {
    return this.precio;
  }

  public int getCantidad() {
    return this.cantidad;
  }

  
  public String getProducto() {
    return producto;
  }

  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Elemento aux = (Elemento) obj;
    if (this.producto.equals(aux.getProducto())) {
      return false;
    }
    return true;
  }

  

  

}