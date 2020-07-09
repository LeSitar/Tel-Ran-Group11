package de.telran.game.output;

import de.telran.game.word.WordToGuess;

public interface gameMessenger {
    void informAboutLetter(String message, char letter);  //Success/Mistake
    void printMessage(String message);
    void informPlayerAboutLose(String message, int points, String guessedWord);
    void informUserGameStarts(WordToGuess wordToGuess, String message);
    void informPlayerAboutWin(String message, int points);

}
