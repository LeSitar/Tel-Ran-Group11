import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;

public class ExerciseTest {

    @Test
    public void testGetAddresses(){
        List<Person> persons = new ArrayList<>();
        persons = Arrays.asList(new Person("Vaysa", new Address("Ring", 12)),
                new Person("Anna", new Address("Squer", 4)));
        List<Address> expectedAddresses = Arrays.asList(new Address("Ring", 12),new Address("Squer", 4));
        List<Address> addresses = Person.getAddresses(persons);

        Assert.assertEquals(expectedAddresses, addresses);
        Assert.assertEquals(expectedAddresses.size(),addresses.size());
    }

    @Test
    public void testEditedNames(){
        List<String> names = new ArrayList<>();
        Collections.addAll(names,"Vasya", "Anna", "Petya", "Niko", "Katya");
        List<String> actualNames = Exercise.editedNames((ArrayList)names);
        List<String> expectedNames = Arrays.asList("Vasya","Petya","Katya");

        Assert.assertEquals(expectedNames, actualNames);
        Assert.assertEquals(expectedNames.size(), actualNames.size());
    }

    @Test
    public void testCheckTwoArraysNumbers(){
        ArrayList<Integer> numbersA = new ArrayList();
        Collections.addAll(numbersA, 1,4,8,9);
        ArrayList<Integer> numbersB = new ArrayList();
        Collections.addAll(numbersB,1,5,7,9);
        List<String> checkResult = Exercise.checkTwoArraysNumbers(numbersA,numbersB);
        List<String> expectedCheckResult = new ArrayList<>();
        Collections.addAll(expectedCheckResult, "yes","no","no","yes");
        Assert.assertEquals(expectedCheckResult, checkResult);
    }

    @Test
    public void testListCyclicTrue() {
        List<String> list1 = new LinkedList<>();
        Collections.addAll(list1, "aa", "bb", "cc", "dd");
        List<String> list2 = new LinkedList<>();
        Collections.addAll(list2,  "cc", "dd", "aa","bb");
        boolean actual = Exercise.isListCycleOfAnother(list1, list2);
        assertTrue(actual);
    }

    @Test
    public void testReversList(){
        List<Integer> numbers = new ArrayList<>();
        Collections.addAll(numbers, 3,4,5,6);
        List<Integer> actualNumbers = Exercise.reverseList(numbers);
        List<Integer> expectedNumbers = Arrays.asList(6,5,4,3);
        Assert.assertEquals(expectedNumbers,actualNumbers);
    }

    @Test
    public void testMergeLists(){
        List<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "aa","bb","cc");
        List<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "dd","ee");
        List<String> actualMergedList = Exercise.mergeLists(list1,list2);
        List<String> expectedMergedList = Arrays.asList("aa","bb","cc","dd","ee");
        Assert.assertEquals(expectedMergedList,actualMergedList);
    }

    @Test
    public void testEditNumbers(){
        List<Integer> numbers = new ArrayList();
        Collections.addAll(numbers, 1,3,5,2,4,7,8,3);
        List<Integer> actualCorrectNumbers = Exercise.removeHigherThanNumber(numbers,5);
        List<Integer> expectedCorrectNumbers = Arrays.asList(1,3,5,2,4,3);
        Assert.assertEquals(expectedCorrectNumbers,actualCorrectNumbers);

    }

}
