package be.bxl.formation;

import be.bxl.formation.modele.Etudiant;
import be.bxl.formation.modele.Section;

public class Main {

    public static void main(String[] args) {
	Section s1=new Section();
	s1.nom ="android";
	s1.description="Formation en ligne";
	Section s2=new Section();
        s2.nom ="android2";
        s2.description="Formation presentiel";


        Etudiant e1= new Etudiant();
        e1.nom ="nom";
        e1.prenom ="prenom";
        e1.section=s1;
       // e1.changerDeSection(s1);
        e1.seDecrire();
        e1.nom ="1nom";
        e1.prenom ="2prenom";

        e1.changerDeSection(s2);
        e1.seDecrire();
        e1.cote=10;


    }
}
