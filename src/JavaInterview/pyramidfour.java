package JavaInterview;

import java.util.Scanner;

public class pyramidfour
{
        public static int Rowcount;
        public static void main(String[] args ) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter the number of Pyramid count");
            int noOfRows = input.nextInt();
            Rowcount = 1;
            for (int i = noOfRows; i >= 1; i--) {

                for (int j = 1; j <= i*2; j++) {
                    System.out.print(" ");
                }
                for (int j = i; j <= noOfRows; j++) {
                    System.out.print(j + " ");
                }
                for(int j=noOfRows-1;j>=i;j--) {
                    System.out.print(j + " ");
                }
                System.out.println();
                Rowcount++;
            }
        }
    }


