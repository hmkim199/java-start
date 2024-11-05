package study.section8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Section8_2 {
    public static void main(String[] args) {

        String[] questions = {
                "1. 자바는 어떤 프로그래밍 언어인가요?\na. 컴파일 언어\nb. 인터프리터 언어\nc. 하이브리드 언어",
                "2. 자바의 주된 특징은 무엇인가요?\na. 플랫폼 독립성\nb. 메모리 직접 접근\nc. 저수준 언어",
                "3. 자바의 기본 데이터 타입이 아닌 것은?\na. int\nb. float\nc. string",
                "4. 자바에서 클래스는 어떤 키워드로 정의하나요?\na. class\nb. define\nc. struct",
                "5. 자바에서 배열의 인덱스는 몇부터 시작하나요?\na. 0\nb. 1\nc. -1"
        };

        String[] answers = {"c", "a", "c", "a", "a"};
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(answers[i])) {
                System.out.println("정답입니다!!!!!!\n");
                score++;
            }
            else {
                System.out.println("오답입니다. 정답은 "+ answers[i] + "입니다.\n");
            }
        }
        System.out.println("\n당신은 " + score + "개 맞추어, 점수는 "+ score * 20 + "점입니다.");
    }
}