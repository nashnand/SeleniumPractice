package JavaInterview;

import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of Pyramid count");
        int noOfRows = input.nextInt();
        int Rowcount = 1;
        for (int i = noOfRows; i >=1 ; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int K = 1; K <= Rowcount; K++) {
                System.out.print("* ");
            }
            System.out.println();
            Rowcount++;
        }
    }

}
