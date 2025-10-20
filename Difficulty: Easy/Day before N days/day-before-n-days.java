// User function Template for Java
class Solution {
    public static int nthDay(int d, int n) {
        int a = n % 7 ;
        int ans = (d-a+7)%7;
        return ans;
        
    }
}