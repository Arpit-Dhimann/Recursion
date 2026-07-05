//PROBLEM: Print the sum of first n natural numbers.

import java.util.Scanner;

public class Recursion_3 {
    public static void printSum(int n, int sum){
        // Base case: stop when n reaches 0 and print the accumulated sum
        if(n == 0){
            System.out.println(sum);
            return;
        }
        // Accumulate n into sum and call with n-1
        sum += n;
        printSum(n-1, sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter natural number (n) : ");
        int n = sc.nextInt();
        printSum(n, 0);
        
        sc.close();
    }
}