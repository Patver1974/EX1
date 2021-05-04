package be.bxl.formation.modele;

import java.time.LocalDate;

public class Etudiant {
    public String nom;
    public String prenom;
    public LocalDate dateDeNaissance;
    public Section section;
    public Integer cote;
    private String nomComplet(){
        return nom +" "+ prenom;
    }
    public void seDecrire(){
        System.out.println("son nom" + nomComplet());
        System.out.println("sa section " + section.nom +" "+ section.description);
    }
    public void changerDeSection(Section newSection){
        section.nom = newSection.nom;
        section.description = newSection.description;
    }
}
