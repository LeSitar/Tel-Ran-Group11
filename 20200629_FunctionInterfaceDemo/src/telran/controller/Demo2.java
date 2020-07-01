package telran.controller;

import telran.data.Person;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.*;

public class Demo2{
    public static void main(String[] args) {
        Person person1 = new Person("vasya", 25);
        Person person2 = new Person("anna", 24);
        int ageCompare = person1.compareTo(person2);

        Comparator<Person> ageComparator = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        };

        Comparator<Person> ageComp = (o1, o2) -> o1.getAge()-o2.getAge();

        //"asdc" -> true;
        //"rgf" -> false;
        //"a" -> false;
        //"ghjfdk"-> true;

        Predicate<String> p1 = s->s.length()%2==0;
        System.out.println(p1.test("ass"));

        LocalDate n = LocalDate.now();
        System.out.println(n);

        Function<String,Integer> f = Demo2::getLength;
        System.out.println(f.apply("hgjkdfldfhjlsds"));


        Supplier<LocalDate> sup1 = ()->LocalDate.now();
        Supplier<LocalDate> sup = LocalDate::now;

        Supplier<LocalDate> sup2 = ()->LocalDate.now().minusDays(1);

        System.out.println(sup2.get());

        Function<String, Integer> divide = Demo2::getHalfOfLength;

        doSomething(divide, "ghjsklslghsl");
        doSomething(Demo2::getHalfOfLength, "jhksghkshgkks");
        doSomething(s->s.length(), "jgkslgs;gjs;");

        Supplier<Integer> getAge = person1::getAge;
        Supplier<String> getName = person1::getName;
        System.out.println(getAge.get());

        Function<Person, Integer> getAge1 = Person::getAge;
        System.out.println(getAge1.apply(person2));

        BiFunction<String, Integer, Person> newPerson = Person::new;
        BiFunction<String, Integer, Person> newPerson1 = Person::new;
        BiFunction<String, Integer, Person> newPerson2 = Person::new;

        Supplier<Person> newPerson3 = Person::new;


        Person ivan = newPerson.apply("Petya", 30);
        Person katya = newPerson.apply("Katya",19);

        List<String> names = Arrays.asList("Ivan", "Anna", "Petya", "Vasya", "Olga");

        /*for (String name:names) {
            System.out.println(name);
        }

        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        names.forEach(System.out::println);*/


        Consumer<String> stringConsumer = System.out::println;
        names.stream().forEach(stringConsumer);

        System.out.println(names);


    }

    public static int getLength(String str){
        return str.length();
    }

    public static int getHalfOfLength(String s) {
        int l = s.length();
        System.out.println(l);
        return l / 2;
    }

    public static void doSomething(Function<String, Integer>f, String str){
        System.out.println(f.apply(str));
    }
}
