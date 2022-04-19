public class Person
{
    protected String _name;
    protected String _address;

    public String getName()
    {
        return this._name;
    }
    public String getAddress()
    {
        return this._address;
    }

    public void setName(String name)
    {
        this._name = name;
    }
    public void setAddress(String address)
    {
        this._address = address;
    }

    public Person(String name, String address)
    {
        this.setName(name);
        this.setAddress(address);
    }

    @Override
    public String toString()
    {
        return "Person:[name: "+this._name+", address: "+this._address+"]";
    }
}
