public class House
{
    private String _houseCode;
    private int _numOfBedRoom;
    private boolean _hasSwimmingPool;
    private double _area;
    private double _costPerSquareMeter;


    public String getHC()
    {
        return this._houseCode;
    }
    public int getNOBR()
    {
        return this._numOfBedRoom;
    }
    public boolean getHSP()
    {
        return this._hasSwimmingPool;
    }
    public double getArea()
    {
        return this._area;
    }
    public double getCPSM()
    {
        return this._costPerSquareMeter;
    }


    public void setHC(String houseCode)
    {
        this._houseCode = houseCode;
    }
    public void setNOBR(int numOfBedRoom)
    {
        this._numOfBedRoom = numOfBedRoom;
    }
    public void setHSP(boolean hasSwimmingPool)
    {
        this._hasSwimmingPool = hasSwimmingPool;
    }
    public void setArea(double area)
    {
        this._area = area;
    }
    public void setCPSM(double costPerSquareMeter)
    {
        this._costPerSquareMeter = costPerSquareMeter;
    }


    public House(String houseCode, int numOfBedRoom, boolean hasSwimmingPool, double area, double costPerSquareMeter)
    {
        this.setHC(houseCode);
        this.setNOBR(numOfBedRoom);
        this.setHSP(hasSwimmingPool);
        this.setArea(area);
        this.setCPSM(costPerSquareMeter);
    }
    public House()
    {
        this("A01", 2, false, 0, 0);
    }


    public double calculateSellingPrice()
    {
        double SubTotal;
        boolean HSP = this._hasSwimmingPool;
        double area = this._area;
        double CPSM = this._costPerSquareMeter;

        SubTotal = area * CPSM;
        if (HSP)
        {
            SubTotal += SubTotal/10;
        }

        SubTotal = SubTotal + SubTotal * 0.15;

        return SubTotal;
    }


    @Override
    public String toString()
    {
        return "House["+ _houseCode +", " + _numOfBedRoom +", "+ _hasSwimmingPool +", "+ _area +", "+ _costPerSquareMeter +"]";
    }
}
