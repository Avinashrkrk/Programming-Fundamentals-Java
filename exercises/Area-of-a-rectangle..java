import java.util.Scanner;

public class Solution { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt(); 
        int width = scanner.nextInt();

        // Calculate the area of the rectangle
        int area = length * width;

        // Print the result
        System.out.println(area);
        // This is test 


        scanner.close(); 
    } 
}