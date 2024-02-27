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
    private int clickCount;
    private ArrayList<Point2D> points;
    private Point2D point1;
    private Point2D point2;
    private Point2D point3;
    private Ellipse2D ellipse;
    private Line2D line1;
    private Line2D line2;
    private Line2D line3;
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;
    
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
            while (clickCount < MAX_POINTS)
            {
                int num = clickCount + 1;
                System.out.println("Mouse clicked " + num + " times!");
                int x = event.getX();
                int y = event.getY();
                System.out.println("X coordinate: " + x + "; Y coordinate: " + y);
                Point2D.Double point = new Point2D.Double(x, y);
                points.add(point);
                clickCount++;
                
                if (clickCount == 1)
                {
                    point1 = points.get(0);
                    x1 = point1.getX();
                    y1 = point1.getY();
                    ellipse = new Ellipse2D.Double(x1, y1, 5, 5);
                }
                else if (clickCount == 2)
                {
                    point2 = points.get(1);
                    x2 = point2.getX();
                    y2 = point2.getY();
                    line1 = new Line2D.Double(x1, y1, x2, y2);
                }
                else if (clickCount == 3)
                {
                    point3 = points.get(2);
                    x3 = point3.getX();
                    y3 = point3.getY();
                    line2 = new Line2D.Double(x2, y2, x3, y3);
                    line3 = new Line2D.Double(x3, y3, x1, y1);
                }
                
                repaint();
            }
            if (clickCount == 4)
            {
                clickCount = 0;
                points.remove(0);
                points.remove(0);
                points.remove(0);
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
        g2.fill(this.ellipse);
        g2.fill(this.line1);
        g2.fill(this.line2);
        g2.fill(this.line3);
    }
}