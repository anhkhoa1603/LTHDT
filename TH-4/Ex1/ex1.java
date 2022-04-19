public class Lab4
{
    public static void main(String[] args)
    {
        Float x = new Float(4.5);
        Float y = new Float(5.8);

        Point2D a = new Point2D(x, y);
        Point2D a1 = new Point2D();

        System.out.println("X = " + a.getX());
        System.out.println("Y = " + a.getY());

        System.out.println("X = " + a1.getX());
        System.out.println("Y = " + a1.getY());
    }
}
