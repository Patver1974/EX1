package be.bxl.cous;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("bonjour"); //contrl shit +-

//Pour voir les titres


       //         Shift f6 : change le nom du var dans tous le code



    // Site internet   http://www.jmdoudoux.fr/java/dej/index.htm
    //     https://docs.oracle.com/en/java/javase/16/docs/api/index.html
	//region Rappel Print
    /*
    System.out.print("Demo");  Print sans saut à la ligne
    System.out.println("Demo");     // Affichage avec un saut de ligne
    System.out.printf("Le nom est %s", name);   // Affichage avec un template
    Raccourci sout  System.out.println();
        */
    // endregion
    // region Rappel While
    /*
        System.out.println("Afficher les nombres de 0 à 10 - While");
        int nb = 0;         // Initialisation d'un compteur
        while (nb <= 10) {  // Verification de la condition
            System.out.printf("%s > ", nb);
            nb = nb + 1;    // Incrementation du compteur
        }
     */
    // endregion
    // region Rappel For
    /*

        System.out.println("Afficher les nombres de 0 à 10 - For");
        // Initialisation ; Condition ; Incrementation
            for(int i = 1; i <= 10; i++) {
                System.out.printf("%s > ", i);
            }
     */
        // endregion
    // region Rappel Tableau
    /*
    // Copie d'un tableau
        // Copie de tableau
        int[] tab1 = new int[] {5, 6, 10, 58,2};
        int[] tab2 = Arrays.copyOf(tab1, tab1.length);  // Alternative : tab1.clone();

      // - Déclaration d'un tableau et son initialisation
        // Vide
        int[] tableauEntier = new int[5];
        String[] tableauTexte = new String[5];
        // Pre-défini
        int[] tableauValeur = new int[] {42, 3, 13, -5, 10};


        //- Obtenir la taille d'un tableau
        int tailleTabEntier = tableauEntier.length;

        // - Valeur initial
        System.out.println("Les valeurs de base d'un tableau initialiser");
        System.out.println(" - Tableau d'entier");
        for (int i = 0; i < tableauEntier.length; i++) {
            int val = tableauEntier[i];
            System.out.print(val + " > ");
        }
        System.out.println();

        System.out.println(" - Tableau de String");
        for (int i = 0; i < tableauTexte.length; i++) {
            String val = tableauTexte[i];
            System.out.print(val + " > ");
        }
        System.out.println();

        System.out.println(" - Tableau de valeur pré-défini");
        for (int i = 0; i < tableauValeur.length; i++) {
            int val = tableauValeur[i];
            System.out.print(val + " > ");
        }
        System.out.println();


        // - Obtenir une valeur d'un tableau
        // On utilise l'operateur d'acces avec l'indice
        // L'indice vaut 0 jusqu'à taille - 1

        int[] tableau = new int[] {42, -5,  6, 13,  2};
        // Taille : 5 / Indice   :  0   1   2   3   4

        // Lecture d'une valeur
        // (Lecture la 1er valeur)
        int secondVal = tableau[1];
        System.out.println(secondVal);

        // Modification d'une valeur
        // (Modif la 3e valeur)
        tableau[2] = 7;


        // - Utilisation de la boucle foreach
        // Permet la lecture des valeurs
        System.out.println();
        for (int element: tableau ) {
            System.out.print(element + " > ");
        }
        System.out.println();
     */
        // endregion
    // region Rappel ForEach
        /*
        // - Utilisation de la boucle foreach
        // Permet la lecture des valeurs
        System.out.println();
        for (int element: tableau ) {
            System.out.print(element + " > ");
        }
        System.out.println();
     */
        // endregion
    //region Rappel ArrayList Tableau qui peux d'agrandir
    /*
           // -> ArrayList
        // Gain en flexibilité  /  Perte du typage -> Pas cool
        /*
        ArrayList maList = new ArrayList();
        maList.add(42);
        maList.add(3.14);
        maList.add("Toto");
        maList.add(new Scanner(System.in));





        // -> ArrayList typé (Best pratice)
        // Typage de la liste via des types "classe"
        ArrayList<Integer> maListEntier = new ArrayList<>();

        // - Interaction sur la liste
        // Ajout en dernier element
        maListEntier.add(5);    // Ajout en index 0
        maListEntier.add(42);   // Ajout en index 1
        maListEntier.add(10);   // Ajout en index 2
        maListEntier.add(100);  // Ajout en index 3
        maListEntier.add(42);   // Ajout en index 4
        maListEntier.add(10);   // Ajout en index 5
        maListEntier.add(13);   // Ajout en index 6

        // Ajout avec une position
        maListEntier.add(1, 22); // Ajout en index 1 et en décallant les index
        maListEntier.add(1, 10); // Idem

        // Remplacer une valeur
        maListEntier.set(0, 5555);

        // Retirer une valeur (le premiere trouvé)
        maListEntier.remove((Integer)10); //Attention -> Entier primitif (int) sera reprit comme l'index

        // Retirer un element sur base de l'index
        maListEntier.remove(0);

        // Retirer tout les elements sur base d'un "affirmation"
        maListEntier.removeIf(v -> v == 42); // Prédicat -> Sera vu durant le cours d'orienté objet ;)

        // - Obtenir la taille de la collection
        int taille = maListEntier.size();


        // - Lecture d'un element de la liste
        int valPremier = maListEntier.get(0);
        int valSecond = maListEntier.get(1);
        int valDernier = maListEntier.get(taille - 1);

        System.out.printf("Premier %s, Deuxieme %s, Dernier %s \n\n", valPremier, valSecond, valDernier);

        // - Affichage des valeurs
        for(int element : maListEntier) {
            System.out.print(element + " > ");
        }
        System.out.println();
        */
        //endregion
    //region Stack (Pile -> LIFO)
        /*
        Stack<String> pile = new Stack<>();

        // Ajout d'element
        pile.push("Riri");
        pile.push("Zaza");
        pile.push("Geo");

        System.out.println("Affichage : ");
        for (String name: pile) {
            System.out.print(name + " > ");
        }
        System.out.println();

        // Recuperation du dernier
        String last = pile.pop();
        System.out.println("Element recup : " + last);

        System.out.println("Affichage : ");
        for (String name: pile) {
            System.out.print(name + " > ");
        }
        System.out.println();

        // Voir le dernier element
        String vue = pile.peek();
        System.out.println("Element obtenu : " + vue);

        System.out.println("Affichage : ");
        for (String name: pile) {
            System.out.print(name + " > ");
        }
        System.out.println();

     */
        // endregion
    //region Queue (File -> FIFO)
        /*
        ArrayDeque<String> file =  new ArrayDeque<>();

        // On ajout des elements dans la file
        file.addLast("Fifi");
        file.addLast("Zaza");
        file.addLast("Daisy");
        file.addLast("Donald");
        file.addLast("Balthazar");
        file.addLast("Archibald");

        System.out.println("Affichage : ");
        for (String name: file) {
            System.out.print(name + " > ");
        }
        System.out.println();

        // On recupere les elements
        String premier = file.pollFirst();
        String deuxieme = file.pollFirst();
        String troisieme = file.pollFirst();

        System.out.printf("Les 3 premiers : %s %s %s \n", premier, deuxieme, troisieme);

        System.out.println("Affichage : ");
        for (String name: file) {
            System.out.print(name + " > ");
        }
        System.out.println();

         */
        //endregion
    //region Dico
        /*
        HashMap<String, String> dico = new HashMap<>();

        // Ajouter des elements
        dico.put("fidu", "Fifi !");
        dico.put("zava", "Zaza Vanderquack");
        dico.put("ridu", "Riri Duck");
        dico.put("nova", null);

        System.out.println("- Initial : ");
        for(Map.Entry<String, String> kvp  : dico.entrySet()) {

            String key = kvp.getKey();
            String value = kvp.getValue();

            System.out.println(key + " -> " + value);
        }
        System.out.println();

        // Remplacer une valeur (La clef doit être présente !)
        dico.replace("fidu", "Fifi Duck");
        dico.replace("nova", "J'ai une valeur mtn !");

        // Ajouter un element si la clef est absente
        dico.putIfAbsent("bapi", "Balthazar Picsou");
        dico.putIfAbsent("zava", "Mademoiselle Zaza V"); // Valeur déja existant -> Donc ignoré

        System.out.println("- Final : ");
        for(Map.Entry<String, String> kvp  : dico.entrySet()) {

            String key = kvp.getKey();
            String value = kvp.getValue();

            System.out.println(key + " -> " + value);
        }


        // Alternative avec une While => Utiliser plutot la boucle for ;)
        System.out.println("- Affichage avec une boucle while (non-conseillé) : ");
        Set<Map.Entry<String, String>> dicSet = dico.entrySet();
        Iterator<Map.Entry<String, String>> iterator =  dicSet.iterator();

        while(iterator.hasNext()) {
            Map.Entry<String, String> kvp = iterator.next();

            System.out.println(kvp.getKey() + " -> " + kvp.getValue());
        }
        */
        //endregion
    //region Regex
