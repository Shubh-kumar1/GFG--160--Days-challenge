class Solution {
    public static boolean prime(int n) {
        if(n<=1){
            return false;
        }
        // Write your code here
        for(int i=2;i<n; i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;
    }
}