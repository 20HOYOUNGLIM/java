import java.util.Scanner;

public class RectangleCollision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("���簢���� ���� ��� �𼭸� ��ǥ (x1, y1)�� �Է��Ͻÿ�>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("���簢���� ������ �ϴ� �𼭸� ��ǥ (x2, y2)�� �Է��Ͻÿ�>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // �־��� ���簢���� ��ǥ
        int givenRectX1 = 100, givenRectY1 = 100, givenRectX2 = 200, givenRectY2 = 200;

        // �浹 Ȯ��
        boolean isColliding = !(x1 > givenRectX2 || x2 < givenRectX1 || y1 > givenRectY2 || y2 < givenRectY1);

        if (isColliding) {
            System.out.println("�Է��� ���簢���� �־��� ���簢���� �浹�մϴ�.");
        } else {
            System.out.println("�Է��� ���簢���� �־��� ���簢���� �浹���� �ʽ��ϴ�.");
        }

        scanner.close();
    }
}
