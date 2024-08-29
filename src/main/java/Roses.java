//2.Open-closed principe.Расширяем класс Flowers не меняя полей и логики класса.
public class Roses extends Flowers {
    public static int sumProducts;

    public static int totalPrices(String[] products, int[] prices, int[] number) {
        System.out.println("Ваша корзина : ");
        for (int i = 0; i < SIZE; i++) {
            if (number[i] > 0) {
                int sum = number[i] * prices[i];
                sumProducts += sum;
                System.out.println(products[i] + " " + number[i] + " шт. " + prices[i] + " руб/шт. "
                        + (prices[i] * number[i]) + " руб. в сумме");
            }
        }
        System.out.printf("Итого : %s руб.", sumProducts);
        return sumProducts;
    }
}

