package be.bxl.formation;
import java.util.Scanner;



public class Exercice1 {

    public static void main(String[] args) {
        int annee;
        Scanner sc = new Scanner(System.in);
        System.out.println("Donne une année");
        String SaisirUneAnnee = sc.nextLine();
        annee = Integer.parseInt(SaisirUneAnnee);
        Boolean anneebi = false;
        if (annee % 2 == 0) {
            if (annee % 4 != 0) {

                anneebi = true;
            }
        }
        if (annee % 400 == 0) {
            anneebi = true;
        }
        if (anneebi == true)

        {
            System.out.println("c est une annee bi");
        }
        else
        {
            System.out.println("non c'est pas une annee bi");

        }
    }

}