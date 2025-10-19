class Solution {
    public int[] computeOperations(int x, int y) {
        int[] result = new int[5];
       
        
        result[0] = x + y;
        result[1] = x - y;
        result[2] = x*y;
        result[3] = x/y;
        result[4] = x % y;
        
       
        return result;
        
        
        
        
        
        
        
    }
}
