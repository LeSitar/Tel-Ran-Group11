package de.telran.game.word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class WordRepository {

    private static List<Word> words = Arrays.asList(
            new Word("apple", "it's a fruit "),
            new Word("scooter", "it's a transport"),
            new Word("cucumber", "it's a vegetable."),
            new Word("table", "it's a furniture"),
            new Word("cactus", "it's a plant" ));


    public static Word getRandomWord() {
        Random rnd = new Random();
        int index = rnd.nextInt(words.size());
        return words.get(index);
    }

}
