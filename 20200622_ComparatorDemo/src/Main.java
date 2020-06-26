import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> listNumbers = Arrays.asList(5,7,8,1,3,4);
        List<String> listStrings = Arrays.asList("aa", "bb", "xx", "yy", "ab", "ya");


        System.out.println(listNumbers);
        System.out.println(listStrings);
        Collections.sort(listNumbers);
        Collections.sort(listStrings);
        System.out.println(listNumbers);
        System.out.println(listStrings);

        Person vasya = new Person("Vasya",25); //anna 19, anna 32, kolya 19, vasya 25
        Person anna = new Person("Anna",32);
        Person anna2 = new Person("Anna", 19);
        Person kolya = new Person("Kolya",19);
        Person kolya2 = new Person("Kolya",22);
        Person dima = new Person("Dima",19);

        kolya.compareTo(vasya);
        System.out.println(kolya.hashCode());
        System.out.println(kolya2.hashCode());

        System.out.println(kolya.equals(kolya2));
        System.out.println(kolya.compareTo(kolya2));

        List<Person> persons = Arrays.asList(vasya,anna,kolya2,dima,kolya,anna2);
        System.out.println(persons);
        /*Collections.sort(persons);
        System.out.println(persons);*/
        PersonComparatorByAge comparatorByAge = new PersonComparatorByAge();

        comparatorByAge.compare(kolya,vasya);

        List<Person> sortedPerson = new ArrayList<>(persons);
        Collections.sort(sortedPerson,comparatorByAge);
        System.out.println(persons);


        Collections.sort(persons, new PersonComparatorByNameAndAge());
        System.out.println(persons);




    }
}
