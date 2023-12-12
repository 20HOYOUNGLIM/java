package ct10;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*;

class No2 extends JFrame{
	 No2(){
        setTitle("드래깅동안 Yellow");
        setDefaultCloseOperation(3);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(Color.GREEN);
        c.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e){
                Container temp = (Container) e.getSource();
                temp.setBackground(Color.YELLOW);
            }
            public void mouseReleased(MouseEvent e){
                Container temp = (Container) e.getSource();
                temp.setBackground(Color.GREEN);
            }
        });
        setSize(300, 200);
        setVisible(true);
    }
    public static void main(String args[]){
        new  No2();
    }
}