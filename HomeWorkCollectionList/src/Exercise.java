import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Exercise {

    public static List<String> editedNames(ArrayList<String> names){
        List<String> correctNames = names;
        Iterator<String> iterator = correctNames.iterator();
        while (iterator.hasNext()){
            String name = iterator.next();
            if(name.length()==4)
                iterator.remove();
        }
        return correctNames;
    }

    public static List<String> editedNames2(ArrayList<String> names){
        List<String> correctNames = new ArrayList<>();
        for (String name:names) {if (name.length()!=4)
                 correctNames.add(name);
        }
        return correctNames;
    }


    public static List<String> checkTwoArraysNumbers(ArrayList<Integer> num1, ArrayList<Integer> num2){
        List<String> res = new ArrayList<>();
        for (int i = 0; i <num1.size() ; i++) {
            res.add(num1.get(i)==num2.get(i)? "yes":"no");
        }
        return res;
    }

    public static boolean isListCycleOfAnother(List<String> list1, List<String> list2) {
        if(list1.size()!= list2.size())
            return false;
        for (int i = 0; i <list1.size() ; i++) {
            Collections.rotate(list1,1);
            if(list1.equals(list2))
                return true;
        }
        return false;
    }

    public static List<Integer> reverseList(List<Integer> numbers){
        List<Integer> reverseNumbers = new ArrayList<>(numbers);
        Collections.reverse(reverseNumbers);
        return reverseNumbers;
    }

    public static List<String> mergeLists(List<String> list1, List<String> list2 ){
        List<String> mergedList = new ArrayList<>(list1);
        mergedList.addAll(list2);
        return mergedList;
    }

    public static List<Integer> removeHigherThanNumber(List<Integer> listNumbers, int number){
        List<Integer> editList = listNumbers;
        Iterator iterator = editList.iterator();
        while (iterator.hasNext()){
            int current = (int)iterator.next();
            if(current>number)
                iterator.remove();
        }
        return editList;
    }

    public static List<Integer> getSmallerNumbers(List<Integer> numbers, int number) {
        List<Integer> newList = new ArrayList<>();
        for (int num : numbers) {
            if (num <= number)
                newList.add(num);
        }
        return newList;
    }



    public static ArrayList<Integer> cutAfterLimit(ArrayList<Integer> digits,int limit) {
        ArrayList<Integer> output = new ArrayList<>();

            for (int i = 0;i < digits.size(); i++) {
                if (digits.get(i) <= limit) {
                    output.add(digits.get(i));
                }
            }
            return output;

    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 1,2,3,10,20,30);

        List<Integer> numbers2 = removedSmallNumber(numbers, 10);
        System.out.println(numbers.get(5));
        System.out.println(numbers2);

        /*for (int i = 0; i <numbers.size() ; i++) {
            Integer num = numbers.get(i);
            if(num>10){
                numbers.remove(i);
                i--;
            }
        }*/


        //System.out.println(numbers);
    }

    public static List<Integer> removedSmallNumber(List<Integer> numbers, int num){
        List<Integer> cutList = new ArrayList<>(numbers);
        Iterator iterator = cutList.iterator();
        while(iterator.hasNext()){
            int current = (int)iterator.next();
            if(current>num){
                iterator.remove();
            }
        }
        return cutList;
    }





}


