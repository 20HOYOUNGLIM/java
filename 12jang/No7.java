package ct12;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class No7 extends JFrame {
    public No7(){
        super("마우스로 페다각형 그리기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new MyPanel());
        
        setSize(300,300);
        setVisible(true);
    }

    class MyPanel extends JPanel {
        Vector<Integer> x = new Vector<Integer>();
        Vector<Integer> y = new Vector<Integer>();

        public MyPanel() {
            addMouseListener(new MouseAdapter() {
                public void mousePressed(MouseEvent e) {
                    x.add(e.getX());
                    y.add(e.getY());
                    repaint();
                }
            });
        }

        public void paintComponent(Graphics g) {
            int xArr [] = new int [x.size()];
            int yArr [] = new int [y.size()];

            for(int i=0; i<x.size(); i++) {
                xArr[i] = x.get(i);
                yArr[i] = y.get(i);
            }
            g.setColor(Color.MAGENTA);
            g.drawPolygon(xArr, yArr, xArr.length);
        }
    }

    static public void main(String[] args) {
        new No7();
    }
}