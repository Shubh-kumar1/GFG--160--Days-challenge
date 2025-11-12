// User function Template for Java

class Solution {

    int search(String pat, String txt) {
         if (pat.length() > txt.length()) {
            return 0;
        }

       
        Map<Character, Integer> patternMap = new HashMap<>();
        for (char c : pat.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }

        
        int count = patternMap.size();
        int answer = 0;

        
        Map<Character, Integer> windowMap = new HashMap<>();
        int k = pat.length();
        int i = 0;

        for (int j = 0; j < txt.length(); j++) {
            char charAtJ = txt.charAt(j);
            windowMap.put(charAtJ, windowMap.getOrDefault(charAtJ, 0) + 1);

           
            if (patternMap.containsKey(charAtJ)
                    && windowMap.get(charAtJ).intValue() == patternMap.get(charAtJ).intValue()) {
                count--;
            }

         
            if (j - i + 1 == k) {

                if (count == 0) {
                    answer++;
                }

                char charAtI = txt.charAt(i);

                
                if (patternMap.containsKey(charAtI)
                        && windowMap.get(charAtI).intValue() == patternMap.get(charAtI).intValue()) {
                    count++;
                }

                
                windowMap.put(charAtI, windowMap.get(charAtI) - 1);
                if (windowMap.get(charAtI) == 0) {
                    windowMap.remove(charAtI);
                }

                i++;
            }
        }

        return answer;
    }

        
    
}