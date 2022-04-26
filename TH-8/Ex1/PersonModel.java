package Ex1;
import java.util.ArrayList;

public class PersonModel<T>
{
    private ArrayList <T> al = new ArrayList <T> ();
    public void add(T obj)
    {
        al.add(obj);
    }

    public void display()
    {
        for (T obj : al)
        {
            System.out.println(obj);
        }
    }

    public static void main(String[] args)
    {
        PersonModel <Student> s = new PersonModel <Student> ();
        s.add(new Student("Khoa", 2003, "A001", 9));
        s.add(new Student("Hao", 2003, "A002", 8));

        s.display();

        PersonModel <Employee> e = new PersonModel <Employee> ();
        e.add(new Employee("Khoa", 2003, "A001", 9000));
        e.add(new Employee("Hao", 2003, "A002", 800));

        e.display();
    }
}
