package JavaInterview;

import org.testng.annotations.Test;

import java.util.Scanner;

public class PositionAlphabet {

    public static void main(String[] args ){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the Character:");
        char givenchar=input.next().charAt(0);
        char givencharLowecase=Character.toLowerCase(givenchar);
        /*   ACSII-97 ->a 65- A  lowecase subtract -96,uppercase -64*/
        int asciivalue=givencharLowecase;
        int position=asciivalue-96;
        System.out.println("Position of alphabet: "+position);
    }
}
