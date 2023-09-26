import java.util.Scanner;

public class ThreeSixNineGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1~99������ ������ �Է��Ͻÿ�>>");
        int number = scanner.nextInt();

        if (number < 1 || number > 99) {
            System.out.println("�߸��� ���� �����Դϴ�. 1~99������ ���ڸ� �Է����ּ���.");
        } else {
            int count = countClaps(number);
            if (count == 1) {
                System.out.println("�ڼ�¦");
            } else if (count == 2) {
                System.out.println("�ڼ�¦¦");
            } else {
                System.out.println("�ڼ� ����");
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
