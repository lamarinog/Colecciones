package colecciones;

import java.util.ArrayList;

/**
 *
 * @author Blanca
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Empleado> datos = new ArrayList<Empleado>(55);
        //datos.ensureCapacity(55); redimensiona el arraylist
        //datos.trimToSize(); //borra la memoria excedente
        Empleado emp = new Empleado();
        datos.add(emp);
        
        for (Empleado e:datos){
            e.toString();
        }
    }
    
}
