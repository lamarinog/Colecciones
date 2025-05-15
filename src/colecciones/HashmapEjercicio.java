package colecciones;

import java.util.*;

/**
 *
 * @author Luis
 */
public class HashmapEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        diccionario();
        contador();
        agenda();
    }

    public static void diccionario() {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("hello", "hola");
        diccionario.put("goodbye", "chao");
        diccionario.put("cat", "gato");
        diccionario.put("dog", "perro");
        System.out.println("Ingrese la palabra en ingles a traducir: ");
        Scanner inStr = new Scanner(System.in);
        String palabra = inStr.nextLine();
        String traduccion = diccionario.get(palabra);
        if (traduccion != null) {
            System.out.println("La traduccion es: " + traduccion);
        } else {
            System.out.println("Palabra no encontrada.");
        }
    }

    public static void contador() {
        HashMap<String, Integer> contador = new HashMap<>();
        System.out.println("Igresa la frase a contar palabras: ");
        Scanner inStr = new Scanner(System.in);
        String palabra = inStr.nextLine();
        String[] palabras = palabra.split(" ");
        for (String p : palabras) {
            if (contador.containsKey(p)) {
                int veces = contador.get(p);
                contador.put(p, veces + 1);
            } else {
                contador.put(p, 1);
            }
        }
        System.out.println("Recuento de palabras");
        for (HashMap.Entry<String, Integer> c : contador.entrySet()) {
            System.out.println(c.getKey() + "-" + c.getValue());
        }
    }

    public static void agenda() {
        HashMap<String, String> contactos = new HashMap<>();
        System.out.println("AGENDA DE CONTACTOS");
        Scanner inStr = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Aniadir contacto.");
            System.out.println("2. Mostrar contactos.");
            System.out.println("3. Eliminar contacto.");
            System.out.println("4. Buscar contacto por nombre.");
            System.out.println("5. Salir.");
            System.out.println("Elige una opcion: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    añadir(contactos, inStr);
                    break;
                case 2:
                    mostrar(contactos);
                    break;
                case 3:
                    eliminar(contactos, inStr);
                    break;
                case 4:
                    buscar(contactos, inStr);
                    break;
                case 5:
                    System.out.println("Finaliza el programa.");
                    break;
                default:
                    System.out.println("Introduce una opción correcta.");
                    break;
            }
        }
    }

    public static void añadir(HashMap<String, String> datos, Scanner inStr) {
        System.out.println("Ingrese el nombre: ");
        String nom = inStr.nextLine();
        System.out.println("Ingrese el telefono: ");
        String tel = inStr.nextLine();
        datos.put(nom, tel);
        System.out.println("Se agrego con exito el contacto.");
    }

    public static void mostrar(HashMap<String, String> datos) {
        System.out.println("La lista de contactos es: ");
        for (HashMap.Entry<String, String> d : datos.entrySet()) {
            System.out.println("nom: " + d.getKey() + ", telf: " + d.getValue());
        }
        System.out.println("--------------------------------");
    }

    public static void eliminar(HashMap<String, String> datos, Scanner inStr) {
        System.out.println("Indique el nombre de contacto que desea eliminar: ");
        String contacto = inStr.nextLine();
        if (datos.containsKey(contacto)) {
            datos.remove(contacto);
            System.out.println("Se borra contacto.");
        } else {
            System.out.println("No existe el contacto a eliminar");
        }
    }

    public static void buscar(HashMap<String, String> datos, Scanner inStr) {
        System.out.println("Ingrese el nombre a buscar: ");
        String nom = inStr.nextLine();
        if (datos.containsKey(nom)) {
            System.out.println(datos.get(nom));
        } else {
            System.out.println("No existe el contacto a eliminar");
        }
    }
}
