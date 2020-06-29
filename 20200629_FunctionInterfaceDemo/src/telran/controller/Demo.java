package telran.controller;

import telran.data.Faxable;
import telran.data.LengthCounter;
import telran.data.Person;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo {

    public static void main(String[] args) {
       /* Faxable fax = new Faxable() {
            @Override
            public void sendFax(String message) {
                System.out.println("test " + message);
            }

            @Override
            public String receiveFax() {
                return "test@";
            }
        };*/

        LengthCounter lc = new LengthCounter() {
            private String str = "42";

            @Override
            public int count(String s) {
                System.out.println(s);
                return s.length() + str.length();
            }
        };

        LengthCounter lc2 = (String string) -> {
            System.out.println(string);
            return string.length();
        };

        int nameCount = lc2.count("Vasya");

        System.out.println(lc2.count("Hello!"));

        Comparator<Integer> c = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> c1 = (o1,o2)->o1.compareTo(o2);

        System.out.println(c1.compare(15,10));

        //"zzzz" > "aa"
       //"aa" < "zzzz"

        Comparator<String> c2 = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.valueOf(o1.length()).compareTo(Integer.valueOf(o2.length()));
            }
        };

        Comparator<String> c3 = (o1,o2)-> Integer.valueOf(o1.length()).compareTo(o2.length());

        Comparator<Person> c4 = (p1,p2) -> Integer.valueOf(p1.getAge()).compareTo(p2.getAge());

        Predicate p = new Predicate() {
            @Override
            public boolean test(Object o) {
                return false;
            }
        };


        Predicate<Integer> p1 = i -> i==2;

        System.out.println(p1.test(10));

        // "" -> false;
        //"dfgh" -> true;

        Predicate<String> p2 = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return string.length()>0;
            }
        };

        Predicate<String> p3 = s-> s.length()>0; // !=0 , !="", s.isEmpty

        Predicate<Person> p4 = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge()>21;
            }
        };

        Predicate<Person> p5 = person -> person.getAge()>21;

        Person person = new Person ("Vasya", 20);
        System.out.println("Person " + person.getName() + " " + p5.test(person));

        Function<String, Integer> f = new Function<String, Integer>() {

            @Override
            public Integer apply(String string) {
                return string.length();
            }
        };

        Function<String, Integer> f2 = s->s.length();

        // "asd" -> "ASD"

        Function<String,String> f3 = s->s.toUpperCase();

        System.out.println("! " + f3.apply("Hallo") + " !");

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String string) {

            }
        };

        Consumer<String> consumer1 = string -> System.out.println(string);


        Supplier<Integer> sup = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return 5;
            }
        };

        Supplier<Integer> sup2 = ()->10;

        Supplier<String> sup1 = ()-> "Solut!";
        sup1.get();
        System.out.println(sup1.get());

        //acs Dfg ggYYh jkl

    }






}
