package src;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        int sum = 0;
        int input;

        for (int i=0; i<5; i++) {
            System.out.println("정수를 입력하세요: ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            sum += input;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n", sum);
        }
    }
}
