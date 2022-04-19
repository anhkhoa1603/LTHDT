public class Point2D
{
    private float _x;
    private float _y;

    public float getX()
    {
        return this._x;
    }

    public float getY()
    {
        return this._y;
    }

    public void setX(float x)
    {
        this._x = x;
    }

    public void setY(float y)
    {
        this._y = y;
    }

    public Point2D(float x, float y)
    {
        this.setX(x);
        this.setY(y);
    }

    public Point2D()
    {
        this(0, 0);
    }
}
