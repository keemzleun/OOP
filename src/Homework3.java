package src;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        System.out.println("수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();

            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
            }
        }

        System.out.println("최대값: " + maxValue);
        System.out.println("최소값: " + minValue);

        scanner.close();
    }
}
