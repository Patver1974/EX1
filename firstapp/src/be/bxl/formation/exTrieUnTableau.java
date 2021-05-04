package be.bxl.formation;

public class exTrieUnTableau {


 public static void main(String[] args) {
     int tableau[] = {6, 26, 3, 40, 5, 35, 7, 8, 9, 10}; int temp = 0;
     for (int i = 0; i < 10; i++) {
         for (int z = 0; z < 10; z++) {
             if (tableau[i] < tableau[z]) { temp = tableau[i]; tableau[i]=tableau[z]; tableau[z]=temp;}
         }
     }
     for (int z = 0; z < 10; z++) {
         System.out.println("tableau entree" + z + " = " + tableau[z] );
     }

     }
}