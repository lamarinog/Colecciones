package colecciones;

/**
 *
 * @author Blanca
 */
public class Estudiante {
    private String nom;
    private int edad;
    private double media;

    public Estudiante() {
    }

    public Estudiante(String nom, int edad, double media) {
        this.nom = nom;
        this.edad = edad;
        this.media = media;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
    
}
