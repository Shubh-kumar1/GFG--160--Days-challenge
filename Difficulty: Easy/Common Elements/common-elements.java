// User function Template for Java

class Solution {
    public static ArrayList<Integer> commonElements(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer,Integer> freq = new HashMap<>();
        
        for(int i=0; i<a.length; i++){
            freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
            
            
        }
        
        for(int j=0;j<b.length; j++){
            if (freq.containsKey(b[j]) && freq.get(b[j]) > 0) {
                result.add(b[j]);
                freq.put(b[j], freq.get(b[j]) - 1);
            }
        }
        Collections.sort(result);
        return result;
    }
}