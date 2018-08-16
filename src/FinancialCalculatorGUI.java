import javax.swing.*;
import java.awt.*;

public class FinancialCalculatorGUI {
    JFrame f;
    FinancialCalculatorGUI(){
        f = new JFrame("F"); // Makes the big frame
        JTextArea ta = new JTextArea(200,200);
        JPanel p1 = new JPanel();
        JButton b1 = new JButton("Button 1");
        JButton b2 = new JButton("Button 2");
        JButton b3 = new JButton("Button 3");
        p1.add(ta);
        p1.add(b1);
        JPanel p2 = new JPanel();
        p2.add(ta);
        p2.add(b2);
        JPanel p3 = new JPanel();
        p3.add(ta);
        p3.add(b3);
        JTabbedPane tb = new JTabbedPane();
        tb.setBounds(50,50,200,200);
        tb.add("what",p1);
        tb.add("the", p2);
        tb.add("f",p3);
        f.add(tb);
        f.setSize(400,400);
        f.setLayout(new GridLayout(1,1));
        f.setVisible(true);


    }

    public static void main(String[] args) {
        new FinancialCalculatorGUI();
    }

}