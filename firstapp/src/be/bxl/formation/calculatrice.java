package be.bxl.formation;

import java.util.Scanner;

public class calculatrice {
    public static void main(String[] args) {
        String operateur;
        boolean zero = false;
        int chiffre1, chiffre2, resultat = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Donne un chiffre");
        chiffre1 = Integer.parseInt(sc.nextLine());
        System.out.println("Donne un deuxiele chiffre");
        chiffre2 = Integer.parseInt(sc.nextLine());
        System.out.println("Donne un operateur");
        operateur = sc.nextLine();
        switch (operateur) {

            case "+":
                resultat = chiffre1 + chiffre2;
                break;
            case "-":
                resultat = chiffre1 - chiffre2;
                break;
            case "/":
                if (chiffre2 == 0) {
                    zero = true;

                }
                else
                {
                resultat = chiffre1 / chiffre2;
                break;
                }

            case "*":
                resultat = chiffre1 * chiffre2;
                break;

            }
        if (zero = false) {
            System.out.println("erreur pas divisible par 0");
                }
            else{
                System.out.println("resultat:" + chiffre1 + operateur + chiffre2 + "=" + resultat);
            }
        }
    }


