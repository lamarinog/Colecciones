package colecciones;

/**
 *
 * @author Luis
 */
public class Pelicula {

    private String titulo;
    private String director;
    private String anioEstreno;
    private String genero;
    private int duracion;

    public Pelicula(String titulo, String director, String anioEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(String anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", anioEstreno=" + anioEstreno + ", genero=" + genero + ", duracion=" + duracion + '}';
    }
    
}
