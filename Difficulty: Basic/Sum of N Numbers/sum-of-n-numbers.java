class Solution {
    public static int nSum(int n) {
        int sum = 0;
        // code here
        for(int i=1; i<=n; i++){
            sum += i;
        }
        return sum;
    }
}
