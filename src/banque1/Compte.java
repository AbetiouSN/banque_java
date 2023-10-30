package banque1;

public class Compte {
    private static int dernierNumero = 0;
    private int numero;
    private Personne titulaire;
    private double solde;
    private double decouvertMax;
    private double debitMax;

    public Compte(Personne titulaire, double soldeInitial) {
        this.numero = ++dernierNumero;
        this.titulaire = titulaire;
        this.solde = soldeInitial;
        this.decouvertMax = -800;  // Valeur par défaut pour le découvert maximal
        this.debitMax = 1000;      // Valeur par défaut pour le débit maximal
    }

    public int getNumero() {
        return numero;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

    public double getSolde() {
        return solde;
    }

    public double getDecouvertMax() {
        return decouvertMax;
    }

    public double getDebitMax() {
        return debitMax;
    }

    public boolean crediter(double montant) {
        if (montant > 0) {
            solde += montant;
            return true;
        }
        return false;
    }

    public boolean debiter(double montant) {
        if (montant > 0 && solde - montant >= decouvertMax && montant <= debitMax) {
            solde -= montant;
            return true;
        }
        return false;
    }
    public void virement(Compte compteDestinataire, double montant) {
        if (this.debiter(montant)) {
            compteDestinataire.crediter(montant);
        }
    }

    public boolean estADecouvert() {
        return solde < 0;
    }

    @Override
    public String toString() {
        return "Compte{" +'\''+
                "numero=" + numero +'\''+
                ", titulaire=" + titulaire +'\''+
                ", solde=" + solde +'\''+
                ", decouvertMax=" + decouvertMax +'\''+
                ", debitMax=" + debitMax +
                '}';
    }
}

