//4 Варіант
public class Exsersise3 {
    public static void main(String[] args) {
        System.out.printf("%4s", " ");

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }

        System.out.println();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);

            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }

            System.out.println();
        }
    }
}
