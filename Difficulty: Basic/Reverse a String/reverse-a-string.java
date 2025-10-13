class Solution {
    static String revStr(String s) {
        // code here
        char[] arr = s.toCharArray();
        int low = 0;
        int high = arr.length-1;
        while(low<high){
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;

            low++;
            high--;

        }
         return new String(arr);
        
    }
}