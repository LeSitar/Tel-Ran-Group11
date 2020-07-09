package de.telran.game.state;

public class LevelEasy extends AbstractGameState {

    public LevelEasy(int numberOfTries) {
        super(numberOfTries);
    }

    @Override
    public void playerGuessedWordAndWon() {
        points += 300;
        playerWon = true;
    }
}