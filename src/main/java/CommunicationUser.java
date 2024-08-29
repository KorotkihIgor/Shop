import java.util.Scanner;

// 1.Single.Принцип единой ответственности.
// Этот класс отвечает за взаимодейстие пользователя с сайтом, а не за магазин товаров.
public class CommunicationUser {
    public static int[] number = new int[Flowers.SIZE];

    public static void communication(Scanner scanner) {
        while (true) {
            System.out.println("Выберите товар и колличество или введите end: ");
            String inputString = scanner.nextLine();
            if (inputString.equals("end")) {
                break;
            }
            String[] parts = inputString.split(" ");
            int productNumber = Integer.parseInt(parts[0]) - 1;
            int productCont = Integer.parseInt(parts[1]);
            number[productNumber] += productCont;
        }
    }
}
