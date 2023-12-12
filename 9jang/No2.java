package ct9;

import javax.swing.*;
import java.awt.*;

public class No2 extends JFrame {
	No2(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("BorderLayout Practice");
        setSize(400, 200);

        Container c = getContentPane();
        c.setLayout(new BorderLayout(5,7)); //수평 수직 간격 (gap)

        c.add(new JButton("North"), BorderLayout.NORTH);
        c.add(new JButton("West"), BorderLayout.WEST);
        c.add(new JButton("Center"), BorderLayout.CENTER);
        c.add(new JButton("East"), BorderLayout.EAST);
        c.add(new JButton("South"), BorderLayout.SOUTH);
        setVisible(true);
    }
    public static void main(String args[]){
        new No2();
    }
}