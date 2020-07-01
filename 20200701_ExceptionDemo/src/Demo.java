import exception.TooLongStringLengthException;
import exception.TooShortStringLengthException;

public class Demo {

    public static void main(String[] args) throws Exception{
       /* DivisionResult result = div(11,5);

        if(result.isSuccess){
            System.out.println(result.result);
        }
        else{
            System.out.println("error, division by zero");
        }*/

       String input = "jgfhjkl";
       try{
       String resulString = processString(input);
           System.out.println("The string is processed: " + resulString);}
       catch (TooLongStringLengthException ex) {
           System.out.println(ex.getMessage() + " \n" + input + " too long");
       }
       catch (TooShortStringLengthException ex1){
           System.out.println(ex1.getMessage() + " you input: " + input + " too short");
       }

        System.out.println("The programm is finished");
    }

    public static class DivisionResult{
        boolean isSuccess;
        double result;

        public DivisionResult(boolean isSuccess, double result) {
            this.isSuccess = isSuccess;
            this.result = result;
        }
    }
    //division a/b

    public static DivisionResult div(int a, int b){
        if(b==0){
            return new DivisionResult(false,0);
        }
        return new DivisionResult(true, (double)a/b);
    }

    //"abs" -> "ABC"
    //"abnsd" -> exception

    public static String processString(String str) throws Exception {
        if(str.length()>3)
            throw new TooLongStringLengthException("Length is too long " + str.length()) ;
        else if(str.length()<3)
            throw new TooShortStringLengthException("Length is too short " + str.length());
        else
            return str.toUpperCase();
    }


}
