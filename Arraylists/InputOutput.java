package Arraylists;
import java.util.ArrayList;
import java.util.Scanner;


public class InputOutput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter the nos: ");
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 5; i++) {
             list.add(in.nextInt());
        }

        //1st way to print list 
        // System.out.println(list);       //printing arraylist

        //2nd way to print list
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i)+" ");    //not list(i),but have to use list.get() methods
        }
    }
}
