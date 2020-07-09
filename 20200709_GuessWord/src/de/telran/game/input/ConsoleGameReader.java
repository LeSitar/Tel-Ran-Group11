package de.telran.game.input;

import java.util.Scanner;

public class ConsoleGameReader implements gameReader {
    private final Scanner scanner;

    public ConsoleGameReader() {
        this.scanner = new Scanner(System.in);
    }

    public char askLetter(String string) {
        System.out.print(string);          // "Please input a letter:"
        return scanner.nextLine().toLowerCase().charAt(0);
    }

    public boolean askLetterOrWord(String string, Character character){  //"Word (w) or letter(l)?"
        System.out.print(string);
        return scanner.nextLine().toLowerCase().charAt(0) != character;  //'w'
    }

    public String askWord(String s) {     //"Please input a word:"
        System.out.print(s);
        return scanner.nextLine().toLowerCase();
    }
}