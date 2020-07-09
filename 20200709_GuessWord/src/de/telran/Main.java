package de.telran;

import de.telran.game.Game;
import de.telran.game.state.*;

public class Main {


    public static void main(String[] args){

        GameState gameState = new LevelEasy(10);
        Game game = new Game(gameState);
        game.startNewGame();

    }

}
