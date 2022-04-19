public class Rectangle extends Shape
{
    protected double _width;
    protected double _length;

    public double getWidth()
    {
        return this._width;
    }
    public double getLength()
    {
        return this._length;
    }

    public void setWidth(double width)
    {
        this._width = width;
    }
    public void setLength(double length)
    {
        this._length = length;
    }

    public Rectangle()
    {
        super();
        this.setWidth(1.0);
    }
    public Rectangle(double width, double length, String color, boolean filled)
    {
        super(color, filled);
        this.setWidth(width);
        this.setLength(length);
    }

    @Override
    public boolean equals(Shape s)
    {
        if(s instanceof Rectangle)
        {
            Rectangle temp = (Rectangle) s;
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
        return this._width * this._length;
    }

    @Override
    public double getPerimeter()
    {
        return (this._width + this._length) * 2;
    }

    @Override
    public String toString()
    {
        return "Rectangle["+super.toString()+", width: "+this._width+", length: "+this._length+"]";
    }
}
