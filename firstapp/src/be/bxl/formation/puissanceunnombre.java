package be.bxl.formation;

import java.util.Scanner;

public class puissanceunnombre {

    public static void main(String[] args)
    {
        int nombre, puissance=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Donne un nombre");
        nombre = Integer.parseInt(sc.nextLine());
        System.out.println("Donne un puissance");
        puissance = Integer.parseInt(sc.nextLine());

int resultat = nombre;

        for(int i=0;i<=puissance;i++) {

            resultat = resultat * nombre;
            if (i==0) {resultat=1;};

            System.out.println(nombre + "puissance" + i + " =" + resultat);
            }
        }

    }
