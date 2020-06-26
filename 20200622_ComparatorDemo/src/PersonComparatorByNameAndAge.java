import java.util.Comparator;

public class PersonComparatorByNameAndAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int res = o1.name.compareTo(o2.name);
        if(res==0){
            res = o1.age==o2.age ? 0: o1.age>o2.age? 1:-1;
        }
        return res;
    }
}
