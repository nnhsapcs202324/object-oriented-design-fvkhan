public class TestBetterRectangle
{
    public static void main(String args[])
    {
        BetterRectangle rectangle1 = new BetterRectangle(50, 50, 3, 5);
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("X coordinate: " + rectangle1.getX());
        System.out.println("Y coordinate: " + rectangle1.getY());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
    }
}
