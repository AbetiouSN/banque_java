package banque1;

public class ComptePlacement extends CompteCredit {
    public ComptePlacement(Personne titulaire, double montantInitial) {
        super(titulaire, montantInitial);
    }

    @Override
    public boolean debiter(double montant) {
        return false;
    }
}

