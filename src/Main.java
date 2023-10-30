import banque1.Banque;
import  banque1.Personne;
import banque1.Compte;
import banque1.CompteCredit;
import  banque1.ComptePlacement;

public class Main {
    public static void main(String[] args) {
        Personne p = new Personne("ABETIOU","Sofiane","1000","LEC346");
        Personne p1 = new Personne("TAMESLent","Hind","2005","LC5446");
        Personne p2 = new Personne("ABETIOU","Ahmed","1993","LEC996");
        Personne p3 = new Personne("TAMESLent","Siham","2002","LC7446");
        Compte c1 = new Compte(p,1000);
        Compte c2 = new Compte(p1,2000);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println("         ================================");
        c1.debiter(300);
        c2.debiter(600);
        c1.crediter(500);

        System.out.println(c1);
        System.out.println(c2);

        c2.virement(c1, 2000);
        System.out.println("         ================================");

        System.out.println(c1);
        System.out.println(c2);


        // banque
        Banque b = new Banque();
        b.creerCompte(0,2000,p2);
        b.creerCompte(0,12460,p3);
        b.creerCompte(0,55003,p);
        b.creerCompte(0,150948,p1);
        b.afficherSolde("TAMESLent");
        System.out.println("               ===================================              ");
        b.afficher();
    }
}
