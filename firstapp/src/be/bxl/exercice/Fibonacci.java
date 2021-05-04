package be.bxl.exercice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Fibonacci {
     public static void main(String[] args) {
         Integer nbr = 0;
         Integer resultat = 0;
         Scanner sc = new Scanner(System.in);

         System.out.println("donne un nombre");
        nbr = Integer.parseInt(sc.nextLine());


        resultat = calculFibonacci(nbr) ;

         System.out.println(resultat);
    }
    static Integer calculFibonacci(Integer nbr) {
        int resultat=0; double resultatd=0;
        switch (nbr){
            case 0 : resultatd =0;break;
            case 1 : resultatd = 1;break;
            default: resultat =  (int) ((nbr-1)*1.1618+((nbr-2)*1.1618));

        }
        //resultat =  (int) resultatd ;
        return resultat;
}


}
