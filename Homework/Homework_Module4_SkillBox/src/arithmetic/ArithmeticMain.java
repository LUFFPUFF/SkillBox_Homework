package arithmetic;

import java.util.Scanner;

public class ArithmeticMain {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Введите два числа: ");
        int num1 = scanner();
        int num2 = scanner();

        Arithmetic arithmetic = new Arithmetic(num1, num2);
        printConsole(arithmetic);

    }

    private static void printConsole(Arithmetic arithmetic) {
        int sum = arithmetic.sum();
        int multiplication = arithmetic.multiplication();
        int max = arithmetic.max();
        int min = arithmetic.min();

        System.out.println("Сумма чисел: " + sum + "\n" +
                "Произведение чисел: " + multiplication + "\n" +
                "Максимально из двух чисел: " + max + "\n" +
                "Минимальное из двух чисел: " + min);
    }

    public static int scanner() {
        int num = 0;
        boolean isValidateInput = false;

        while (!isValidateInput) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                isValidateInput = true;
            } else {
                System.out.println("Вы вводите не число");
                scanner.next();
            }
        }
        return num;
    }
}