/*
        int number = 0;
        boolean isValide;
        Pattern inputValidator = Pattern.compile("^[0-9]+$");
        // Ma regex => Le texte tester doit contenir uniquement des chiffres et minimum 1 chiffre

        do {
            String inputText = sc.nextLine();

            Matcher matcher =  inputValidator.matcher(inputText);
            isValide = matcher.find();

            if(isValide) {
                number = Integer.parseInt(inputText);
                isValide = (number >= 0) && (number <=20);
            }

            if(!isValide) {
                System.out.print("Le nombre doit être un entier positif (entre 0 et 20).\n" +
                        "Veuillez entrer une nouvelle valeur : ");
            }
        }
             */
        //endregion
        // region fonction et sub
        /*
        static void direBonjour(String firstname, String lastname){
            System.out.printf("Bonjour %s  %s ", firstname, lastname.toUpperCase() );
        }
        // fonction

        static int reliseraddition(int val1, int val2){
            int resultal = val1 + val2;
            return resultal;

         */
        //endregion sub
        // region Compare deux String
        /*
String m1 = "Titi";
String m2 = "Tita";
    System.out.println(m1.comporeTo(m2); -> compare suivant le code ascii
    retourne chiffre postif ou chiffre negatif
    diffèrence entre le i et a de titi et tata. Le reste est egale compare par caractère.

         */
        //endregion sub

        //region tri ameliore

        for (int i = 0; i < nbArgument; i++) {
            for (int k = 0; k <nbArgument -1; k++) {

            }
        }
        //endregion tri ameliore

        }

    }
}
        //region tri ameliore

     public Personnnage (String premnom, String nm, int,pdv)

//endregion tri ameliore