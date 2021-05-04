package be.bxl.formation;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.Scanner;

public class exTrouverLaValeur {
    public static void main(String[] args) {
        int tableau[] = {1, 2, 3, 4, 5, 3, 7, 8, 9, 10};
        final Integer maxTableau = 10;
        int indice = 0;
        int valeurATrouver = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> position = new ArrayList<Integer>();

        System.out.println("trouve un element ");
        valeurATrouver= Integer.parseInt(sc.nextLine());


        for (int i = 0; i < maxTableau; i++) {
            if (tableau[i] == valeurATrouver) {
                position.add(i);
            }
        }
        switch (position.size()) {
            case 0:
                System.out.println("Element pas trouve");
                break;
            case 1:
                System.out.println("j'ai trouve l'element en position " + position.get(0));
                break;
            default:
            System.out.println("j'ai trouve l'element dans plusieurs position");
            for (int i = 0; i < position.size(); i++) {
                System.out.print(" en position " + position.get(i));
            }
        }
    }
}




