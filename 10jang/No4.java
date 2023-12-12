package ct10;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*;

class No4 extends JFrame{
	No4(){
        setTitle("Left 키로 문자열 교체");
        setDefaultCloseOperation(3);
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel label = new JLabel("Love Java");
        c.addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_LEFT){
                    String text = label.getText();
                    label.setText(text.substring(1) + text.substring(0, 1));
                }
            }
        });
        c.add(label);
        c.setFocusable(true);
        c.requestFocus();
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String args[]){
        new No4();
    }
}