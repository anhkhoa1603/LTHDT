public class Club
{
    private String _name;
    private int _wins;
    private int _draws;
    private int _losses;

    public String getName()
    {
        return this._name;
    }
    public int getWins()
    {
        return this._wins;
    }
    public int getDraws()
    {
        return this._draws;
    }
    public int getLosses()
    {
        return this._losses;
    }

    public void setName(String name)
    {
        this._name = name;
    }
    public void setWins(int wins)
    {
        this._wins = wins;
    }
    public void setDraws(int draws)
    {
        this._draws = draws;
    }
    public void setLosses(int losses)
    {
        this._losses = losses;
    }

    public Club(String name, int wins, int draws, int losses)
    {
        this.setName(name);
        this.setWins(wins);
        this.setDraws(draws);
        this.setLosses(losses);
    }
    public Club()
    {
        this("", 0, 0, 0);
    }
    public Club(Club club)
    {
        this._name = club._name;
        this._wins = club._wins;
        this._draws = club._draws;
        this._losses = club._losses;
    }

    public int numMatchesPlayed()
    {
        return this._wins + this._draws + this._losses;
    }
    public boolean isFinish()
    {
        if(this.numMatchesPlayed() >= 10)
        {
            return true;
        }
        else return false;
    }
    public int getPoint()
    {
        return this._wins * 3 + this._draws * 1 + this._losses * 0;
    }

    @Override
    public String toString()
    {
        return this._name + ": " + this._wins + "/" + this._draws + "/" + this._losses;
    }
}