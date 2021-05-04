package be.bxl.formation;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class exResulatEtudiant{

        public static void main(String[] args) {
            String nom = ""; Integer nbEtudiant=0;
            String prenom = "";
            String nomcomplet = "";
            Integer score = 0;
            ArrayList<String> listeNomPrenom = new ArrayList<String>();
            HashMap<String, Integer> bulletin = new HashMap<>();
            Scanner sc = new Scanner(System.in);
            String Quitter = "";

            do {

                System.out.println("Introduisez un nom");
                nom = sc.nextLine();
                System.out.println("Introduisez un prenom");
                prenom = sc.nextLine();
                System.out.println("Introduisez un score");
                score = Integer.parseInt(sc.nextLine());
                nomcomplet = nom + " " + prenom;
                listeNomPrenom.add(nomcomplet);
                bulletin.put(nomcomplet, score);
                System.out.println("Q pour quitter");
                Quitter = sc.nextLine();




            }    while (!(Quitter.equals("Q")));
            nbEtudiant = listeNomPrenom.size();
            Integer   sommeTotal =0;
            String premierEtudiant=""; Integer hauteNote =0;
            for (int i = 0; i < nbEtudiant; i++) {
                nomcomplet=listeNomPrenom.get(i);
                sommeTotal= bulletin.get(nomcomplet);

                if ( hauteNote < bulletin.get(nomcomplet)) {
                        hauteNote = bulletin.get(nomcomplet);
                    premierEtudiant = nomcomplet;
                }


            }

            System.out.println("La moyenne est de " + (sommeTotal/nbEtudiant));
            System.out.println("Le meilleur est  " + premierEtudiant);

        }
        }
