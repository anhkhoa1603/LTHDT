abstract class Shape
{
    protected String _color;
    protected boolean _filled;

    public String getColor()
    {
        return this._color;
    }
    public boolean getFilled()
    {
        return this._filled;
    }

    public void setColor(String color)
    {
        this._color = color;
    }
    public void setFilled(boolean filled)
    {
        this._filled = filled;
    }

    public Shape()
    {
        this.setColor("red");
        this.setFilled(true);
    }
    public Shape(String color, boolean filled)
    {
        this.setColor(color);
        this.setFilled(filled);
    }

    abstract boolean equals(Shape s);
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString()
    {
        return "Shape[color: "+this._color+", filled: "+this._filled+"]";
    }
}