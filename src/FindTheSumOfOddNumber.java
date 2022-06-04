import java.util.Scanner;

public class FindTheSumOfOddNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter a Number..:");
        int number = scanner.nextInt();
        int total = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 1) {
                total += i;

            }
        }
        System.out.println("Sum..:" + total);

    }
}
