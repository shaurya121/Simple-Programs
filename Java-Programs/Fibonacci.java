
/*
Author: @pulsara
This program find the nth fibonacci number using dynamic programing(bottom up approach)
*/


public class Fibonacci {

    int fib(int n) {
        int f[] = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        //store the values in an array so no need of computing again
        for (int i = 2; i <= n; i++)
            f[i] = f[i - 1] + f[i - 2];
        return f[n];
    }

    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        //find the 5th fibonacci number
        int findFibo = 6;
        System.out.println("Fibonacci number is" + " " + f.fib(findFibo));
    }
}