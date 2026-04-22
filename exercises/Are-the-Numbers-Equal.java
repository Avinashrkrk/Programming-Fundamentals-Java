import java.util.Scanner; 

public class Solution { 
    public static void main(String[] args) { 
        // Take help of Scanner to take input 
        Scanner sc = new Scanner(System.in); 
        int num1 = sc.nextInt(); 
        int num2 = sc.nextInt(); 
        
        // Use logical operator to compare the numbers
        if (num1 == num2) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close(); 
    } 
}