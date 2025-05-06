package colecciones;

import java.util.*;

/**
 *
 * @author Luis
 */
public class Compras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> datos = new ArrayList<String>();
        menu(datos);
    }

    public static void menu(ArrayList<String> datos) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        System.out.println("Bienvenidos al gestor de productos.");
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Aniadir productos.");
            System.out.println("2. Mostrar productos.");
            System.out.println("3. Eliminar productos.");
            System.out.println("4. Salir.");
            System.out.println("Elige una opcion: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    añadir(datos, inStr);
                    break;
                case 2:
                    mostrar(datos);
                    break;
                case 3:
                    eliminar(datos, in);
                    break;
                case 4:
                    System.out.println("Finaliza el programa.");
                    break;
                default:
                    System.out.println("Introduce una opción correcta.");
                    break;
            }
        }
    }

    public static void añadir(ArrayList<String> datos, Scanner inStr) {
        System.out.println("Ingrese el producto: ");
        String producto = inStr.nextLine();
        datos.add(producto);
    }

    public static void mostrar(ArrayList<String> datos) {
        System.out.println("La lista de productos es: ");
        int i = 1;
        for (String d : datos) {
            System.out.println(i + ". " + d);
            i++;
        }
        System.out.println("--------------------------------");
    }

    public static void eliminar(ArrayList<String> datos, Scanner in) {
        System.out.println("Indique el numero de producto que desea eliminar: ");
        int indice = in.nextInt();
        if (indice > 0 && indice <= datos.size()) {
            System.out.println("Se ha eliminado el producto " + indice + ".");
            datos.remove(indice - 1);
        } else {
            System.out.println("El indice del producto no existe.");
        }
    }
}
