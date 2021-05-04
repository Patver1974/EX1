package be.bxl.formation;
import be.bxl.formation.personnage.Personnage;
import be.bxl.formation.personnage.Ville;

public class Main {

    public static void main(String[] args) {
	Personnage p1 = new Personnage();
	Ville ville = new Ville();
	ville.nom="japone";
        System.out.println(p1.mettreForce(10));
        p1.SePresenter();
        p1.Frapper();
        p1.Trajet(ville);
        p1.Trajet(ville);
    }
}
