public class Rectangle
{
    private float _width;
    private float _length;

    public float getWidth()
    {
        return this._width;
    }

    public float getLength()
    {
        return this._length;
    }

    public void setWidth(float width)
    {
        this._width = width;
    }

    public void setLength(float length)
    {
        this._length = length;
    }

    public Rectangle(float width, float length)
    {
        this.setWidth(width);
        this.setLength(length);
    }

    public Rectangle()
    {
        this(0, 0);
    }

    public Float Area()
    {
        return this._width * this._length;
    }

    public Float Perimeter()
    {
        return this._width + this._length;
    }

    @Override
    public String toString()
    {
        return "Rectangle[width: " + _width +", length: "+ _length +"]";
    }
}
