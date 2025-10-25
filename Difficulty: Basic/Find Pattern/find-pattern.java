class Solution {
    public static int findPattern(String s, String p) {
        int n = s.length();
        int m = p.length();
        for (int i = 0; i <= n - m; i++) {
            boolean matchFound = true; 
            for (int j = 0; j < m; j++) {
                if (s.charAt(i + j) != p.charAt(j)) {
                    matchFound = false;
                    break;
                }
            }
            if (matchFound) {
                return i;
            }
        
        }
        return -1;
    
        
    }
    
}
