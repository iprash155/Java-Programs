package methods;



public class Armstrong {
    public static void main(String[] args) {
        int i;
        for(i=100;i<1000;i++){
            if (isArmstrong(i)==true) {
                System.out.println(i);
            }
        }
    }

    static boolean isArmstrong(int no){
        int sum=0;
        int temp=no;
        while (no>0) {
            int rem=no%10;
            no/=10;
            sum=sum+rem*rem*rem;
        }
        return sum==temp;
    }
}
