package JavaInterview;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Fibonacci {

   public static void main(String[] args) {

       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(0);
       list.add(1);
       int Secondvalue=1,Firstvalue=0;
       /*logic Nexvalue=first+second
               First=second
               second=next
        */
       for (int i = 0; i < 10; i++) {
           int Nextvalue;
           Nextvalue=Firstvalue+Secondvalue;
           list.add(Nextvalue);
           Firstvalue=Secondvalue;
           Secondvalue=Nextvalue;

       }
       for (Integer i:list)
            {
                System.out.println(i);
            }
/*      ListIterator iterator=list.listIterator();
       while (iterator.hasNext()) {
           System.out.println(iterator.next());
       }*/

   }
}