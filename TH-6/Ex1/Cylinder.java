public class Cylinder extends Circle
{
    private double _height;

    public double getHeight()
    {
        return this._height;
    }

    public void setHeight(double height)
    {
        this._height = height;
    }

    public Cylinder()
    {
        super();
        this.setHeight(1.0);
    }
    public Cylinder(double radius)
    {
        super(radius);
        this.setHeight(1.0);
    }
    public Cylinder(double radius, double height)
    {
        super(radius);
        this.setHeight(height);
    }
    public Cylinder(double radius, double height, String color)
    {
        super(radius, color);
        this.setHeight(height);
    }

    public double getVolume()
    {
        return super.getArea() * this._height;
    }

    @Override
    public String toString()
    {
        return "Cylinder[radius: "+this.getRadius()+", color: "+this.getColor()+", height: "+this._height+"]";
    }
}