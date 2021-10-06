package methods;

import java.util.Scanner;

/**
 * AverageMarks
 */
public class AverageMarks {

    public static void main(String[] args) {
       
       average();

    }
    static void average(){
        Scanner in = new Scanner(System.in);
        System.out.print("enter the marks: ");
        
        int sum=0;
        int count=0;
        while (true) {
            int marks = in.nextInt();
            if (marks==0) {
                break;
            }
            sum=sum+marks;
            count++;
        }
        if (count>0) {
            float average = sum/count;
          System.out.println("the average is : "+average);

        } else {
            System.out.println("enter marks");
        }
    }
}