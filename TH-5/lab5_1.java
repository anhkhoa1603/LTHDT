import java.util.*;

public class lab5_1
{
    public static int findFirstEven(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                return a[i];
            }
        }
        return -1;
    }
    public static int findFirstOdd(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 1)
            {
                return a[i];
            }
        }
        return -1;
    }


    public static int maxEven(int[] a)
    {
        int max = findFirstEven(a);
        if(max == -1)
        {
            return -1;
        }

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0 && a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }
    public static int minOdd(int[] a)
    {
        int min = findFirstOdd(a);
        if(min == -1)
        {
            return -1;
        }

        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 1 && a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    public static int sumMEMO(int[] a)
    {
        int max = maxEven(a);
        int min = minOdd(a);
        return max + min;
    }

    public static int sumEven(int[] a)
    {
        int sum = 0;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                sum += a[i];
            }
        }
        return sum;
    }

    public static int prodOdd(int[] a)
    {
        int prod = 1;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 1)
            {
                prod *= a[i];
            }
        }
        return prod;
    }

    public static int idxFirstEven(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] % 2 == 0)
            {
                return i;
            }
        }
        return -1;
    }

    public static int idxLastOdd(int[] a)
    {
        for(int i = a.length - 1; i >= 0; i--)
        {
            if(a[i] % 2 == 1)
            {
                return i;
            }
        }
        return -1;
    }

    public static int[] input(int n)
    {
        int[] a = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        sc.close();
        return a;
    }


    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter n: ");
        int n = sc.nextInt();

        int[] a = input(n);

        System.out.println("Max Even = " + maxEven(a));
        System.out.println("Min Odd = " + minOdd(a));
        System.out.println("Sum MEMO = " + sumMEMO(a));
        System.out.println("Sum Even = " + sumEven(a));
        System.out.println("Product Odd = " + prodOdd(a));
        System.out.println("First Index Of Even = " + idxFirstEven(a));
        System.out.println("Last Index Of Odd = " + idxLastOdd(a));

        sc.close();
    }
}
