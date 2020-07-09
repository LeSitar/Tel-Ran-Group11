package de.telran.game.input;

public interface gameReader {
    char askLetter(String string);
    boolean askLetterOrWord(String string, Character character);
    String askWord(String string);

}
