import java.awt.Rectangle;
/**
 * computes area and perimeter of rectangle
 *
 * @fvkhan
 * @13feb2024
 */
public class BetterRectangle extends Rectangle
{
    private int height;
    private int width;
    private int x;
    private int y;
    public BetterRectangle(int height, int width, int x, int y)
    {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
        super.setSize(height, width);
        super.setLocation(x, y);
    }
    
    public int getArea()
    {
        int area = this.height * this.width;
        return area;
    }
    
    public int getPerimeter()
    {
        int perimeter = (this.height * 2) + (this.width * 2);
        return perimeter;
    }
}

