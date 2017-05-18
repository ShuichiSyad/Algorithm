package l10q1;
import java.util.*;
public class L10Q1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int numb = kb.nextInt();
        System.out.println(numb+"th Fibonacci : "+fibonacci(numb));
    }
    
    public static int fibonacci(int n){
        int[] fib = new int[n+1];
        
        fib[0] = 0;
        fib[1] = 1;
        
        for(int i=2;i<=n;i++)
            fib[i] = fib[i-1] + fib[i-2];
        
        return fib[n];
    }
}
