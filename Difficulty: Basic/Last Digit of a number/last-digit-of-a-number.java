class Solution {
    public static void utility(int n) {
        String s = String.valueOf(n);
        int length = s.length();
        char lastChar = s.charAt(length - 1);
        
        System.out.println(lastChar);
        
    }
}