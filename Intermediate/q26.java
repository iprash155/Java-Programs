package Intermediate;

public class q26 {
    public static void main(String[] args) {
        int count=0;
        
        int i=1;
        while(i<=30){
            if(i%2==0){
                count++;
            }
            i++;
        }
        System.out.println("kunal can go out "+count+" days in the month of august" );
    }
}
