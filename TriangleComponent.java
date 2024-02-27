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
    private ArrayList<Point2D> points;
    private Point2D point1;
    private Point2D point2;
    private Point2D point3;
    private Ellipse2D ellipse;
    private Line2D line1;
    private Line2D line2;
    private Line2D line3;
    private double x1;
    private double y1;

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
            points = new ArrayList<Point2D>();
            if (clickCount == 1)
            {
                int num = clickCount;
                System.out.println("Mouse clicked " + num + " times!");
                int x = event.getX();
                int y = event.getY();
                System.out.println("X coordinate: " + x + "; Y coordinate: " + y);
                Point2D.Double point = new Point2D.Double(x, y);
                point1 = point;
                points.add(point);
                x1 = x;
                y1 = y;
                ellipse = new Ellipse2D.Double(x1, y1, 5, 5);
                repaint();
                clickCount++;
            }
            else if (clickCount == 2)
            {
                int num = clickCount;
                System.out.println("Mouse clicked " + num + " times!");
                int x = event.getX();
                int y = event.getY();
                System.out.println("X coordinate: " + x + "; Y coordinate: " + y);
                Point2D.Double point = new Point2D.Double(x, y);
                point2 = point;
                points.add(point);
                line1 = new Line2D.Double(point1, point2);
                repaint();
                clickCount++;
            }
            else if (clickCount == 3)
            {
                int num = clickCount;
                System.out.println("Mouse clicked " + num + " times!");
                int x = event.getX();
                int y = event.getY();
                System.out.println("X coordinate: " + x + "; Y coordinate: " + y);
                Point2D.Double point = new Point2D.Double(x, y);
                points.add(point);
                point3 = point;
                line2 = new Line2D.Double(point2, point3);
                line3 = new Line2D.Double(point3, point1);
                repaint();
                clickCount++;
            }
            
            else if (clickCount == 4)
            {
                int num = clickCount;
                System.out.println("Mouse clicked " + num + " times! Canvas will clear.");
                clickCount = 1;
                points.remove(0);
                points.remove(0);
                points.remove(0);
                repaint();
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
            g2.fill(this.line1);
        }
        else if (clickCount == 3)
        {
            g2.fill(this.line2);
            g2.fill(this.line3);
        }
    }
}