package study.section8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Section8_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Map<String, String> books = new HashMap<>();

        while (true) {
            System.out.println("1. 도서 등록\n2. 도서 조회\n3. 도서 삭제\n4. 종료");
            int input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                System.out.print("책 이름을 입력하세요: ");
                String book = scanner.nextLine();

                System.out.print("저자를 입력하세요: ");
                String author = scanner.nextLine();

                books.put(book, author);
            } else if (input == 2) {
                System.out.println("도서 목록을 출력합니다.");
                if (books.isEmpty()) {
                    System.out.println("등록된 책이 없습니다.");
                    continue;
                }
                books.forEach((book, author) -> System.out.println("도서명: " + book + ", 저자: " + author));
            } else if (input == 3) {
                if (books.isEmpty()) {
                    System.out.println("등록된 책이 없습니다.");
                    continue;
                }
                System.out.print("삭제할 책 제목을 입력하세요: ");
                String book = scanner.nextLine();
                books.remove(book);
            } else if (input == 4) {
                System.out.println("도서 관리 시스템을 종료합니다. BYE.");
                break;
            } else {
                System.out.println("1~4 중 숫자로 입력하세요!");
            }
            System.out.println();
        }
    }
}
