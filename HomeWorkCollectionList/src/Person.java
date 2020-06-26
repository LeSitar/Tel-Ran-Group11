import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }


    public static List<Address> getAddresses(List<Person> persons){
        List<Address> addresses = new ArrayList<>();
        for (Person p:persons) {
            addresses.add(p.address);
        }
        return addresses;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    // яблоко, медведь, коттедж, река, компьютер ....
    //
    // String word = случайным образом выбранное слово из массива words
    // - - - - - -;
    //о
    //- - - о - о
    //а
    // такой буквы нет в нашем слове

}
