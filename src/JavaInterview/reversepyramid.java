package JavaInterview;

import java.util.Scanner;

public class reversepyramid {

     public static int Rowcount;
        public static void main(String[] args ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of Pyramid count");
            int noOfRows = input.nextInt();
            Rowcount = noOfRows;
            for (int i = 1; i <= noOfRows; i++) {

                for (int j = 1; j <= i*2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= Rowcount; j++) {
                    System.out.print(j + " ");
                }
                for(int j=Rowcount-1;j>=1;j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
                Rowcount--;
            }
        }
    }

