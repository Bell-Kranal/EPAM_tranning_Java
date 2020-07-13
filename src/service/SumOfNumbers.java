package service;

import java.util.Scanner;

public class SumOfNumbers {
    public static void sumOfNumbers() {
        int firstNumber;
        int secondNumber;
        int sum;
        Scanner scanner = new Scanner(System.in);

        firstNumber = scanner.nextInt();
        secondNumber = scanner.nextInt();

        sum = firstNumber + secondNumber;

        System.out.println(sum);
    }
}
