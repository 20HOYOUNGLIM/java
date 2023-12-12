package ct12;

import javafx.concurrent.Task;

import javax.swing.*;
import java.awt.*;

public class No10 extends JFrame{
    public No10(){
        setTitle("그래픽 이미지 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        setSize(400, 400);
        setVisible(true);
    }
    class MyPanel extends JPanel{
        private ImageIcon icon = new ImageIcon("src/back.jpg");
        private Image image = icon.getImage();
        public void paintComponent(Graphics g){
            int widthDivide = this.getWidth() / 2;
            int heightDivide = this.getHeight() / 2;

            g.setClip(0, 0, widthDivide - 5, heightDivide - 5);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            g.setClip(getWidth() / 2 + 5, 0, widthDivide - 5, heightDivide - 5);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            g.setClip(0, getHeight() / 2 + 5, widthDivide - 5, heightDivide - 5);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);

            g.setClip(getWidth() / 2 + 5, getHeight() / 2 + 5, widthDivide - 5, heightDivide - 5);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
    public static void main(String[] args){
        new No10();
    }
}