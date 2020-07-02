import java.lang.reflect.Array;
import java.util.*;

public class MapExercise {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("a", "Hello, ");
        map.put("b", "world!");
        map.put("c", "!!!!");
        System.out.println(map);
        System.out.println(getNewMapWithNewKey(map, "d", "b"));

        String[] strings = {"a","b","a", "s", "d", "b"};
        System.out.println(returnMapKeys(strings));

        String [] names = {"Ivan", "Katya", "Olga", "Ivan", "Anna", "Kirill","Anna","Anna" };
        Map<String, Integer> namesMap = wordsCount(names);
        System.out.println("This name repeat " + getWordsCount(namesMap,"Egor") + " times");


    }


    public static Map<String,String> getNewMapWithNewKey(Map<String,String> map, String a, String b){
        Map<String,String> newMap = new HashMap<>(map);

        if(newMap.containsKey(a)&&newMap.containsKey(b)){
            newMap.put((a+b), newMap.get(a) + newMap.get(b));
        }
        return newMap;
    }

    public static Map<String,Boolean> returnMapKeys(String[] letters) {
        Map<String, Boolean> res = new HashMap<>();
        int count;
        List<String> list = Arrays.asList(letters);
        for (String s : letters) {
            count = Collections.frequency(list, s);
            res.put(s,count>1);
        }
        return res;
    }

    public static Map<String,Integer> wordsCount(String[] names){
        Map<String,Integer> map = new HashMap<>();
        for (String s:names) {
            if(!map.containsKey(s)){
                map.put(s,1);
            }else {
                map.put(s,map.get(s)+1);
            }
        }
        return map;
    }



    public static int getWordsCount(Map<String,Integer> map,String name){
        if(!map.containsKey(name)){
            return 0;
        }
        return map.get(name);
    }






}
