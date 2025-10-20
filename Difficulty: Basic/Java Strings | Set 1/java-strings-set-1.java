// User function template for Java

class Solution {
    static String conRevstr(String S1, String S2) {
        
        String result = S1 + S2;
        char[] ch = result.toCharArray();
        int low =0;
        int high = ch.length-1;
        while(low<high){
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;
        }
        return new String(ch);
        
    }
}