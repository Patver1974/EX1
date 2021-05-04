package be.bxl.formation;

import java.util.Scanner;

public class factorielle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculer le factorielle d'un nombre ");

        System.out.println("entre la factorielle");
        int factorielle = Integer.parseInt(sc.nextLine());
        int resultat=1;
        for (int i =1;i<=factorielle;i++){
            resultat = resultat * i;
            System.out.println("nombre est "+ resultat);
        }
    }

}
