package de.telran.game;

import de.telran.game.input.ConsoleGameReader;
import de.telran.game.output.ConsoleGameMessenger;
import de.telran.game.state.GameState;
import de.telran.game.word.Word;
import de.telran.game.word.WordRepository;
import de.telran.game.word.WordToGuess;

public class Game {

    private final GameState gameState;
    private final ConsoleGameReader input = new ConsoleGameReader();
    private final ConsoleGameMessenger output = new ConsoleGameMessenger();

    private WordRepository wordRepository;
    private WordToGuess wordToGuess = WordToGuess.getWordToGuess();


    public Game(GameState gameState) {
        wordRepository = new WordRepository();
        this.gameState = gameState;
    }

    public void startNewGame(){
        output.printMessage("Hi, you are playing with class " + gameState.getClass().getSimpleName());
        output.informUserGameStarts(wordToGuess, "Try to guess a word");

        while (gameState.isGameOn()) {
            if (input.askLetterOrWord("Word (w) or letter(l)?", 'w'))
                sayLetter();
            else
                sayWord();
        }

    }

    /* try{
        String resulString = processString(input);
        System.out.println("The string is processed: " + resulString);}
       catch (TooLongStringLengthException ex) {
        System.out.println(ex.getMessage() + " \n" + input + " too long");
    }
*/
    private void sayWord() {
        String wordFromPlayer = input.askWord("Please input a word:");
        if (wordToGuess.getWord().equals(wordFromPlayer)) {
            gameState.playerGuessedWordAndWon();
            output.informPlayerAboutWin("Сongratulations!!!", gameState.getPoints());
        } else {
            gameState.playerLost();
            output.informPlayerAboutLose("You lost( ", gameState.getPoints(), wordToGuess.getWord());
        }
    }

    private void sayLetter() {
        char letterFromPlayer = input.askLetter("Please input a letter");
        if (wordToGuess.hasChar(letterFromPlayer)) {
            gameState.guessedLetter();
            wordToGuess.openLetter(letterFromPlayer);
            output.informAboutLetter("You guessed the letter! ", letterFromPlayer);
            //printNumberOfTriesAndPoints(gameState.getNumberOfTries(), gameState.getPoints());
            output.printMessage(wordToGuess.getWordWithStars());
            if (wordToGuess.checkIfGuessed()) {
                output.informPlayerAboutWin("Сongratulations!!!", gameState.getPoints());
                gameState.playerWon();
            }
        } else {
            gameState.guessedLetterWrong();
            output.informAboutLetter("My word hasn't such letter ( ", letterFromPlayer);
            printNumberOfTriesAndPoints(gameState.getNumberOfTries(), gameState.getPoints());
            output.printMessage(wordToGuess.getWordWithStars());
            if (gameState.getNumberOfTries() == 0) {
                gameState.playerLost();
                output.informPlayerAboutLose(wordToGuess.getWord(), gameState.getPoints(), wordToGuess.getWord());
            }
        }
    }

    private void printNumberOfTriesAndPoints(int numberOfTries, int points) {
        System.out.println("Your number of tries is " + numberOfTries);
        System.out.println("Your number of points is " + points);
    }
}
