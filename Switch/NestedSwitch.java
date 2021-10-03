package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter employ id ");
        int empId=in.nextInt();
        System.out.println("enter department ");
        String empDapartment=in.next();

        switch(empId){
            case 1:
            System.out.println("prashant prajapati");
            break;
            case 2:
            System.out.println("himanshu rathod");
            break;
            case 3:
            
            switch (empDapartment) {
                case "it":
                    System.out.println("IT department");
                    break;
                case "arts":
                    System.out.println("arts department");
                    break;
                default:
                    System.out.println("enter valid department");
                    break;
            }
            break;
            case 4:
            System.out.println("parth");
            break;
            case 5:
            System.out.println("rahul");
            break;
            default:
            System.out.println("enter valid input");
        }
    }
}
