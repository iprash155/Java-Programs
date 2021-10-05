package methods;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter n1 :");
        float n1 = in.nextFloat();
        System.out.print("enter n2: ");
        float n2 = in.nextFloat();
        System.out.print("enter operation : ");
        char op = in.next().trim().charAt(0);
        if (n2 == 0 && (op == '/' || op == '%')) {
            System.out.println("enter n2 > 0");
        } else {
            double c = calculator(n1, n2, op);
            System.out.println(n1 + "" + op + "" + n2 + "=" + c);
        }

    }

    static double calculator(float a, float b, char operation) {
        if (operation == '+') {
            return a + b;
        }
        if (operation == '-') {
            return a - b;
        }
        if (operation == '*') {
            return a * b;
        }
        if (operation == '/') {
            if (b > 0) {
                return a / b;
            } else {
                return 'e';
            }

        }
        return a % b;
    }
}
