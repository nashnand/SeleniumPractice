package JavaInterview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTraining {

    public static void main(String[] args){
        /*String MyString = "my country is Indiia 123$$!!";*/
        String MyString = "02";
        /*Only Spl character Excluding space*/
        /*Pattern P= Pattern.compile("[^a-z A-Z 0-9]");*/

        /*Small & Caps Character with numbers along with space*/
       /* Pattern P= Pattern.compile("[a-z A-Z 0-9]");*/

        /*Only matches Spaces*/
        /*Pattern P= Pattern.compile("\\s");*/

        /*Excluding Spaces everything else*/
        /*Pattern P= Pattern.compile("[\\S]");*/

        /*Characters & Numbers not include space and spl char*/
        /*Pattern P= Pattern.compile("\\w");*/

        /*only include space and spl char*/
        /*Pattern P= Pattern.compile("\\W");*/

        /*Only Numbers*/
        /*Pattern P= Pattern.compile("\\d");*/
        /*Excluding numbers*/
        /*Pattern P= Pattern.compile("\\D");*/

        /*Matches atleast one character with Asterix */
        /*Pattern P= Pattern.compile("c*");*/

        /*Matches one or more character with + */
        /*Pattern P= Pattern.compile("i+");*/

        /*Matches with limited number of character based on {} values*/
        /*Pattern P= Pattern.compile("i{1}");*/

        /*Matches one or more character along with spaces*/
        /*Pattern P= Pattern.compile("i?");*/

        Pattern P= Pattern.compile("[1-9]");
        Matcher M=P.matcher(MyString);
        while (M.find()){
            System.out.println("Match found-\""+ M.group()+ "\"at Position -"+M.start());
        }
    }
}
