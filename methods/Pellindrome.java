package methods;



public class Pellindrome {
    public static void main(String[] args) {
        boolean b = isPellindrome(54646);
        if (b) {
            System.out.println("it is pellindrome");
        } else {
            System.out.println("it is not pellindrome");
        }
    }
    static boolean isPellindrome(int no){

        int temp =no;
        int sum=0;
        while (no>0) {
            int rem=no%10;
            sum=sum*10+rem;
            no/=10;
        }
        return sum==temp;
    }
}
