package ct9;

import javax.swing.*;
import java.awt.*;

public class No5 extends JFrame {
	No5(){
        Color[] colorArr= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA,
                Color.GRAY, Color.PINK, Color.LIGHT_GRAY,
                Color.WHITE, Color.DARK_GRAY, Color.BLACK, Color.ORANGE,
                Color.BLUE, Color.MAGENTA};
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("BorderLayout Practice");
        Container c = getContentPane();
        c.setLayout(new GridLayout(4,4));

        for(int i=0; i<16; i++) {
            JLabel lbl = new JLabel(Integer.toString(i));
            lbl.setOpaque(true);
            lbl.setBackground(colorArr[i]);
            c.add(lbl);
        }
        setSize(600, 300);
        setVisible(true);
    }
    public static void main(String args[]){
        new No5();
    }
}