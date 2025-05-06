package colecciones;

import java.util.*;

/**
 *
 * @author Luis
 */
public class Calculadora {

    public static void main(String[] args) {
        ArrayList<Double> datos = new ArrayList<Double>();
        notas_iniciales(datos);
        menu(datos);
    }

    public static void notas_iniciales(ArrayList<Double> datos) {
        datos.add(7.5);
        datos.add(8.0);
        datos.add(6.3);
        datos.add(9.1);
    }

    public static void menu(ArrayList<Double> datos) {
        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        System.out.println("Bienvenidos al gestor de calculador de medias.");
        int opcion = 0;
        while (opcion != 4) {
            System.out.println("1. Mostrar notas.");
            System.out.println("2. Mostrar mediana.");
            System.out.println("3. Aniadir nota nueva.");
            System.out.println("4. Salir.");
            System.out.println("Elige una opcion: ");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Se muestran las notas.");
                    for (Double d : datos) {
                        System.out.println(d);
                    }
                    break;
                case 2:
                    double mediana = 0;
                    for (Double d : datos) {
                        mediana += d;
                    }
                    System.out.println("La suma de las notas es: " + mediana);
                    System.out.println("La mediana de las notas es: " + mediana / datos.size());
                    break;
                case 3:
                    System.out.println("Aniadir una nota nueva: ");
                    datos.add(in.nextDouble());
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
}
