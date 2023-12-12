package ct7;

import java.util.*;

abstract class Shape {
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj) { next = obj; } //링크 연결
    public Shape getNext() { return next; }
    public abstract void draw();
}
class Line extends Shape {
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Circle");
    }
}

public class No10 {
    public static void main(String[] args) {
        System.out.println("그래픽 에디터 beauty를 실행합니다.");
        Vector<Shape> ve = new Vector<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            int input = sc.nextInt();
            if(input == 1){
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                int input1 = sc.nextInt();
                if(input1 == 1){
                    ve.add(new Line());
                }
                else if(input1 == 2){
                    ve.add(new Rect());
                }
                else if(input1 == 3){
                    ve.add(new Circle());
                }
                else {

                }
            }
            else if(input == 2){
                System.out.print("삭제할 도형의 위치 >>");
                int input1 = sc.nextInt();
                if(ve.size() > input1){
                    if(ve.get(input1) == null){
                        System.out.println("삭제할 수 없습니다.");
                    }
                    else{
                        ve.remove(input1);
                    }
                }
                else{
                    System.out.println("삭제할 수 없습니다.");
                }

            }
            else if(input == 3){
                for(int i = 0; i < ve.size(); i++){
                    ve.get(i).draw();
                }
            }
            else{
                break;
            }
        }
    }
}