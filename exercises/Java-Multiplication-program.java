import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.print("Invalid Input");
        } else {
            System.out.println("Multiplication Table of " + num + ": ");

            for (int i = 1; i <= 10; i++) {
                String line = num + " * " + i + " = " + (num * i);

                if (i < 10) {
                    System.out.println(line + " "); // trailing space
                } else {
                    System.out.print(line); // last line (no trailing space/newline)
                }
            }
        }

        scanner.close();
    }
}