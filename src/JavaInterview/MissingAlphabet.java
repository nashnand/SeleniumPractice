package JavaInterview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class MissingAlphabet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the characters");
        char[] givenvalue = input.next().toCharArray();
        String givenvalstring=String.valueOf(givenvalue).toLowerCase();
        String[] givenstrarray = givenvalstring.split("");

        String[] comparearray = ("abcdefghijklmnopqrstwxyz").split("");

        /*HashSet given = new HashSet(Arrays.asList(givenstrarray)); we can use this are below method to add*/
        HashSet givenset = new HashSet();
        for (String given:givenstrarray)
        {
        givenset.add(given);
        }

        HashSet compare = new HashSet(Arrays.asList(comparearray));
        compare.removeAll(givenset);
        System.out.println("Missing alphabet"+compare);

    }
}
