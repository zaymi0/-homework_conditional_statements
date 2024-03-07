import java.util.Scanner;

public class hwCS7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.printf("Число %d четное ", num);

        } else {
            System.out.printf("Число %d нечетное ", num);
        }
    }
}
