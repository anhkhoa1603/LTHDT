public class Circle
{
    protected double _radius;
    protected String _color;

    public double getRadius()
    {
        return this._radius;
    }
    public String getColor()
    {
        return this._color;
    }

    public void setRadius(double radius)
    {
        this._radius = radius;
    }
    public void setColor(String color)
    {
        this._color = color;
    }

    public Circle()
    {
        this(1.0, "red");
    }
    public Circle(double radius)
    {
        this.setRadius(radius);
        this.setColor("red");
    }
    public Circle(double radius, String color)
    {
        this.setRadius(radius);
        this.setColor(color);
    }

    public double getArea()
    {
        return this._radius * this._radius * 3.14;
    }

    @Override
    public String toString()
    {
        return "Circle[radius: "+this._radius+", color: "+this._color+"]";
    }
}
