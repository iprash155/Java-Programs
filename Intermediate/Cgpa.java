package Intermediate;

import java.util.Scanner;

public class Cgpa {
    public static void main(String[] args) {
        int sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("enter the no of subjects ");
        int subjects = in.nextInt();
        double total = subjects*100;
        if (subjects < 1) {
            System.out.println("enter more than 0 subjects");
        } 
        else {
            System.out.println("enter marks of all differnt subjects out of 100 ");
            while (subjects >= 1) {
                int marks = in.nextInt();
                sum = sum + marks;
                subjects--;
            }
            double percentage = (sum * 100.0) / (total);
            double Cgpa = (percentage / 9.5);
            System.out.println("your cgpa is " + Cgpa);
        }
    }
}
