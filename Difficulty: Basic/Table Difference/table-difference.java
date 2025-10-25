// User function Template for Java
class Solution {
    public static void difference(int n1, int n2) {

        for(int i=1; i<=10; i++){
            int n3 = n1 * i;
            int n4 = n2 * i;
            
            int n5 = n3-n4;
            
            System.out.print(n5 +" ");
            
        }
        
    }
}