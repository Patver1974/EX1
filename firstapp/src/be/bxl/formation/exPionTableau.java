package be.bxl.formation;

import javax.swing.*;
import java.util.Scanner;
import java.util.regex.*;

public class exPionTableau {
    public static void main(String[] args) {

        String[] Tableau = {"-", "-", "-", "-", "x", "-", "-", "-", "-", "-"};
        int pion = 4;
        String Mvt = "";
        Scanner sc = new Scanner(System.in);
        Boolean Quitter = false;

        do {
            do {
                System.out.println("Donne le prochain mouvement G gauche D droite Q quitter");
                Mvt = sc.nextLine();

                if (Mvt == "G" || Mvt == "D" || Mvt == "Q") {Quitter = true;}


            } while (Quitter = false);
            Quitter=false;

            switch (Mvt) {
                case "G":
                    if (pion != 0) {
                        Tableau[pion] = "-";
                        pion = pion - 1;
                        Tableau[pion] = "x";
                    } else {
                        System.out.println("Impossible d'aller a gauche");
                    }
                    break;
                case "D":
                    if (pion != 9) {

                        Tableau[pion] = "-";
                        pion = pion + 1;
                        Tableau[pion] = "x";
                    } else {
                        System.out.println("Impossible d'aller a droite");
                    }
                    break;
                case "Q":
                    Quitter = true;
            }

//Affichage
            for (int i = 0; i < 10; i++) {
                System.out.print(Tableau[i]);
            }

        } while (Quitter == false);


    }


}
