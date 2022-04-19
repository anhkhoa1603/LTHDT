public class ex3
{
    public static void main(String[] args)
    {
        int id = 123;
        String firstName = new String("Khoa");
        String lastName = new String("Truong");

        Student a = new Student(id, firstName, lastName);

        System.out.println("Id: " + a.getId());
        System.out.println("First Name: " + a.getFirstName());
        System.out.println("Last Name: " + a.getLastName());

        System.out.println(a);

        System.out.println("Full Name: " + a.getName());
    }
}
