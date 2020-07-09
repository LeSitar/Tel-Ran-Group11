package de.telran.game.output;

import de.telran.game.word.WordToGuess;

import java.util.Scanner;

public class ConsoleGameMessenger implements gameMessenger  {
    final Scanner scanner;

    public ConsoleGameMessenger() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public void informAboutLetter(String message, char letter) {      //Success/Mistake
        System.out.println(message + " " +letter + "!");
    }

    @Override
    public void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public void informPlayerAboutLose(String message, int points, String guessedWord) {
        System.out.println(message + guessedWord);
        System.out.println("You won " + points + " points");
    }

    @Override
    public void informUserGameStarts(WordToGuess wordToGuess, String message) {
        System.out.println(message);
        System.out.println(wordToGuess.getWordWithStars());
        System.out.println(wordToGuess.getDescription());

    }

    @Override
    public void informPlayerAboutWin(String message, int points) {
        System.out.println(message);
        System.out.println("You won " + points + " points");
    }


}