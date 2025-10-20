class Solution {
    public static void printPrimeFactorization(int n) {
        if(n<=1){
            return;
        }
        while(n%2 == 0){
            System.out.print(2);
            n = n / 2;
            if(n > 1){
            System.out.print(" ");
            }
        }
        for (int i = 3; i * i <= n; i = i + 2) {
            
            while (n % i == 0) {
                System.out.print(i);
                
                n = n / i;
                if(n > 1){
                System.out.print(" ");
                }
            }
        }

        
        if (n > 2) {
            System.out.print(n);
        }
        
        // System.out.println();
    }
}
        
