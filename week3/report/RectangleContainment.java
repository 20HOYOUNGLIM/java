import java.util.Scanner;

public class RectangleContainment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // ���簢���� ���� ��� �𼭸��� ������ �ϴ� �𼭸� ��ǥ
        int rectX1 = 100, rectY1 = 100, rectX2 = 200, rectY2 = 200;

        if (x >= rectX1 && x <= rectX2 && y >= rectY1 && y <= rectY2) {
            System.out.printf("(%d,%d)�� �簢�� �ȿ� �ֽ��ϴ�.\n", x, y);
        } else {
            System.out.printf("(%d,%d)�� �簢�� �ȿ� �����ϴ�.\n", x, y);
        }

        scanner.close();
    }
}
