public interface WordsChecker {
    boolean checkWord(String word);
    String transformWord(String word);

    default String newMethod(){
        return "test";
    }
}
