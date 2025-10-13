// User function template for Java

class Solution {
    static String toLower(String s) {
        StringBuilder result = new StringBuilder();
        
        // code here
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32); 
            }

            result.append(ch);
        }

        return result.toString();
    }

            
        
    
}