
class Solution {
    public String average(int arr[]) {
        int n = arr.length;
        double sum = 0;
        for(int i =0; i<arr.length; i++){
            sum += arr[i];
            
            
           
        }
        double avg = sum/n;
        return String.format("%.2f",avg);
        
    }
    
}