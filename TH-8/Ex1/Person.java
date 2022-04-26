package Ex1;

public class Person
{
    protected String _name;
    protected int _birthYear;

    public String getName()
    {
        return this._name;
    }
    public int getBirthYear()
    {
        return this._birthYear;
    }

    public void setName(String name)
    {
        this._name = name;
    }
    public void setBirthYear(int birthYear)
    {
        this._birthYear = birthYear;
    }

    public Person()
    {
        this.setName("");
        this.setBirthYear(2022);
    }
    public Person(String name, int birthYear)
    {
        this.setName(name);
        this.setBirthYear(birthYear);
    }

    @Override
    public String toString()
    {
        return "Person[name: "+this._name+", birth year: "+this._birthYear+"]";
    }
}