import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=1){
            System.out.print("False");
            return;
            
        }
        for(int i=2; i<n; i++){
            if(n % i == 0){
                System.out.print("False");
                return;
            }
            
        }
        
         System.out.print("True");
    }
}