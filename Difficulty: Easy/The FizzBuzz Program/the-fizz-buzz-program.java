// User function Template for Java
import java.util.Scanner;

class Solution {
    public static void fizzBuzz(int number) {
        
            
        if(number % 3==0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(number % 5 == 0){
            System.out.println("Buzz");
        }else if(number % 3==0){
            System.out.println("Fizz");
        }else {
        System.out.println(number);
        }


        
    }
}