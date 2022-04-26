package Ex1;

public class Employee extends Person
{
    private String _id;
    private int _salary;

    public String getId()
    {
        return this._id;
    }
    public int getScore()
    {
        return this._salary;
    }

    public void setId(String id)
    {
        this._id = id;
    }
    public void setSalary(int salary)
    {
        this._salary = salary;
    }

    public Employee()
    {
        this.setId("A00");
        this.setSalary(0);
    }
    public Employee(String name, int birthYear, String id, int salary)
    {
        super(name, birthYear);
        this.setId(id);
        this.setSalary(salary);
    }

    @Override
    public String toString()
    {
        return "[Employee["+super.toString()+", id: "+this._id+", score: "+this._salary+"]";
    }
}
