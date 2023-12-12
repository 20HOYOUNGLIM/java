package ct12;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class No8 extends JFrame{
    class Circle{
        Point center, start;
        int radius;
        Circle(Point point){
            center = point;
        }
        void centerPosition(){
            int x, y;
            x = (start.x - center.x) * (start.x - center.x);
            y = (start.y - center.y) * (start.y - center.y);
            radius = (int)Math.sqrt(x + y);
        }
    }
    Circle nCircle;
    No8(){
        setTitle("마우스로 원 그리기");
        setDefaultCloseOperation(3);
        Container c = getContentPane();
        c.add(new MyPanel());
        setSize(1000, 500);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        Vector<Circle> vector = new Vector<Circle>(); //Vector를 통해 그려졌던 모든 Circle 기억
        public MyPanel(){
            addMouseListener(new MyMouseListener());
            addMouseMotionListener(new MyMouseListener());
        }
        public void paintComponent(Graphics g){
            for(int i = 0; i < vector.size(); i++){
                Circle drawCircle = vector.elementAt(i);
                g.setColor(Color.MAGENTA);
                g.drawOval(drawCircle.start.x - drawCircle.radius / 2,
                        drawCircle.start.y - drawCircle.radius/2,
                        drawCircle.radius, drawCircle.radius);
            }
        }
        class MyMouseListener extends MouseAdapter {
            public void mousePressed(MouseEvent e) {
                nCircle = new Circle(e.getPoint());
            }
            public void mouseDragged(MouseEvent e) {
                nCircle.start = e.getPoint();
                nCircle.centerPosition();
                vector.add(nCircle);
                repaint();
            }
        }
    }
    public static void main(String[] args){
        new No8();
    }
}