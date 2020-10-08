package JavaInterview;

import java.util.ArrayList;
import java.util.Scanner;
/*[12 10 9 14 12 17]*/
public class smallestnumber {
    static Integer smallnumber=Integer.MAX_VALUE;

    public static void main(String[] args){


        System.out.println("Enter the Array Size to be sorted");
        Scanner Arraylen=new Scanner(System.in);
        int noOfvals = Arraylen.nextInt();

        System.out.println("Enter the "+noOfvals+" Array item in list");

        ArrayList <Integer> AList = new ArrayList<Integer>();
        for (int j=0;j<noOfvals;j++){
            Scanner inputlist=new Scanner(System.in);
            inputlist.hasNext();
            AList.add(inputlist.nextInt());
            }

        for(int i =0;i<AList.size(); i++)
        {
            if(AList.get(i) < smallnumber){
                smallnumber=AList.get(i);
            }

        }
        System.out.println("Smallest number "+smallnumber);
    }
}
