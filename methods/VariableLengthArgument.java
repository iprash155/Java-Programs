package methods;

import java.util.Arrays;

/**
 * VariableLengthArgument
 */
public class VariableLengthArgument {

    public static void main(String[] args) {
        func(15,1,56,89,98);
    }
    static void func(int ...c){
        System.out.println(Arrays.toString(c));
    }
}