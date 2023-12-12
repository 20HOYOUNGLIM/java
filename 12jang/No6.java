package ct12;

import java.awt.*;
import javax.swing.*;

public class No6 extends JFrame {
    public No6(){
        setTitle("격자 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setVisible(true);
        setSize(300, 300);
    }
    class MyPanel extends JPanel {
        public void paintComponent(Graphics g) {
            for (int i = 1; i < 10; i++) {
                g.setColor(Color.BLACK);
                g.drawLine(0, this.getHeight() / 10 * i, this.getWidth(), this.getHeight() / 10 * i);
            }
            for (int i = 1; i < 10; i++) {
                g.setColor(Color.BLACK);
                g.drawLine( this.getWidth() / 10 * i, 0,  this.getWidth() / 10 * i, this.getHeight());
            }
        }
    }

    static public void main(String[] args) {
        new No6();
    }
}