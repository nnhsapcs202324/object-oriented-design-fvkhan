import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

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
    private JButton button;
    
    public ButtonViewer()
    {
        // 1. define and set up the UI components
        this.frame = new JFrame();
        this.panel = new JPanel();
        
        this.button = new JButton("Click me!");
        this.panel.add(this.button);
        
        this.frame.add(this.panel);
        
        // 2. create listener objects
        ClickListener  listener = new ClickListener();
        
        // 3. register listener objects with the component that generates events
        this.button.addActionListener(listener);
        
        
        this.frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    
    public static void main(String[] args)
    {
        ButtonViewer viewer = new ButtonViewer();
    }
}
