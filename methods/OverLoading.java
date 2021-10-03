package methods;

/**
 * OverLoading
 */
public class OverLoading {

    public static void main(String[] args) {
       int ans = sum(5,6);      //going to call the first one
       System.out.println(ans); 
    }
    static int sum(int a , int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;
    }
}