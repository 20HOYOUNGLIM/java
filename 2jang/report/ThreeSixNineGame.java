import java.util.Scanner;

public class ThreeSixNineGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99사이의 정수를 입력하시오>>");
        int number = scanner.nextInt();

        if (number < 1 || number > 99) {
            System.out.println("잘못된 숫자 범위입니다. 1~99사이의 숫자를 입력해주세요.");
        } else {
            int count = countClaps(number);
            if (count == 1) {
                System.out.println("박수짝");
            } else if (count == 2) {
                System.out.println("박수짝짝");
            } else {
                System.out.println("박수 없음");
            }
        }

        scanner.close();
    }

    public static int countClaps(int number) {
        int count = 0;
        int tensPlace = number / 10;
        int onesPlace = number % 10;

        if (tensPlace == 3 || tensPlace == 6 || tensPlace == 9) {
            count++;
        }

        if (onesPlace == 3 || onesPlace == 6 || onesPlace == 9) {
            count++;
        }

        return count;
    }
}
