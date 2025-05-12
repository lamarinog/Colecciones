package colecciones;

import java.util.*;

/**
 *
 * @author Luis
 */
public class Peliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Pelicula> datos = new ArrayList<Pelicula>();
        menu(datos);
    }

    public static void menu(ArrayList<Pelicula> datos) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        System.out.println("Bienvenidos al gestor de peliculas.");
        int opcion = 0;
        while (opcion != 5) {
            System.out.println("1. Aniadir pelicula.");
            System.out.println("2. Mostrar pelicula.");
            System.out.println("3. Buscar pelicula por genero.");
            System.out.println("4. Eliminar pelicula por titulo.");
            System.out.println("5. Salir.");
            System.out.println("Elige una opcion: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    añadir(datos, inStr, in);
                    break;
                case 2:
                    mostrar(datos);
                    break;
                case 3:
                    buscar(datos, inStr);
                    break;
                case 4:
                    eliminar(datos, inStr);
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

    public static void añadir(ArrayList<Pelicula> datos, Scanner inStr, Scanner in) {
        System.out.println("Ingrese el titulo: ");
        String titol = inStr.nextLine();
        System.out.println("Ingrese el director: ");
        String director = inStr.nextLine();
        System.out.println("Ingrese el anio de estreno: ");
        String anio = inStr.nextLine();
        System.out.println("Ingrese el genero: ");
        String genero = inStr.nextLine();
        System.out.println("Ingrese la duracion: ");
        int duracion = in.nextInt();
        datos.add(new Pelicula(titol, director, anio, genero, duracion));
        System.out.println("Se agrego con exito la pelicula.");
    }

    public static void mostrar(ArrayList<Pelicula> datos) {
        System.out.println("La lista de peliculas es: ");
        for (Pelicula d : datos) {
            System.out.println(d.toString());
        }
        System.out.println("--------------------------------");
    }

    public static void eliminar(ArrayList<Pelicula> datos, Scanner inStr) {
        System.out.println("Indique el titulo de peliucla que desea eliminar: ");
        String titulo = inStr.nextLine();
        boolean borrar = false;
        Iterator<Pelicula> recorrer = datos.iterator();
        while (recorrer.hasNext()) {
            if (titulo.equalsIgnoreCase(recorrer.next().getTitulo())) {
                recorrer.remove();
                borrar = true;
                System.out.println("Se borro la pelicula");
            }
        }
        if (!borrar) {
            System.out.println("No se encontro la pelicula.");
        }
    }

    public static void buscar(ArrayList<Pelicula> datos, Scanner inStr) {
        System.out.println("Indique el genero de peliucla que desea buscar: ");
        String genero = inStr.nextLine();
        boolean encontrar = false;
        for (Pelicula d : datos) {
            if (genero.equalsIgnoreCase(d.getGenero())) {
                System.out.println(d.toString());
                encontrar = true;
            }
        }
        if (!encontrar) {
            System.out.println("No se encontro pelis con este genero.");
        }
    }
}
