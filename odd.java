import java.util.*;
public class OddNumbers {
    public static void printOddNumbers(int n) {
        System.out.print("Odd numbers from 1 to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        printOddNumbers(n);
        
        
    }    
}
