//PROBLEM: Print x^n (with stack height = logn)

public class Recursion_7 {
    public static int printPower(int x, int n) {
        // Base case: x^0 is 1
        if(n == 0) {
            return 1;
        }
        // Base case: 0^n is 0
        if(x == 0) {
            return 0;
        }
        // if n is even
        if(n % 2 == 0) {
            return printPower(x, n/2) * printPower(x, n/2);
        }
        // if n is odd
        else {
            return x * printPower(x, n/2) * printPower(x, n/2);
        }
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }
}