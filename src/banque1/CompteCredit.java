package banque1;

public class CompteCredit extends Compte {
    private double tauxInteret;

    public CompteCredit(Personne titulaire, double soldeInitial) {
        super(titulaire, soldeInitial);
        tauxInteret = 0.05;  // Taux d'intérêt 5%
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public double calculerInterets() {
        if (this.getSolde() > 0) {
            return this.getSolde() * tauxInteret;
        }
        return 0;
    }
}
