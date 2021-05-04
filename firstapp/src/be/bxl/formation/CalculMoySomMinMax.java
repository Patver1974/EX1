package be.bxl.formation;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculMoySomMinMax
{
     public static void main(String[] args) {
         ArrayList<Integer> listeNombre = new ArrayList<Integer>();
         Integer nbelement = 0;
         Integer moy,somme,min,max =0;
         somme = 0;
         moy = 0;
         Scanner sc = new Scanner(System.in);



             System.out.println("donne le nombre d'element");
             nbelement = Integer.parseInt(sc.nextLine());

         for (int i = 1; i <=nbelement ; i++) {
             System.out.println("donne element " + i);
             listeNombre.add(Integer.parseInt(sc.nextLine()));
         }
         min = listeNombre.get(0);min = listeNombre.get(0);

         for (int i = 0; i <=listeNombre.size() -1; i++) {
             somme = somme + listeNombre.get(i);
             if (listeNombre.get(i)<min){min = listeNombre.get(i);}
             if (listeNombre.get(i)>max){max = listeNombre.get(i);}
         }
         moy = somme /listeNombre.size();

         System.out.println("donne le min"+ min);
         System.out.println("donne le max"+ max);
         System.out.println("donne le moy"+ moy);
         System.out.println("donne le somme"+ somme);
     }
    }

