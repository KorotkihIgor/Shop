import java.util.*;

public class Main {
    //DRY. Перечисление товаров вынес в отдельный метод.
    public static void productShop(String[] products, int[] price) {
        for (int i = 0; i < Flowers.SIZE; i++) {
            System.out.println(products[i] + " = " + price[i] + " руб/шт");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Roses roses = new Roses();
        roses.setColor(new String[]{"1.Красные", "2.Белые", "3.Розовые"});
        roses.setPrice(new int[]{120, 100, 120});

        Pion pion = new Pion();
        pion.setColor(new String[]{"1.Розовые", "2.Красные", "3.Белые"});
        pion.setPrice(new int[]{150, 100, 200});
        System.out.print("Выберите операцию: \n" +
                " 0.Выход из программы.\n" +
                " 1.Магазин Роз.\n " +
                "2.Магазин Пионов.");

        while (true) {

            int result = Integer.parseInt(scanner.nextLine());
            if (result == 0) {
                System.out.println("Программа завершина!");
                break;
            }
            switch (result) {
                case 1:
                    System.out.println("Розы.Список возможных товаров :");
                    productShop(roses.getColor(), roses.getPrice());
                    CommunicationUser.communication(scanner);
                    Roses.totalPrices(roses.getColor(), roses.getPrice(), CommunicationUser.number);
                    break;
                case 2:
                    System.out.println("Пионы.Список возможных товаров :");
                    System.out.println("Дуйствует акция при покупке свыше 1000 руб. скидка 15 %!");
                    productShop(pion.getColor(), pion.getPrice());
                    CommunicationUser.communication(scanner);
                    Pion.totalPrices(pion.getColor(), pion.getPrice(), CommunicationUser.number);
                    double discount = pion.discount(Pion.sumProducts);
                    System.out.printf("Ваша скидка  = %s руб.", discount);
                    break;
                default:
                    System.out.println("Такая операция отсутствует!");
            }
        }
    }
}
