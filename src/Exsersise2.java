// 1 Варіант132
import java.util.Scanner;

public class Exsersise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int number = sc.nextInt();
        int reversed = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        System.out.printf("Число у зворотному порядку (while): %010d\n", reversed);

        number = originalNumber;
        reversed = 0;

        do {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        } while (number != 0);

        System.out.printf("Число у зворотному порядку (do-while): %010d\n", reversed);
    }
}