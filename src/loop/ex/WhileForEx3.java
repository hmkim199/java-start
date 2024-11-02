package loop.ex;

public class WhileForEx3 {
    public static void main(String[] args) {
        int i = 1;
        int max = 10;
        int sum = 0;
        while (i <= max) {
            sum += i++;
        }
        System.out.println(sum);
        System.out.println();

        sum = 0;
        for (int j = 1; j <= max; j++) {
            sum += j;
        }
        System.out.println(sum);
    }
}
