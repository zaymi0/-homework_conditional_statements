import java.util.Scanner;

public class hwCS8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int milkPrice = 10;
        int breadPrice  = 3;
        int waterPrice  = 17;
        int change;
        String milk = "Молоко";
        String bread = "Хлеб";
        String water = "Вода";
        System.out.println("Меню ");
        System.out.printf("%s %d \n", milk, milkPrice);
        System.out.printf("%s %d \n", bread, breadPrice);
        System.out.printf("%s %d \n", water, waterPrice);
        System.out.print("Введите название товара: ");
        String buy = scanner.nextLine();

        if (buy.equalsIgnoreCase(milk)) {
            System.out.print("Введите сумму: ");
            int cash = scanner.nextInt();

            if (cash > milkPrice) {
                change = cash - milkPrice;
                System.out.println("Ваша сдача: " + change);

            } else if (cash == milkPrice) {
                System.out.println("Спасибо за покупку!");

            } else {
                System.out.println("Денег не хватает!");
            }
        }

        if (buy.equalsIgnoreCase(bread)) {
            System.out.print("Введите сумму: ");
            int cash = scanner.nextInt();

            if (cash > breadPrice) {
                change = cash - breadPrice;
                System.out.println("Ваша сдача: " + change);

            } else if (cash == breadPrice) {
                System.out.println("Спасибо за покупку!");

            } else {
                System.out.println("Денег не хватает!");
            }
        }

        if (buy.equalsIgnoreCase(water)) {
            System.out.print("Введите сумму: ");
            int cash = scanner.nextInt();

            if (cash > waterPrice) {
                change = cash - waterPrice;
                System.out.println("Ваша сдача: " + change);

            } else if (cash == waterPrice) {
                System.out.println("Спасибо за покупку!");

            } else {
                System.out.println("Денег не хватает!");
            }
        }
    }
}
