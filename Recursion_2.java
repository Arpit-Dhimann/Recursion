//PROBLEM: Print numbers from 1 to n.

import java.util.Scanner;
public class Recursion_2 {
    public static void printNumber(int n, int m){
        //Base case: stop when n exceeds m
        if(n > m){
            return;
        }

        System.out.println(n);
        // Recursive call with n+1 to print in increasing order
        printNumber(n+1, m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start number (n) : ");
        int n = sc.nextInt();
        System.out.print("Enter last number (m) : ");
        int m = sc.nextInt();
        printNumber(n , m);
        
        sc.close();
    } 
}