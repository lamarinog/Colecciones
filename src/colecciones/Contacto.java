package colecciones;

/**
 *
 * @author Luis
 */
public class Contacto {

    private String nom;
    private String tel;

    public Contacto() {
    }

    public Contacto(String nom, String tel) {
        this.nom = nom;
        this.tel = tel;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}
