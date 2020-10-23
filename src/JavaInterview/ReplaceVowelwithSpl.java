package JavaInterview;

public class ReplaceVowelwithSpl {

    public static void main(String[] args){

        String mystring="i love automation";
        String Replacestring=mystring.replaceAll("[aeiouAEIOU]","*");
        System.out.println(Replacestring);
    }
}
