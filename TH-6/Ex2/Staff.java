public class Staff extends Person
{
    private String _school;
    private double _pay;

    public String getSchool()
    {
        return this._school;
    }
    public double getPay()
    {
        return this._pay;
    }

    public void setSchool(String school)
    {
        this._school = school;
    }
    public void setPay(double pay)
    {
        this._pay = pay;
    }

    public Staff(String name, String address, String school, double pay)
    {
        super(name, address);
        this.setSchool(school);
        this.setPay(pay);
    }

    @Override
    public String toString()
    {
        return "Person:[name: "+super._name+", address: "+super._address+", school: "+this._school+", pay: "+this._pay+"]";
    }
}
