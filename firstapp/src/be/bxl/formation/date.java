

package be.bxl.formation;
import java.util.Scanner;


public class date {
    public static void main(String[] args) {

        boolean moisvalide = false;
        int jour=0, mois,annee=0;
        Scanner sc = new Scanner(System.in);

        while(jour>31 || jour<=0){

            System.out.println("Donne un jour");
            jour = Integer.parseInt(sc.nextLine());
        }

        while (moisvalide == false){
        System.out.println("Donne un mois");
        mois = Integer.parseInt(sc.nextLine());

        switch (mois) {

            case 2 :if (jour>28){
                System.out.println("En fevrier il n'y a que 28 jours");
                }
                else { moisvalide =true;}
                break;

            case 4,6,9,11 : if (jour>30){
                System.out.println("En"+ mois + " il n'y a que 30 jours");
                 } else { moisvalide =true;}
                break;
            default : moisvalide =true;
        }
        }

        while(annee>2022 || annee<=0) {
            System.out.println("Donne une annee");
            annee = Integer.parseInt(sc.nextLine());
        }


    }
}
