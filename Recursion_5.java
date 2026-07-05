//PROBLEM: Print the fibonacci sequence till nth term.

import java.util.Scanner;
public class Recursion_5 {
    public static void printFib(int a , int b , int n){
        // Base case: stop after n terms
        if(n == 0){
            return;
        }
        // Calculate next term, print current, and shift variables
        int c = a+b;
        System.out.print(a + " ");
        printFib(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your nth term : ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        printFib(a , b , n);
        
        sc.close();
    }
}