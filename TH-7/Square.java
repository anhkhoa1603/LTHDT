public class Square extends Rectangle
{
    public void setWidth(double side)
    {
        super._width = side;
    }
    public void setLength(double side)
    {
        super._length = side;
    }
    public void setSide(double side)
    {
        this.setWidth(side);
        this.setLength(side);
    }

    public double getSide()
    {
        return super._length;
    }

    public Square()
    {
        super();
        this.setSide(1.0);
    }
    public Square(double side, String color, boolean filled)
    {
        super.setColor(color);
        super.setFilled(filled);
        this.setSide(side);
    }

    @Override
    public boolean equals(Shape s)
    {
        if(s instanceof Square)
        {
            Square temp = (Square) s;
            if(super.getArea() == temp.getArea())
            {
                return true;
            }
        }
        return false;
    }
}
