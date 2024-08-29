public class Pion extends Roses implements Discount {
    //3. Принцип Барбары Лисков. Класс Pion выполняет теже функции что и класс Roses.
    @Override
    public double discount(double sum) {
        if (sum > 1000) {
            return sum / 100 * 15;
        }
        return 0;
    }
}
