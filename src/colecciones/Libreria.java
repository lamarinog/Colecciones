package colecciones;

import java.util.*;

/**
 *
 * @author Luis
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Libro> datos = new ArrayList<Libro>();
        ejemplares(datos);
        menu(datos);
    }

    public static void ejemplares(ArrayList<Libro> datos) {
        datos.add(new Libro("El Quixot", "Cervantes"));
        datos.add(new Libro("1984", "Orwell"));
    }

    public static void menu(ArrayList<Libro> datos) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        System.out.println("Bienvenidos al gestor de libreria.");
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Aniadir libros.");
            System.out.println("2. Mostrar libros.");
            System.out.println("3. Eliminar libros.");
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

    public static void añadir(ArrayList<Libro> datos, Scanner inStr) {
        System.out.println("Ingrese el titulo: ");
        String titol = inStr.nextLine();
        System.out.println("Ingrese el autor: ");
        String autor = inStr.nextLine();
        datos.add(new Libro(titol, autor));
        System.out.println("Se agrego con exito el libro.");
    }

    public static void mostrar(ArrayList<Libro> datos) {
        System.out.println("La lista de libros es: ");
        int i = 1;
        for (Libro d : datos) {
            System.out.println(i + ". " + d.getTitol() + "-" + d.getAutor());
            i++;
        }
        System.out.println("--------------------------------");
    }

    public static void eliminar(ArrayList<Libro> datos, Scanner in) {
        System.out.println("Indique el numero de libro que desea eliminar: ");
        int indice = in.nextInt();
        if (indice > 0 && indice <= datos.size()) {
            System.out.println("Se ha eliminado el libro " + indice + ".");
            datos.remove(indice - 1);
        } else {
            System.out.println("El indice del libro no existe.");
        }
    }
}
