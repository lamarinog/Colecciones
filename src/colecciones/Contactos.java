package colecciones;

import java.util.*;

/**
 *
 * @author Luis
 */
public class Contactos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Contacto> datos = new ArrayList<Contacto>();
        menu(datos);
    }

    public static void menu(ArrayList<Contacto> datos) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        System.out.println("Bienvenidos al gestor de agenda de contactos.");
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Aniadir contacto.");
            System.out.println("2. Mostrar contacto.");
            System.out.println("3. Eliminar contacto.");
            System.out.println("4. Buscar contacto por nombre.");
            System.out.println("5. Salir.");
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
                    buscar(datos, inStr);
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

    public static void añadir(ArrayList<Contacto> datos, Scanner inStr) {
        System.out.println("Ingrese el nombre: ");
        String nom = inStr.nextLine();
        System.out.println("Ingrese el telefono: ");
        String tel = inStr.nextLine();
        datos.add(new Contacto(nom, tel));
        System.out.println("Se agrego con exito el contacto.");
    }

    public static void mostrar(ArrayList<Contacto> datos) {
        System.out.println("La lista de contactos es: ");
        int i = 1;
        for (Contacto d : datos) {
            System.out.println(i + ". " + d.getNom() + "-" + d.getTel());
            i++;
        }
        System.out.println("--------------------------------");
    }

    public static void eliminar(ArrayList<Contacto> datos, Scanner in) {
        System.out.println("Indique el numero de libro que desea eliminar: ");
        int indice = in.nextInt();
        if (indice > 0 && indice <= datos.size()) {
            System.out.println("Se ha eliminado el contacto " + indice + ".");
            datos.remove(indice - 1);
        } else {
            System.out.println("El indice del libro no existe.");
        }
    }

    public static void buscar(ArrayList<Contacto> datos, Scanner inStr) {
        System.out.println("Ingrese el nombre a buscar: ");
        String nom = inStr.nextLine();
        boolean encontrar = false;
        for (Contacto d : datos) {
            if (d.getNom().equalsIgnoreCase(nom)) {
                System.out.println(d.getNom() + "-" + d.getTel());
                encontrar = true;
            }
        }
        if (!encontrar) {
            System.out.println("No se encontro el contacto.");
        }
    }
}
