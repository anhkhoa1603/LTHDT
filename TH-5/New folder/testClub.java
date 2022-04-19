public class testClub
{
    public static void main(String[] args)
    {
        Club a = new Club("Khoa", 5, 6, 2);
        Club b = new Club();
        Club c = new Club(a);

        System.out.println(a.getName());
        System.out.println(a.getWins());
        System.out.println(a.getDraws());
        System.out.println(a.getLosses());

        System.out.println(a);

        System.out.println("Num matched = " + a.numMatchesPlayed());
        if(a.isFinish())
        {
            System.out.println("Yes!");
        }
        else
        {
            System.out.println("No!");
        }

        System.out.println("Point: " + a.getPoint());
    }
}