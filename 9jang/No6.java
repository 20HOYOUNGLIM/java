package ct9;

import javax.swing.*;
import java.awt.*;

public class No6 extends JFrame {
	No6(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Random Labels");
        Container c = getContentPane();
        c.setLayout(null);

        for (int i = 0; i < 20; i++) {
            JLabel lbl = new JLabel(Integer.toString(i));
            int x = (int) (Math.random() * 200) + 50;
            int y = (int) (Math.random() * 200) + 50;
            lbl.setLocation(x, y);
            lbl.setSize(10, 10);
            lbl.setOpaque(true);
            lbl.setBackground(Color.BLUE);
            c.add(lbl);
        }
        setSize(400, 300);
        setVisible(true);
    }
    public static void main(String args[]){
        new No6();
    }
}