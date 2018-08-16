import javax.swing.*;
import java.awt.*;
import javax.swing.SwingUtilities;

/*https://docs.oracle.com/javase/tutorial/uiswing/layout/visual.html
  https://www.tutorialspoint.com/swing/swing_gridbaglayout.htm
  https://www.tutorialspoint.com/swing/swing_gridbaglayout.htm
  http://web.mit.edu/6.005/www/sp14/psets/ps4/java-6-tutorial/components.html
  https://docs.oracle.com/javase/tutorial/uiswing/components/textfield.html
  https://www.mortgagecalculator.org/
  https://docs.oracle.com/javase/tutorial/uiswing/components/combobox.html
 */

public class FinancialCalculatorGUI {

    FinancialCalculatorGUI(){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new MainFrame("Hello");
                frame.setSize(500,400);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });




    }

    public static void main(String[] args) {
        new FinancialCalculatorGUI();
    }

}