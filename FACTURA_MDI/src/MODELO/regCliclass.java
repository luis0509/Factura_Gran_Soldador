
package MODELO;

public class regCliclass {
    int id;
    String nom;
    String apell;
    String ciu;
    int tel;

    public regCliclass() {
        
    }

    public regCliclass(int id, String nom, String apell, String ciu, int tel) {
        this.id = id;
        this.nom = nom;
        this.apell = apell;
        this.ciu = ciu;
        this.tel = tel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApell() {
        return apell;
    }

    public void setApell(String apell) {
        this.apell = apell;
    }

    public String getCiu() {
        return ciu;
    }

    public void setCiu(String ciu) {
        this.ciu = ciu;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "regCliclass{" + "id=" + id + ", nom=" + nom + ", apell=" + apell + ", ciu=" + ciu + ", tel=" + tel + '}';
    }
    
}
