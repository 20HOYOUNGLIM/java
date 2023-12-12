package ct12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class No4 extends JFrame {
    int imgWidth;
    int imgHeight;
    Point startPoint = new Point(0,0);
    Point endPoint = new Point(0,0);
    public No4(){
        setTitle("이미지 레이블 드래깅 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(300,300);
        setVisible(true);
    }

    class MyPanel extends JPanel{
        Image img;
        ImageIcon icon;

        MyPanel(){
            icon = new ImageIcon("src/apple.jpg");
            img = icon.getImage();
            imgWidth = img.getWidth(this);
            imgHeight = img.getHeight(this);
            addMouseListener(new MyMouseListener());
            addMouseMotionListener(new MyMouseListener());
        }
        public void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(img, (int)startPoint.getX(), (int)startPoint.getY(), icon.getIconWidth(), icon.getIconHeight(), this);
            endPoint.setLocation(startPoint.getX() + imgWidth, startPoint.getY() + imgHeight);
        }
    }


    class MyMouseListener extends MouseAdapter {
        Point startP = new Point(50 ,50 );
        public void mousePressed(MouseEvent e) {
            startP = e.getPoint();
        }

        public void mouseReleased(MouseEvent e) {
            Point endP = e.getPoint();
            Component la = (JComponent)(e.getSource());
            Point p = la.getLocation();
            la.setLocation(p.x + endP.x - startP.x, p.y + endP.y - startP.y);
            la.getParent().repaint();
        }

        public void mouseDragged(MouseEvent e) {
            Point endP = e.getPoint();
            Component la = (JComponent)(e.getSource());
            Point p = la.getLocation();
            la.setLocation(p.x + endP.x - startP.x, p.y + endP.y - startP.y);
            la.getParent().repaint();
        }
    }

    static public void main(String[] args) {
        new No4();
    }
}
