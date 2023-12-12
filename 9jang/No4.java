package ct9;

import javax.swing.*;
import java.awt.*;

public class No4 extends JFrame {
	No4(){
        Color[] colorArr= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA,
                Color.GRAY, Color.PINK, Color.LIGHT_GRAY};
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("BorderLayout Practice");
        Container c = getContentPane();
        c.setLayout(new GridLayout(1,10));

        for(int i=0; i<10; i++) {
            JButton btn = new JButton(Integer.toString(i));
            btn.setOpaque(true);
            btn.setBackground(colorArr[i]);
            btn.setBorderPainted(false);
            c.add(btn);
        }
        setSize(600, 300);
        setVisible(true);
    }
    public static void main(String args[]){
        new No4();
    }
}