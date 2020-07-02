import java.util.*;

public class Anagram {
    public static String[] voc ={"ivan", "vani", "anna", "naan", "piotr", "navi"};
    public static Map<String, List<String>> map = new HashMap<>();

    // {"ivan", "vani", "anna", "naan", "piotr", "navi"} // a i n v


    public static Map<String, List<String>> getMap() {
        return map;
    }

    public static String sortWord(String word){
        char[] chars= word.toCharArray();
        Arrays.sort(chars);
        return Arrays.toString(chars);
    }

    public static void createMap(){
        for(String v:voc){
            String key = sortWord(v);
            if(!map.containsKey(key)){
                List<String> anagrams = new ArrayList<>();
                anagrams.add(v);
                map.put(key,anagrams);
            }else{
                List<String> anagrams = map.get(key);
                anagrams.add(v);
            }
        }
    }

    public static List<String> getAnagrams(String word){
        String key = sortWord(word);
        return map.get(key);
    }


    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        Anagram.createMap();
        System.out.println(Anagram.map);
        List<String> ivan = getAnagrams("anna");

        System.out.println(ivan);

    }


}
