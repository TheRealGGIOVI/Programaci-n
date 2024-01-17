public class Gato {
  
  //Atributos
  String nombre;
  String color;
  String raza;
  String sexo;
  int edad;
  double peso;


  ////////Constructores
  Gato(String nombre) {
    this.nombre = nombre;
    this.color = "Azul";
    this.raza = "Romano";
  }

  Gato(String nombre, String color, String raza, String sexo, int edad, double peso) {
    this.nombre = nombre;
    this.color = color;
    this.raza = raza;
    this.sexo = sexo;
    this.edad = edad;
    this.peso = peso;
  }

  ////////Métodos
  void maulla() {
    System.out.println("Miaaaaaaaaaaau!");
  }

  void ronronea() {
    System.out.println("Brrrrrrrr");
  }

  void come(String comida) {
    if (comida.equalsIgnoreCase("Pescado")) {
      System.out.println("Ñam Ñam");
    } else {
      System.out.println("Soy un gato y solo como pescado");
    }
  }

 /**
  * 
  * @param contrincante
  */
  void peleaCon(Gato contrincante) {
    if (this.sexo.equals(contrincante.sexo) && this.sexo.equals("macho")) {
      System.out.println("Ven aquí que te reviento");
    } else {
      System.out.println("No me gusta pelear");
    }
  }

}
