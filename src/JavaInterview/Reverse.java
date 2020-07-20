package JavaInterview;

import java.lang.*;
import java.io.*;
import java.util.*;

public class Reverse {


    public static void main(String args[])
    {StringBuffer Demo = new StringBuffer("Welcome");
    System.out.println(Demo.reverse());
    arrayreverse();
    }
    public static void arrayreverse() {
        int i = 0;
        String Str = "Testing";
        char[] StrArray = Str.toCharArray();
        int Len = (StrArray.length - 1);
        for (i = Len; i >= 0; i--) {
            System.out.println(StrArray[i]);
        }
     System.out.println(recurrsive(Str));
    }
    public static String recurrsive(String STRNG){
            String str=STRNG;
            int len= STRNG.length();
            if((null==str)|| len<=1){
                return str;
            }
          return recurrsive(str.substring(1))+str.charAt(0);
        }
    }

