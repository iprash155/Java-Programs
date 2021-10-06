package methods;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter x1 and y1 : ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        System.out.print("enter x2 and y2 : ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        double d = distance(x1, y1, x2, y2);
        System.out.println("the distance beteween (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + d);

    }

    static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2-x1), 2)+Math.pow((y2-y1), 2));
    }
}
