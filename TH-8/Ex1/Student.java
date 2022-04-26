package Ex1;

public class Student extends Person
{
    private String _id;
    private int _score;

    public String getId()
    {
        return this._id;
    }
    public int getScore()
    {
        return this._score;
    }

    public void setId(String id)
    {
        this._id = id;
    }
    public void setScore(int score)
    {
        this._score = score;
    }

    public Student()
    {
        this.setId("A00");
        this.setScore(0);
    }
    public Student(String name, int birthYear, String id, int score)
    {
        super(name, birthYear);
        this.setId(id);
        this.setScore(score);
    }
    
    @Override
    public String toString()
    {
        return "Student["+super.toString()+", id: "+this._id+", score: "+this._score+"]";
    }
}
