import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;


public class MainFrame extends JFrame {
    public MainFrame(String title)
    {
        super(title);

        // Set layout manager
        setLayout(new BorderLayout());


        //Create Swing component
        final JTextArea textArea = new JTextArea();
        JButton button = new JButton("click me");

        // Add swing components to content pane
        Container c = getContentPane();
        c.add(textArea, BorderLayout.CENTER);
        c.add(button,BorderLayout.SOUTH);

        // Add behaviour
        button.addActionListener(new Action() {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.append("Hello\n");
            }
        });
    }
}
