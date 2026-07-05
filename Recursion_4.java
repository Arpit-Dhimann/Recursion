//PROBLEM: Print factorial of a number n.

import java.util.Scanner;
public class Recursion_4 {
    public static void calFact(int n, int fact){
        // Base case: stop when n reaches 0 and print result
        if(n == 0){
            System.out.print("factorial of number (n) : " + fact);
            return;
        }
        // Multiply current n into fact and call with n-1
        fact *= n;
        calFact(n-1, fact);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (n) : ");
        int n = sc.nextInt();
        // Initialize fact with 1
        calFact(n, 1);
        
        sc.close();
    }
}