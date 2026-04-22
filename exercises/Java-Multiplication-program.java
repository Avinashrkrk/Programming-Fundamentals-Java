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

                if (i == 10) {
                    // last line → no trailing space
                    System.out.print(num + " * 10 = " + (num * i));
                } else {
                    // all other lines → trailing space
                    System.out.println(num + " * " + i + " = " + (num * i) + " ");
                }
            }
        }

        scanner.close();
    }
}