package Array;

import java.util.ArrayList;
import java.util.List;

public class AddtoArrayFormofInteger{

    public static void main(String[] args) {
      
        System.out.println(addToArrayForm());
        
    }

    public static List<Long> addToArrayForm() {
            int[] num={9,9,9,9,9,9,9,9,9,9}; 
            int k=1;
            long sum = 0l;
            ArrayList<Long> arrayForm = new ArrayList<>(100);
            for(int i = 0; i<num.length;i++){ 
                sum=sum*10+num[i];
            }
            long integer = sum+k;
            
            
            while(integer!=0){
                
                long rem = integer%10;
                arrayForm.add(0, rem);
                integer/=10;
        
            }
            return arrayForm;
            
    }
}
