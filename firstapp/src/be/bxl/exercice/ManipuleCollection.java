package be.bxl.exercice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ManipuleCollection {
    public static void main(String[] args) {
        //     ArrayList<Integer> collection = new ArrayList<Integer>();

        //   collection = GenereCollectionAleatoire();

        //    collection = triCollection(collection);
        //    AfficherCollection(collection);

        Integer tableau[] = new Integer[9];
        Integer tableau2[] = new Integer[9];



        tableau = CreerTableau(tableau);
        tableau2 = TriTableau(tableau);
        AfficherTableau(tableau);
        AfficherTableau(tableau2);


    }

    private static void AfficherTableau(Integer[] tableau3) {
        for (int i = 0; i < 9; i++) {
            System.out.println(i + " " + tableau3[i]);

        }


    }

    private static Integer[] TriTableau(Integer[] tableau) {
        int temp = 0;
        Integer[] newtableau = Arrays.copyOf(tableau, tableau.length);// copy tableau
        for (int i = 0; i < 9; i++) {
            for (int z = 0; z < 9; z++) {
                if (newtableau[i] < newtableau[z]) {
                    temp = newtableau[i];
                    newtableau[i] = newtableau[z];
                    newtableau[z] = temp;
                }

            }
        }
        return newtableau;
    }


    private static Integer[] CreerTableau(Integer[] tableau) {
        int longeur = 9;
        Random rng = new Random();
        int nbelement = rng.nextInt(15);
        for (int i = 0; i < 9; i++) {
            tableau[i] = rng.nextInt(66);

        }

        return tableau;
    }


    private static void AfficherCollection(ArrayList<Integer> collAAficher) {
        System.out.println(collAAficher);
    }

    static ArrayList<Integer> GenereCollectionAleatoire() {
        ArrayList<Integer> collectiontemp = new ArrayList<Integer>();
        Random rng = new Random();
        int nbelement = rng.nextInt(15);

        for (int i = 0; i < nbelement; i++) {
            collectiontemp.add(rng.nextInt(66));

        }
        return collectiontemp;

    }

    private static ArrayList<Integer> triCollection(ArrayList<Integer> collection) {
        int nbrCollection = collection.size();
        Integer temp = 0;
        for (int i = 0; i < nbrCollection; i++) {
            for (int k = 0; k < nbrCollection; k++) {
                if (collection.get(k) > (collection.get(i))) {
                    temp = collection.get(k);
                    collection.set(k, collection.get(i));
                    collection.set(i, temp);
                }
            }
        }
        return collection;
    }
}

