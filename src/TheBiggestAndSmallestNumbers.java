import java.util.Scanner;

public class TheBiggestAndSmallestNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter: ");
        int totalNumber = input.nextInt();

        int max = 0;
        int min = 0;

        for (int i = 1; i <= totalNumber; i++) {
            System.out.print("Number " + i + " = ");
            int number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;
            } else {
                if (number > max)
                    max = number;
                if (number < min) {
                    min = number;
                }
            }
        } System.out.println("The biggest number is: " + max);
        System.out.print("The smallest number is: " + min);
    }
}
