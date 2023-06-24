import java.util.*;
public class EvenNumbers {
    public static void printEvenNumbers(int n) {
        System.out.print("Even numbers from 1 to " + n + ": ");
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        printEvenNumbers(n);
        
        
    }    
}
