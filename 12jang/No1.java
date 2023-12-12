package ct12;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class No1 extends JFrame {
	No1(){
        setTitle("이미지 그리기 연습");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());

        setSize(300,300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        ImageIcon icon = new ImageIcon("src/back.jpg");
        Image img = icon.getImage();
        JButton button = new JButton("Hide/Show");
        boolean isHide = true;

        public MyPanel() {
            setLayout(new FlowLayout());
            add(button);
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(isHide){
                        isHide = false;
                    }else{
                        isHide = true;
                    }
                    MyPanel.this.repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            if(!isHide){
                g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
            }
        }
    }

    static public void main(String[] args) {
        new No1();
    }
}