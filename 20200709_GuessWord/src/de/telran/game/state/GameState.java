package de.telran.game.state;

public interface GameState {
    int getPoints();
    int getNumberOfTries();
    void playerGuessedWordAndWon();
    void guessedLetter();
    void guessedLetterWrong();
    boolean isGameOn();
    void playerWon();
    void playerLost();
}
