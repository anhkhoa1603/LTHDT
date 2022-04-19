public class Circle extends Shape
{
    private double _radius;

    public double getRadius()
    {
        return this._radius;
    }

    public void setRadius(double radius)
    {
        this._radius = radius;
    }

    public Circle()
    {
        super();
        this.setRadius(1.0);
    }
    public Circle(double radius)
    {
        super();
        this.setRadius(radius);
    }
    public Circle(double radius, String color, boolean filled)
    {
        super(color, filled);
        this.setRadius(radius);
    }

    @Override
    public boolean equals(Shape s)
    {
        if(s instanceof Circle)
        {
            Circle temp = (Circle) s;
            if(this.getArea() == temp.getArea())
            {
                return true;
            }
        }
        return false;
    }

    @Override
    public double getArea()
    {
        return this._radius * this._radius * 3.14;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * this._radius * 3.14;
    }

    @Override
    public String toString()
    {
        return "Circle["+super.toString()+", radius: "+this._radius+"]";
    }
}
