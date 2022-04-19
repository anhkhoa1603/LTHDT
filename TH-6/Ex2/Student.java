public class Student extends Person
{
    private String _program;
    private String _year;
    private double _fee;

    public String getProgram()
    {
        return this._program;
    }
    public String getYear()
    {
        return this._year;
    }
    public double getFee()
    {
        return this._fee;
    }

    public void setProgram(String program)
    {
        this._program = program;
    }
    public void setYear(String year)
    {
        this._year = year;
    }
    public void setFee(double fee)
    {
        this._fee = fee;
    }

    public Student(String name, String address, String program, String year, double fee)
    {
        super(name, address);
        this.setProgram(program);
        this.setYear(year);
        this.setFee(fee);
    }

    @Override
    public String toString()
    {
        return "Person:[name: "+super._name+", address: "+super._address+", program, "+this._program+", year: "+this._year+", fee: "+this._fee+"]";
    }
}
