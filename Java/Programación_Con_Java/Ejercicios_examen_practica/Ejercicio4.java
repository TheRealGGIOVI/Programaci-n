import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Ejercicio4 {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new FileReader("./fichero2.txt"));
            HashMap<String, String> hashMap = new HashMap<>();

            String linea1 = br.readLine();
            while (linea1 != null) {
                String[] palabras = linea1.split("-");
                hashMap.put(palabras[0], palabras[1]);
                linea1 = br.readLine();
            }
            br.close();

            boolean salir = false;
            BufferedWriter bw = new BufferedWriter(new FileWriter("./fichero2.txt", true));

            do {
                System.out.println("Agregar");
                System.out.println("Cambiar");
                System.out.println("Borrar");
                System.out.println("Listar");
                System.out.println("Elige la opción que quieras hacer con los datos del HashMap: (La primera en mayúscula)");
                String respuesta = System.console().readLine();

                switch (respuesta) {
                    case "Agregar":
                        System.out.print("Escribe la clave que quieras añadir: ");
                        String clave = System.console().readLine();
                        if (hashMap.containsKey(clave)) {
                            System.out.println("No pueden existir dos claves iguales");
                            break;
                        }
                        System.out.print("Escribe el valor que quieras añadir: ");
                        String valor = System.console().readLine();
                        hashMap.put(clave, valor);
                        bw.write(clave + "-" + valor);
                        bw.newLine();
                        break;

                    case "Cambiar":
                        System.out.print("Introduce la clave a la que desees cambiarle el valor: ");
                        clave = System.console().readLine();
                        if (!hashMap.containsKey(clave)) {
                            System.out.println("No existe esa clave");
                            break;
                        }
                        System.out.print("Introduce el nuevo valor para la clave " + clave + ": ");
                        valor = System.console().readLine();
                        hashMap.put(clave, valor);
                    
                        bw = new BufferedWriter(new FileWriter("./fichero2.txt"));
                        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                            bw.write(entry.getKey() + "-" + entry.getValue());
                            bw.newLine();
                        }
                        break;

                    case "Borrar":
                        System.out.print("Introduce la clave que quieras borrar: ");
                        clave = System.console().readLine();
                        if (hashMap.containsKey(clave)) {
                            hashMap.remove(clave);
                            
                            bw = new BufferedWriter(new FileWriter("./fichero2.txt"));
                            for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                                bw.write(entry.getKey() + "-" + entry.getValue());
                                bw.newLine();
                            }
                        } else {
                            System.out.println("No puedes borrar una clave que no existe.");
                        }
                        break;

                    case "Listar":
                        for (Map.Entry<String, String> entry : hashMap.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                        salir = true;
                        break;

                    default:
                        System.out.println("Por favor elija una opción correcta o escriba 'salir'");
                        break;
                }
            } while (!salir);
            bw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Fichero no encontrado: " + e.getMessage());
        }
    }
}
