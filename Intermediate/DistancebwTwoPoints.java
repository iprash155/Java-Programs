package Intermediate;

import java.util.Scanner;

/**
 * DistancebwTwoPoints
 */
public class DistancebwTwoPoints {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the point x1 and y1");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.print("enter the point x2 and y2");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        double distance = Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));
        System.out.println("the distance b/w ("+x1+","+y1+") and ("+x2+","+y2+") is "+distance);
    }
}