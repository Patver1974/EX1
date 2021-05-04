package be.bxl.formation;

import java.util.Stack;

public class CoursStackQueue {

    public static void main(String[] args) {

        Stack<String> pile = new Stack<>();
        pile.push("zzzz");
        pile.push("azer");
        pile.push("dddd");
        pile.push("rrirrrrrrr");
        pile.push("654");

        pile.push("rr5555555i");
        for (String name : pile) {
            System.out.println(name);
        }
        System.out.println(pile.pop()); //dernier element
        System.out.println();

        for (String name : pile) {
            System.out.println(name);
        }
        System.out.printf("les trois premier %s %s %s\n", pile.get(pile.size()-1),pile.get(pile.size()-1),pile.get(pile.size()-1));
    }

}




