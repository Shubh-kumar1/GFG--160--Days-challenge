//Back-end complete function Template for Java
import java.util.Scanner;

public class Solution {
    public static void solve() {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        int d = a ^ a;      
        int e = c ^ b;      
        int f = a & b;      
        int g = c | (a ^ a); 
        e = ~e;
        System.out.print(d + " " + e + " " + f + " " + g);
    }
}