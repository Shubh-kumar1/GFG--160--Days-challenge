// User function Template for Java
class Solution {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
          int n =list.size();
          int low =0; 
          int high = n-1;
          while(low<=high){
              int mid = low+(high-low)/2;
              int midValue = list.get(mid);
              
              if(midValue == k){
                  return mid;
                  
              }else if(midValue<k){
                  low = mid+1;
              }else{
                  high = mid-1;
              }
              
      }
      return -1;
      
    }
}