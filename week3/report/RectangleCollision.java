import java.util.Scanner;

public class RectangleCollision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("직사각형의 왼쪽 상단 모서리 좌표 (x1, y1)를 입력하시오>>");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("직사각형의 오른쪽 하단 모서리 좌표 (x2, y2)를 입력하시오>>");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        // 주어진 직사각형의 좌표
        int givenRectX1 = 100, givenRectY1 = 100, givenRectX2 = 200, givenRectY2 = 200;

        // 충돌 확인
        boolean isColliding = !(x1 > givenRectX2 || x2 < givenRectX1 || y1 > givenRectY2 || y2 < givenRectY1);

        if (isColliding) {
            System.out.println("입력한 직사각형은 주어진 직사각형과 충돌합니다.");
        } else {
            System.out.println("입력한 직사각형은 주어진 직사각형과 충돌하지 않습니다.");
        }

        scanner.close();
    }
}
