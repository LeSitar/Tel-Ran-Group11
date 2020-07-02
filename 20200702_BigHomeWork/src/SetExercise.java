import java.util.*;

public class SetExercise {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ivan", "Piotr", "Ivan", "Anna", "Olga", "Anna");
        System.out.println(removeDuplicate(list));
        System.out.println(getDuplicateName(list));
    }

    public static List<String> getDuplicateName(List<String> list){
        Set<String> set = new HashSet<>();
        List<String> duplicateNames = new ArrayList<>();
        for (String s:list) {
            if(!set.add(s)){
                duplicateNames.add(s);
            }
        }
        return duplicateNames;
    }

    public static List<String> removeDuplicate(List<String> list){
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }

}
