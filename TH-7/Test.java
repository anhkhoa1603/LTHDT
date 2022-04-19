public class Test
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(4, "Red", true);
        shapes[1] = new Rectangle(8, 4, "Blue", true);
        shapes[2] = new Square(10, "Black", true);
        shapes[3] = new Circle(9);
        shapes[4] = new Rectangle(12, 8, "Blue", true);

        System.out.println(shapes[0].equals(shapes[3]));
        System.out.println(shapes[1].equals(shapes[4]));
        System.out.println(shapes[2].equals(shapes[4]));

        System.out.println(shapes[0].getArea());
        System.out.println(shapes[1].getArea());
        System.out.println(shapes[2].getArea());
        System.out.println(shapes[3].getArea());
        System.out.println(shapes[4].getArea());

        System.out.println(shapes[0].getPerimeter());
        System.out.println(shapes[1].getPerimeter());
        System.out.println(shapes[2].getPerimeter());
        System.out.println(shapes[3].getPerimeter());
        System.out.println(shapes[4].getPerimeter());

        System.out.println(shapes[0].toString());
        System.out.println(shapes[1].toString());
        System.out.println(shapes[2].toString());
        System.out.println(shapes[3].toString());
        System.out.println(shapes[4].toString());
    }
}
