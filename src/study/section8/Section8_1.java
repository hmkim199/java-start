package study.section8;

import java.util.Scanner;

public class Section8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("연산자를 입력하세요: ");
        String operator = scanner.nextLine();

        if (operator.equals("+")) {
            System.out.print("덧셈 결과: " + (num1 + num2));
        } else if (operator.equals("-")) {
            System.out.print("뺄셈 결과: " + (num1 - num2));
        } else if (operator.equals("*")) {
            System.out.print("곱셈 결과: " + (num1 * num2));
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                System.out.print("나눗셈 결과: " + ((double) num1 / num2));
            }
            else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        }
        else {
            System.out.println("잘못된 연산자를 입력했습니다.");
        }
        scanner.close();
    }
}
