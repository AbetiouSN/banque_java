package banque1;

import java.util.Vector;

public class Banque {
    private Vector<Compte> comptes = new Vector<>();

    public boolean creerCompte(int type, double solde, Personne personne) {
        if (type == 0) {
            comptes.add(new Compte(personne, solde));
        } else if (type == 1) {
            comptes.add(new CompteCredit(personne, solde));
        } else if (type == 2) {
            comptes.add(new ComptePlacement(personne, solde));
        } else {
            return false;
        }
        return true;
    }

    public boolean supprimerCompte(int numero) {
        for (Compte compte : comptes) {
            if (compte.getNumero() == numero) {
                comptes.remove(compte);
                return true;
            }
        }
        return false;
    }

    public Compte getCompte(int numero) {
        for (Compte compte : comptes) {
            if (compte.getNumero() == numero) {
                return compte;
            }
        }
        return null;
    }

    public Vector<Compte> rechercheCompte(String nom) {
        Vector<Compte> result = new Vector<>();
        for (Compte compte : comptes) {
            if (compte.getTitulaire().getNom().equals(nom)) {
                result.add(compte);
            }
        }
        return result;
    }

    public void afficherSolde(String nom) {
        System.out.println("Comptes de " + nom + ":");
        for (Compte compte : comptes) {
            if (compte.getTitulaire().getNom().equals(nom)) {
                System.out.println("Numéro de compte : " + compte.getNumero() + ", Solde : " + compte.getSolde());
            }
        }
    }
    public void afficher() {
        System.out.println("liste de Comptes  :");
        for (Compte compte : comptes) {
                System.out.println("Mr . : "
                        + compte.getTitulaire().getPrenom()+" "
                        +compte.getTitulaire().getNom() +" Numéro de compte : "
                        + compte.getNumero() + ", Solde : " + compte.getSolde());
        }
    }
}

