
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int n = arr.length;

        int i=0;
        int j =0;
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();

        
        while(j<n){
           
            sum += arr[j];

           while(sum > target && i<j){
               sum -= arr[i];
               i++;
           }
           if (sum == target) {
                result.add(i+1 );
                result.add(j+1 ); 
                return result;
            }

            j++;
        }

        
        result.add(-1);
        return result;
    }
}

        