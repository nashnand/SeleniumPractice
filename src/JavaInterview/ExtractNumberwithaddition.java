package JavaInterview;

public class ExtractNumberwithaddition {
    public static void main(String[] args) {

        String mystring = "  hi 5 hi 5 little John has 5 banana  ";
        char[] mychar=mystring.toCharArray();
        int value=0;
        for (char iterate:mychar) {
            if(Character.isDigit(iterate)){
                value=value+Character.getNumericValue(iterate);
            }
        }
        System.out.println(value);

    }
}
