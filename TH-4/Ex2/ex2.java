public class ex2
{
    public static void main(String[] args)
    {
        float width = new Float(4.5);
        float length = new Float(5.5);

        Rectangle a = new Rectangle(width, length);

        System.out.println("Width: " + a.getWidth());
        System.out.println("Length: " + a.getLength());

        System.out.println(a);

        System.out.println("Area = " + a.Area());
        System.out.println("Perimeter = " + a.Perimeter());
    }
}
