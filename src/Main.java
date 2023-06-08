import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sales = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию: \n 1. Добавить \n 2. Показать \n 3. Удалить");
            String number = scanner.next();

            switch (number) {

                case "1" : {
                    System.out.println("Какую покупку хотите добавить?");
                    System.out.println();
                    sales.add(scanner.next());
                    break;
                }

                case "2" : {
                    shOrd(sales);
                    break;
                }

                case "3" : {
                    shOrd(sales);
                    System.out.println("Какую хотите удалить? Введите номер или название");
                    String numberOrName = scanner.next();
                    try {
                        int index = Integer.parseInt(numberOrName) - 1;
                        sales.remove(index);
                    } catch (NumberFormatException e) {
                        sales.remove(numberOrName);
                    }
                    System.out.println("Покупка " + numberOrName + " удалена");
                    shOrd(sales);
                    System.out.println();
                    break;
                }
                default: {
                    System.out.println("Введены некоректные данные");
                }
            }
        }
    }

    public static void shOrd(List<String> sales) {
        System.out.println("Список покупок:");
        for(int i = 0; i < sales.size(); i++) {
            int name = i + 1;
            System.out.println(name + ". " + sales.get(i));
        }
    }
}