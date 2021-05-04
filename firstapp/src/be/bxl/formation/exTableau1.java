
package be.bxl.formation;

public class exTableau1 {



    public static void main(String[] args) {
        int [ ] tableau = new int[9];
        int value = 2;
        for (int i = 0; i < 9; i++) {
            tableau[i] = value;
            value =value*2;
        }
        for (int i = 0; i < 9; i++) {
            System.out.println("affiche tableau valeur"+ i +"=" + tableau[i]);

        }

    }}