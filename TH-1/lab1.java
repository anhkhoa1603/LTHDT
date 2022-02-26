import java.util.*;

public class lab1
{

    static void cau1()
    {
        System.out.println("Truong Duc Anh Khoa");
        System.out.println("01/06/2003");
        System.out.println("521H0459");
    }
    static float cau2(float x, float y)
    {
        float S;
        S = (x*y)/(float)2.0;
        return S;
    }
    static boolean cau5(int year)
    {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            return true;
        }
        else return false;
    }
    static float cau8d(int n)
    {
        float S = 0;
        for(int i = 1; i <= n; i++)
        {
            S += 1.0/(2*(float)i);
        }
        return S;
    }
    static void cau9(int n)
    {
        int S;
        if(n>0)
        {
            do
            {
                if (n % 2 == 0)
                {
                    S = n/2;
                    System.out.println(n + " is even, so we take n/2: " + S);
                    n /= 2;
                }
                else
                {
                    S = n * 3 + 1;
                    System.out.println(n + " is odd, so we take 3*n+1: " + S);
                    n = n * 3 + 1;
                }
            } while (n != 1);
        }
    }
    static int cau10(int n)
    {
        int l_digit;
        l_digit = n % 10;
        do
        {
            n /= 10;
        } while (n >= 10);
        return n + l_digit;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        cau1();

        float base, height;
        System.out.print("Enter number of base: ");
        base = sc.nextFloat();
        System.out.print("Enter number of height: ");
        height = sc.nextFloat();
        System.out.println("Area = " + cau2(base, height));
        
        int year;
        System.out.print("Enter the year: ");
        year = sc.nextInt();
        if (cau5(year))
        {
            System.out.println(year + " is a leap year");    
        }
        else System.out.println(year + " is not a leap year");

        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        float S = cau8d(n);
        System.out.println("S = " + S);

        System.out.print("Enter n: ");
        n = sc.nextInt();
        cau9(n);

        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.print("S = " + cau10(n));
    }
}
