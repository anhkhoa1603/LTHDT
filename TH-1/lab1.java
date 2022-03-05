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
    static int cau3(int x, int y)
    {
        return x%y;
    }
    static void cau4()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        float x;
        x = sc.nextInt();
        System.out.println("1. Convert the temperature from Fahrenheit to Celsius");
        System.out.println("2. Convert the temperature from Celsius to Fahrenheit");
        System.out.print("You choose: ");
        int n;
        double S;
        n = sc.nextInt();
        switch (n) {
            case 1:
                S = (x - 32) * (float)(5 / 9);
                System.out.println("Result: " + S);
                break;
            case 2:
                S = (x * 1.8) + 32.0;
                System.out.println("Result: " + S);
                break;
        }
    }
    static boolean cau5(int year)
    {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            return true;
        }
        else return false;
    }
    static void cau6()
    {
        Scanner sc = new Scanner(System.in);
        int x, y, z;

        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
        System.out.print("Enter z: ");
        z = sc.nextInt();

        int min = x;
        if (x > y && z > y)
        {
            min = y;
        }
        else if (x > z && y > z)
        {
            min = z;
        }

        System.out.println("Min = " + min);
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

        System.out.println("Cau 1:");
        cau1();

        System.out.println("Cau 2:");
        float base, height;
        System.out.print("Enter number of base: ");
        base = sc.nextFloat();
        System.out.print("Enter number of height: ");
        height = sc.nextFloat();
        System.out.println("Area = " + cau2(base, height));

        System.out.println("Cau 3:");
        int x, y;
        System.out.print("Enter x: ");
        x = sc.nextInt();
        System.out.print("Enter y: ");
        y = sc.nextInt();
        System.out.println("S = x % y = " + cau3(x, y));

        System.out.println("Cau 4:");
        cau4();
        
        System.out.println("Cau 5:");
        int year;
        System.out.println("Enter the year: ");
        year = sc.nextInt();
        if (cau5(year))
        {
            System.out.println(year + " is a leap year");    
        }
        else System.out.println(year + " is not a leap year");

        System.out.println("Cau 6:");
        cau6();

        System.out.println("Cau 8d:");
        int n;
        System.out.print("Enter n: ");
        n = sc.nextInt();
        float S = cau8d(n);
        System.out.println("S = " + S);

        System.out.println("Cau 9:");
        System.out.print("Enter n: ");
        n = sc.nextInt();
        cau9(n);

        System.out.println("Cau 10:");
        System.out.print("Enter n: ");
        n = sc.nextInt();
        System.out.print("S = " + cau10(n));
    }
}
