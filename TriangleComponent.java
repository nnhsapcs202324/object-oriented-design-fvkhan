import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
public class TriangleComponent extends JComponent
{
    private static final int MAX_POINTS = 3;
    private int clickCount;
    private ArrayList<Point2D> points;
    public TriangleComponent()
    {
        MouseClick click = new MouseClick();
        this.addMouseListener(click);
    }
    
    public class MouseClick implements MouseListener
    {
        @Override
        public void mouseClicked(MouseEvent event)
        {
            System.out.println("Mouse clicked!");
            clickCount++;
            points = new ArrayList<Point>();
            if (clickCount == 1)
            {
                int x = event.getX();
                int y = event.getY();
                Point2D point = new Point2D();
                point.setLocation(x, y);
                points.add(point);
                repaint();
            }
            
            if (clickCount == 2)
            {
                int x = event.getX();
                int y = event.getY();
                Line2D line = new Line2D();
                
            }
        }
    }

    @Override
    public void paintComponent(Graphics g)
    {  
        super.paintComponent( g );
        Graphics2D g2 = (Graphics2D) g;

    }
}