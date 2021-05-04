package be.bxl.formation;

import java.util.ArrayList;
import java.util.Arrays;

public class CoursTableauArray {
    public static void main(String[] args) {
        //arraylist
        ArrayList<Integer> maliste = new ArrayList<>();
        //
        maliste.add(5);    // ajout index 0
        maliste.add(105);// ajout index 1
        maliste.add(22);// ajout index 2
        maliste.add(5);    // ajout index 0
        maliste.add(105);// ajout index 1
        maliste.add(22);// ajout index 2
        maliste.add(5);    // ajout index 0
        maliste.add(105);// ajout index 1
        maliste.add(22);// ajout index 2

        //ajout d'une positon
        maliste.add(1, 22);//ajout en index 1 et declale les autre
        //remplacer
        maliste.set(1, 5555);
        //.toArray -> transforme en tableau
        //maliste.toArray()
        //remove
        maliste.remove(5);// efface index 5
        maliste.remove((Integer) 22); // recherche et efface la valeur 22 La premiere valeur
        //maliste.
        //recuperer element
        int val = maliste.get(0);

        for (int element : maliste) {
            System.out.println(element + " > ");
        }
        System.out.println();


    }
}
