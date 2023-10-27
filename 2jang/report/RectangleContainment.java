import java.util.Scanner;

public class RectangleContainment {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("점 (x,y)의 좌표를 입력하시오>>");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        // 직사각형의 왼쪽 상단 모서리와 오른쪽 하단 모서리 좌표
        int rectX1 = 100, rectY1 = 100, rectX2 = 200, rectY2 = 200;

        if (x >= rectX1 && x <= rectX2 && y >= rectY1 && y <= rectY2) {
            System.out.printf("(%d,%d)는 사각형 안에 있습니다.\n", x, y);
        } else {
            System.out.printf("(%d,%d)는 사각형 안에 없습니다.\n", x, y);
        }

        scanner.close();
    }
}
