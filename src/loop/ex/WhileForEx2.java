package loop.ex;

public class WhileForEx2 {
    public static void main(String[] args) {
        int num = 2;
        int count = 0;
        while (count < 10) {
            System.out.println(num);
            num += 2;
            count++;
        }

        System.out.println();
        num = 2;
        for(int i = 0; i < 10; i++){
            System.out.println(num);
            num += 2;
        }

        System.out.println();
        // 다른 방법
        for (int numF = 2, countF = 0; countF < 10; numF += 2, countF++) {
            System.out.println(numF);
        }
    }
}
