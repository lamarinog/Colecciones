package colecciones;

import java.util.*;

/**
 *
 * @author Blanca
 */
public class HashMapEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, Estudiante> alumnos = new HashMap<>();
        menu(alumnos);
    }

    public static void menu(HashMap<String, Estudiante> alumnos) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 7) {
            System.out.println("1. Aniadir estudiante.");
            System.out.println("2. Mostrar estudiantes.");
            System.out.println("3. Eliminar estudiante por id.");
            System.out.println("4. Eliminar estudiante por id.");
            System.out.println("5. Buscar estudiante por id.");
            System.out.println("6. Actualizar nota media del estudiante.");
            System.out.println("7. Salir.");
            System.out.println("Elige una opcion: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    añadir(alumnos, inStr, in);
                    break;
                case 2:
                    mostrar(alumnos);
                    break;
                case 3:
                    eliminarId(alumnos, inStr);
                    break;
                case 4:
                    eliminarNom(alumnos, inStr);
                    break;
                case 5:
                    buscar(alumnos, inStr);
                    break;
                case 6:
                    actualizar(alumnos, inStr, in);
                    break;
                case 7:
                    System.out.println("Finaliza el programa.");
                    break;
                default:
                    System.out.println("Introduce una opción correcta.");
                    break;
            }
        }
    }

    public static void añadir(HashMap<String, Estudiante> alumnos, Scanner inStr, Scanner in) {
        System.out.println("Ingrese el id del estudiante a añadir: ");
        String id = inStr.nextLine();
        if (!alumnos.containsKey(id)) {
            System.out.println("Ingrese el nombre del estudiante:");
            String nom = inStr.nextLine();
            System.out.println("Ingrese la edad del estudiante:");
            int edad = in.nextInt();
            System.out.println("Ingrese la nota media del estudiante:");
            double nota = in.nextDouble();
            alumnos.put(id, new Estudiante(nom, edad, nota));
            System.out.println("Se registra con exito el estudiante.");
        } else {
            System.out.println("El alumno ya existe.");
        }
    }

    public static void actualizar(HashMap<String, Estudiante> alumnos, Scanner inStr, Scanner in) {
        System.out.println("Ingrese el id del estudiante a actualizar la nota mediana: ");
        String id = inStr.nextLine();
        if (alumnos.containsKey(id)) {
            System.out.println("Ingrese la nueva nota media del estudiante:");
            double nota = in.nextDouble();
            alumnos.get(id).setMedia(nota);
            System.out.println("Se actualiza con exito la nota del estudiante.");
        } else {
            System.out.println("El alumno no existe.");
        }
    }

    public static void buscar(HashMap<String, Estudiante> alumnos, Scanner inStr) {
        System.out.println("Ingrese el id del estudiante a buscar: ");
        String id = inStr.nextLine();
        if (alumnos.containsKey(id)) {
            System.out.println(alumnos.get(id).toString());
        } else {
            System.out.println("No existe el estudiante.");
        }
    }

    public static void mostrar(HashMap<String, Estudiante> alumnos) {
        for (HashMap.Entry<String, Estudiante> d : alumnos.entrySet()) {
            System.out.println(d.getValue().toString());
        }
    }

    public static void eliminarId(HashMap<String, Estudiante> alumnos, Scanner inStr) {
        System.out.println("Ingrese el id del estudiante a eliminar: ");
        String id = inStr.nextLine();
        if (alumnos.containsKey(id)) {
            alumnos.remove(id);
            System.out.println("Se borra estudiante.");
        } else {
            System.out.println("No existe el estudiante.");
        }
    }

    public static void eliminarNom(HashMap<String, Estudiante> alumnos, Scanner inStr) {
        System.out.println("Ingrese el nom del estudiante a eliminar: ");
        String nom = inStr.nextLine();
        boolean borrar = false;
        Iterator<HashMap.Entry<String, Estudiante>> it = alumnos.entrySet().iterator();
        while (it.hasNext()) {
            HashMap.Entry<String, Estudiante> d = it.next();
            if (d.getValue().getNom().equalsIgnoreCase(nom)) {
                it.remove();
                borrar = true;
            }
        }
        if (!borrar) {
            System.out.println("No se encontro al estudiante con ese nombre.");
        }
    }
}
