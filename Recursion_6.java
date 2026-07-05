//PROBLEM: Print x^n (with stack height = n)
//          x^n = x * (x^n-1)

public class Recursion_6 {
    public static int printPower(int x, int n) {
        // Base case: x^0 is 1
        if(n == 0) {
            return 1;
        }
        // Base case: 0^n is 0
        if(x == 0) {
            return 0;
        }
        // Recursive call to get x^(n-1)
        int x_ = printPower(x, n-1);
        // Calculate x^n
        int xn = x * x_;
        return xn;
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        int output = printPower(x, n);
        System.out.println(output);
    }
}