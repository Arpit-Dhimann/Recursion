//PROBLEM: Print numbers from n to 1.

import java.util.Scanner;

public class Recursion_1 {
    public static void printNumber(int n){
        // Base case: stop when n reaches 0
        if(n == 0){
            return;
        }
        
        System.out.println(n);
        // Recursive call with n-1 to print in decreasing order
        printNumber(n-1);
    }

    public static void main(String[] args) {
        System.out.print("Enetr n : ");
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        printNumber(n);

        sc.close();
    }
}