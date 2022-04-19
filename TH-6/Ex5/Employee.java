import javax.lang.model.util.ElementScanner6;

public class Employee
{
    protected String _id;
    protected String _fullName;
    protected int _yearJoined;
    protected double _coefficientsSalary;
    protected int _numDaysOff;

    public String getId()
    {
        return this._id;
    }
    public String getFullName()
    {
        return this._fullName;
    }
    public int getYearJoined()
    {
        return this._yearJoined;
    }
    public double getCoefficientsSalary()
    {
        return this._coefficientsSalary;
    }
    public int getNumDaysOff()
    {
        return this._numDaysOff;
    }

    public void setId(String id)
    {
        this._id = id;
    }
    public void setFullName(String fullName)
    {
        this._fullName = fullName;
    }
    public void setYearJoined(int yearJoined)
    {
        this._yearJoined = yearJoined;
    }
    public void setCoefficientsSalary(double coefficientsSalary)
    {
        this._coefficientsSalary = coefficientsSalary;
    }
    public void setNumDaysOff(int numDaysOff)
    {
        this._numDaysOff = numDaysOff;
    }

    public Employee()
    {
        this("0", "", 2020, 1.0, 0);
    }
    public Employee(String id, String fullName, double coefficientsSalary)
    {
        this.setId(id);
        this.setFullName(fullName);
        this.setCoefficientsSalary(coefficientsSalary);
        this.setYearJoined(2020);
        this.setNumDaysOff(0);
    }
    public Employee(String id, String fullName, int yearJoined, double coefficientsSalary, int numDaysOff)
    {
        this.setId(id);
        this.setFullName(fullName);
        this.setNumDaysOff(numDaysOff);
        this.setCoefficientsSalary(coefficientsSalary);
        this.setYearJoined(yearJoined);
    }



    public double getSenioritySalary()
    {
        int currentYear =  Calendar.getInstance().get(Calendar.YEAR);

        if (currentYear - this._yearJoined >= 5)
        {
            return (currentYear - this._yearJoined) * 1150 / 100;
        }

        return 0;
    }


    public String considerEmulation()
    {
        if (this._numDaysOff <= 1)
        {
            return "A";
        }
        else if (this._numDaysOff <= 3)
        {
            return "B";
        }
        else
        {
            return "C";
        }
    }


    public double getSalary()
    {
        double salary = 1150;

        double eC;
        if (considerEmulation().equals("A"))
        {
            eC = 1;
        }
        else if (considerEmulation().equals("B"))
        {
            eC = 0.75;
        }
        else
        {
            eC = 0.5;
        }

        salary += 1150 * (eC + this._coefficientsSalary);
        return salary + getSenioritySalary();
    }

    
}
