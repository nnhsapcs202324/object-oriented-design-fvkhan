import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
public class TriangleComponent extends JComponent
{
    private static final int MAX_POINTS = 3;
    private int clickCount = 1;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private Ellipse2D ellipse;
    public TriangleComponent()
    {
        MouseClickListener mouseClickListener = new MouseClickListener();
        this.addMouseListener(mouseClickListener);
    }

    public class MouseClickListener implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent event)
        {
            if (clickCount == 1)
            {
                System.out.println("Mouse clicked " + clickCount + " times!");
                x1 = event.getX();
                y1 = event.getY();
                System.out.println("X coordinate: " + x1 + "; Y coordinate: " + y1);
                ellipse = new Ellipse2D.Double(x1, y1, 2, 2);
                clickCount++;
            }
            else if (clickCount == 2)
            {
                System.out.println("Mouse clicked " + clickCount + " times!");
                x2 = event.getX();
                y2 = event.getY();
                System.out.println("X coordinate: " + x2 + "; Y coordinate: " + y2);
                clickCount++;
            }
            else if (clickCount == 3)
            {
                System.out.println("Mouse clicked " + clickCount + " times!");
                x3 = event.getX();
                y3 = event.getY();
                System.out.println("X coordinate: " + x3 + "; Y coordinate: " + y3);
                clickCount++;
            }
            else
            {
                System.out.println("Mouse clicked " + clickCount + " times! Canvas will clear.");
                repaint();
                clickCount = 1;
            }
        }

        @Override
        public void mousePressed(MouseEvent event)
        {}

        @Override
        public void mouseExited(MouseEvent event)
        {}

        @Override
        public void mouseReleased(MouseEvent event)
        {}

        @Override
        public void mouseEntered(MouseEvent event)
        {}
    }
    @Override
    public void paintComponent(Graphics g)
    {  
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.BLACK);
        if (clickCount == 1)
        {
            g2.fill(this.ellipse);
        }
        else if (clickCount == 2)
        {
            g2.drawLine(x1, y1, x2, y2);
        }
        else if (clickCount == 3)
        {
            g2.drawLine(x2, y2, x3, y3);
            g2.drawLine(x3, y3, x1, x1);
        }
    }
}