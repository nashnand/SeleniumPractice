package JavaInterview;

public class FindDuplicate {

    public static void main(String[] args) {
        int i, j;
        String Mystring = "Testedt";
        char[] String = Mystring.toUpperCase().toCharArray();
        for (i = 0; i < Mystring.length(); i++) {
            int Count = 0; /*Declaring inside else to get this resetted after everyloop.Also as 1 since each character will encounter atleast once*/
            for (j = i + 1; j < Mystring.length(); j++) {
                if (String[i] == String[j] && String[i] != '*') {
                    Count = Count + 1;
                    String[j] = '*'; /*Setting the duplicate character as * to avoid checking again*/
                }
            }
            if (String[i] != '*' && Count > 0) {
                System.out.println("The Character " + String[i] + " Repeated " + Count + " times");
            }

        }
    }
}
