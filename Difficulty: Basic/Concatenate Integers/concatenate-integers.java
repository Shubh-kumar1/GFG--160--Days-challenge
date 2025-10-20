import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String A = String.valueOf(a);
        String B = String.valueOf(b);
        String result = A + B;
        System.out.println(Integer.parseInt(result));
    }
}