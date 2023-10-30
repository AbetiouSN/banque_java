package banque1;

public class Personne {
    private String nom,prenom,dat_nais,cin;

    public Personne(String nom, String prenom, String dat_nais, String cin) {
        this.nom = nom;
        this.prenom = prenom;
        this.dat_nais = dat_nais;
        this.cin = cin;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDat_nais() {
        return dat_nais;
    }

    public String getCin() {
        return cin;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dat_nais='" + dat_nais + '\'' +
                ", cin='" + cin + '\'' +
                '}';
    }
}
