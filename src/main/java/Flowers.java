
public abstract class Flowers {
    // Magic.Вынес в отдельное поле размер количества ячеек  массива.
    public static final int SIZE = 3;
    private String[] color = new String[SIZE];
    private int[] price = new int[SIZE];

    public String[] getColor() {
        return color;
    }

    public int[] getPrice() {
        return price;
    }

    public void setColor(String[] color) {
        this.color = color;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

}
