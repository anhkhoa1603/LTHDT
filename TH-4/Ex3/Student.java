public class Student
{
    private int _id;
    private String _firstName;
    private String _lastName;

    public int getId()
    {
        return this._id;
    }
    public String getFirstName()
    {
        return this._firstName;
    }
    public String getLastName()
    {
        return this._lastName;
    }

    public void setId(int id)
    {
        this._id = id;
    }
    public void setFirstName(String firstName)
    {
        this._firstName = firstName;
    }
    public void setLastName(String lastName)
    {
        this._lastName = lastName;
    }

    public Student(int id, String firstName, String lastName)
    {
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getName()
    {
        return this._firstName + " " + this._lastName;
    }

    @Override
    public String toString()
    {
        return "Student[id = " + _id +", firstName = " + _firstName + ", lastName = " + _lastName + "]";
    }
}
