package loop.ex;

public class WhileForEx1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(++i);
        }

        System.out.println();

        for (int j = 1; j <= 10; j++) {
            System.out.println(j);
        }
    }
}
