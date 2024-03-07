import java.util.Scanner;

public class hwCS5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число ");
        int num = scanner.nextInt();

        System.out.print("Введите второе число ");
        int num1 = scanner.nextInt();

        System.out.print("Введите третье число ");
        int num2 = scanner.nextInt();

        if (num > num1 && num > num2) {
            System.out.println("Наибольшее число " + num);

        } else if (num1 > num && num1 > num2) {
            System.out.println("Наибольшее число " + num1);

        } else {
            System.out.println("Наибольшее число " + num2);
        }
    }
}
