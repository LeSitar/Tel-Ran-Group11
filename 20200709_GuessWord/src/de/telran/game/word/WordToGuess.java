package de.telran.game.word;

import java.util.Arrays;

public class WordToGuess {

    private static Word guessWord = WordRepository.getRandomWord();
    private boolean[] guessed = new boolean[guessWord.getWord().length()];

    private WordToGuess(){};

    private static class GuessWordHolder{
        private static final WordToGuess WORD_TO_GUESS = new WordToGuess();
    }

    public static WordToGuess getWordToGuess(){
        return GuessWordHolder.WORD_TO_GUESS;
    }


    public String getWordWithStars() {
        StringBuilder wordWithStars = new StringBuilder();
        for (int i = 0; i < guessWord.getWord().length(); i++) {
            if (guessed[i]) {
                wordWithStars.append(guessWord.getWord().charAt(i));
            } else {
                wordWithStars.append("*");
            }
        }
        return wordWithStars.toString();
    }

    public boolean hasChar(char ch) {
        for (char currentChar: guessWord.getWord().toCharArray()) {
            if (ch == currentChar)
                return true;
        }
        return false;
    }

    public void openLetter(char ch) {
        for (int i = 0; i < guessWord.getWord().length(); i++) {
            if (ch == guessWord.getWord().charAt(i)) {
                guessed[i] = true;
            }
        }
    }

    public boolean openWord(String word) {
        if (this.getWord().equals(word)) {
            for (int i = 0; i < guessed.length; i++) {
                guessed[i] = true;
            }
            return true;
        }
        return false;
    }

    public String getWord() {
        return guessWord.getWord();
    }

    public String getDescription() {
        return guessWord.getDescription();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WordToGuess)) return false;

        WordToGuess that = (WordToGuess) o;

        return Arrays.equals(guessed, that.guessed);

    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(guessed);
    }

    @Override
    public String toString() {
        return "WordToGuess: " + guessWord.getWord() +
                " (" + guessWord.getDescription() +
                " )";
    }

    public boolean checkIfGuessed() {
        for (boolean b: guessed) {
            if (!b) return false;
        }
        return true;
    }
}
