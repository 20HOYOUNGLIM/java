package ct12;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

public class No2 extends JFrame {
	No2(){
        setTitle("이미지 위에 원 드래깅 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(300,300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        ImageIcon icon = new ImageIcon("src/back.jpg");
        Image img = icon.getImage();
        Point point;
        public MyPanel() {
            setLayout(new FlowLayout());
            addMouseMotionListener(new MouseAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    super.mouseDragged(e);
                    point = e.getPoint();
                    repaint();
                }

            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            if (point != null) {
                g.setColor(Color.GREEN);
                g.fillOval((int) point.getX(), (int)point.getY(), 20, 20);
            }
        }
    }

    static public void main(String[] args) {
        new No2();
    }
}