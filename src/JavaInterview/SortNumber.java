package JavaInterview;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class SortNumber {

    public static void main(String[] args) {
/*        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());*/
        int[] list = new int[]{1, 4, 3, 1, 2, 6};
        ArrayList<Integer> number = new ArrayList<Integer>();
        number.add(17);
        number.add(12);
        number.add(39);
        number.add(24);
        int i,j;
        for (i = 0; i<list.length ; i++) {
            for (j = i+1; j<list.length ; j++) {
                if (list[i] < list[j]) {
                    int Temp = 0;
                    Temp=list[i];
                    list[i]=list[j];
                    list[j]= Temp;

                }
            }
        }
        System.out.println(Arrays.toString(list));
        Collections.sort(number);
        Iterator iterator = number.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
