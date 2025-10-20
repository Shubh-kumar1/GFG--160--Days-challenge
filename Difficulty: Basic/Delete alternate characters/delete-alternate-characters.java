// User function template for Java

class Solution {
    static String delAlternate(String S) {
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<S.length(); i=i+2){
            char ch = S.charAt(i);
            sb.append(ch);
            
            
            
        }
        
        return sb.toString();
        
    }
    
}