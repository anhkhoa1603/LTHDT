public class testEx1
{
    public static void main(String[] args)
    {
        Circle cir = new Circle();
        Circle cir1 = new Circle(5.6);
        Circle cir2 = new Circle(4.5, "blue");

        Cylinder cyl = new Cylinder();
        Cylinder cyl1 = new Cylinder(7.3);
        Cylinder cyl2 = new Cylinder(5.4, 4.7);
        Cylinder cyl3 = new Cylinder(4.5, 5.0, "green");

        System.out.println(cir.toString());
        System.out.println(cir1.toString());
        System.out.println(cir2.toString());

        System.out.println(cyl.toString());
        System.out.println(cyl1.toString());
        System.out.println(cyl2.toString());
        System.out.println(cyl3.toString());
    }
}
