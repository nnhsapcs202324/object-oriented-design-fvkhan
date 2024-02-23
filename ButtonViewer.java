import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * this class demonstrates how to install an an action listener in a GUI app
 *
 * @author fvkhan
 * @version 22jan2024
 */

public class ButtonViewer
{
    private final int FRAME_WIDTH = 400;
    private final int FRAME_HEIGHT = 100;

    private JFrame frame;
    private JPanel panel;
    private JButton buttonA;
    private JButton buttonB;
    private JLabel label;
    
    private int clickCountA;
    private int clickCountB;
    public ButtonViewer()
    {
        this.clickCountA = 0;
        this.clickCountB = 0;
        
        // 1. define and set up the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();

        this.buttonA = new JButton("Click me!");
        this.panel.add(this.buttonA);
        
        this.buttonB = new JButton("No, click me!");
        this.panel.add(this.buttonB);

        this.frame.add(this.panel);
        this.label = new JLabel("0 clicks");
        this.panel.add(this.label);

        // 2. create listener objects
        ClickListener  listener = new ClickListener();

        // 3. register listener objects with the component that generates events
        this.buttonA.addActionListener(listener);
        this.buttonB.addActionListener(listener);

        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }

    public class ClickListener implements ActionListener
    {
        @Override
        public void actionPerformed(ActionEvent event)
        {
            // 4. handle events generated from components or otherwise
            if (event.getSource() == buttonA)
            {
                clickCountA++;
            }
            else if (event.getSource() == buttonB)
            {
                clickCountB++;
            }
            label.setText("Button A: " + clickCountA + " clicks; Button B: " + clickCountB); 
        }
    }

    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
