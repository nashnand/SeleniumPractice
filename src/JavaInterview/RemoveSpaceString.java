package JavaInterview;

public class RemoveSpaceString {
    public static void main(String[] args) {

        String mystring = "  i love automation  ";
        System.out.println(mystring);
        String newstring =mystring.trim();
        System.out.println(newstring);
        String Regexstring=mystring.replaceAll("^[ \t]+|[\t ]+$","");
        System.out.println(Regexstring);
    }
}
