package colecciones;

/**
 *
 * @author Luis
 */
public class Libro {

    private String titol;
    private String autor;

    public Libro() {
    }

    public Libro(String titol, String autor) {
        this.titol = titol;
        this.autor = autor;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
