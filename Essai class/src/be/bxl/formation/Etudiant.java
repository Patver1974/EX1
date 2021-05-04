package be.bxl.formation;

import java.time.LocalDate;

public class Etudiant
{

    public String nom;
    public String prenom;
    public LocalDate DateDeNaissane;
    public Section section;

    public String seDecrire() {
        String desc = String.format("%s %s- section - ", nom, prenom, section.nom);
        return desc;


}


}
