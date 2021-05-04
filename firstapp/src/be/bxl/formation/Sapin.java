package be.bxl.formation;

import java.util.Scanner;

public class Sapin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entre un nombre entre 5 et 30");
        int ligne = Integer.parseInt(sc.nextLine());
        System.out.println("debut");
int espace = ligne-2;
int nbetoile = 1;
        while(espace>=0){

        for (int i=0;i<espace;i++) {
            System.out.print(" ");
        }
            for (int j=0;j<nbetoile;j++) {
                System.out.print("*");
            }
            System.out.println("");
            nbetoile=nbetoile+2;
            espace=espace-1;
    }

        /////
        int lgtrong =0; int hauteurtronc =0;

        if (nbetoile<=7) {
                lgtrong=1;espace = ligne-2;}
        else {
                lgtrong=2;espace = ligne-3;}
        if (nbetoile<=10) {
            hauteurtronc=1;}
        else {
            hauteurtronc=2;}

        espace = ligne-2;
        for (int i=0;i<hauteurtronc;i++) {
            System.out.print(" ");
        }
        for (int j=0;j<lgtrong;j++) {
            System.out.print("#");
        }
        System.out.println("");
        nbetoile=nbetoile+2;


        System.out.println(hauteurtronc + " " + lgtrong);





        espace = ligne-2;
        for (int i=0;i<espace;i++) {
            System.out.print(" ");
        }

            System.out.println("#");
    }}

