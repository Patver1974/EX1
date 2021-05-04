package be.bxl.formation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nombre = 0;
        System.out.println("Hello  "+ nombre);

        Scanner sc = new Scanner(System.in);

        System.out.println("Veuilllez entrer text");
        String saissieUser = sc.nextLine();

        System.out.println("Veuilllez entrer int");

        String inputNb = sc.nextLine();
        int nb1 = Integer.parseInt(inputNb);

        System.out.println("Veuilllez entrer double");
        double nb2=Double.parseDouble(sc.nextLine());

        System.out.println(saissieUser+nb1+nb2);

        // TODO faire des truc
        // FIXME un truc bug

    }
}
