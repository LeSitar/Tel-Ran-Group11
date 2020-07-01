import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("hello");
        //list.add(12);

        Object text = list.get(0);
        List<String> list1 = new ArrayList<>();

    }

    public static double getSum(List accounts) {
        double sum = 0;
        for (int i = 0; i < accounts.size(); i++) {
            Object account = accounts.get(i);
            if (account instanceof Account) {
                sum += ((Account) account).getAmount();
            }
        }
        return sum;
    }

    public static double getSum2(List<Account> accounts){
        double sum = 0;
        for (Account account:accounts) {
            sum+=account.getAmount();
        }
        return sum;
    }

    public static <T> List<T> reverseList(List<T> list){
        List<T> reverseList = new ArrayList<T>(list);
        Collections.reverse(reverseList);
        return reverseList;
    }
}
