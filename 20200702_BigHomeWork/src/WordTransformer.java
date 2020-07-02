import java.util.function.Function;
import java.util.function.Predicate;

public class WordTransformer {

    public static void main(String[] args) {
        String input = "aaa Iofkls lll KDgh";
        Predicate<String> p = string -> string.length()==3;
        Function<String, String> f = String::toUpperCase;
        String transformString = transform(input,p,f);
        System.out.println(transformString);
        System.out.println(transform(input,s ->s.length()==4 ,String::toLowerCase));
    }



    // "aaa Iofkls lll KDKL"
    public static String transform(String input, Predicate<String> p, Function<String,String>f){
        String[] words = input.split(" ");
        for (int i = 0; i <words.length ; i++) {
            if(p.test(words[i])){
                words[i] = f.apply(words[i]);
            }
        }
        return String.join(" ",words);
    }
}
