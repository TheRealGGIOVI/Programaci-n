package Ejercicio3herencias;

public class Animal {


  /////Atributos
  String nombre;
  String color;
  String raza;
  String sexo;
  int edad;
  double peso;


  
  /////Métodos
  void come(String comida) {
    System.out.println("Ñaam me encanta comer " +comida);
  }

  String duerme() {
    return "zzzzzz";
  }

  
}
