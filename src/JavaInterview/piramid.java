package JavaInterview;
import java.util.Scanner;
public class piramid {
    public static int Rowcount;
      public static void main(String[] args ) {
          Scanner input=new Scanner(System.in);
          System.out.println("Enter the number of Pyramid count");
          int noOfRows = input.nextInt();
          Rowcount =1;
          for (int i =noOfRows;i>=1;i--){

              for(int j=1;j<=i;j++){
                  System.out.print(" ");
              }
              for(int j=1;j<=Rowcount;j++){
                  System.out.print(Rowcount+" ");
              }
              System.out.println();
              Rowcount++;
          }
      }




      }

