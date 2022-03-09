import java.util.*;
import java.math.BigDecimal;

public class lab2
{
    static int cau1(int[] arr)
    {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    static int cau2(int[] arr)
    {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if (arr[i] < min)
            {
                min = arr[i];
            }
        }
        return min;
    }

    static int cau3(int arr[])
    {
        int S = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] % 2 == 0)
            {
                S += arr[i];
            }
        }
        return S;
    }

    static int cau4(int arr[])
    {
        int count = 0;
        int check;
        for (int i : arr)
        {
            check = 0;
            for (int j : arr)
            {
                if (i == j)
                {
                    check++;
                }
            }
            if (check == 1)
            {
                count++;
            }
        }
        return count;
    }

    static boolean isPrime(int n)
    {
        if (n <= 1) return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
        return true;
    }
    static int cau5(int arr[])
    {
        int count = 0;
        for(int i : arr)
        {
            if (isPrime(i))
            {
                count++;
            }
        }
        return count;
    }

    static int cau6(int arr[], int k)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if (k == arr[i])
            {
                return i;
            }
        }

        return -1;
    }

    static void cau7(int arr[])
    {
        System.out.printf("New array: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.printf("%d ", arr[i]* arr[i]);
        }
    }

    static BigDecimal cau8(BigDecimal arr[])
    {
        BigDecimal max=arr[0];
        int check;
        for (BigDecimal i : arr)
        {
            check = i.compareTo(max);
            if (check == 1)
            {
                max = i;
            }
        }
        return max;
    }

    static int[] cau9(int arr[], int k)
    {
        int j=0;
        for (int i : arr)
        {
            if (i%k == 0)
            {
                j++;
            }
        }
        int[] arr_k = new int[j];
        j=-1;
        for (int i : arr)
        {
            if (i%k == 0)
            {
                j++;
                arr_k[j] = i;
            }
        }
        return arr_k;
    }

    static int cau10(int arr[])
    {
        int fmax = arr[0],smax = arr[0],tmax = arr[0];
        for (int i : arr)
        {
            if (i >= fmax)
            fmax = i;
        }
        for (int i : arr)
        {
            if (i >= smax && i < fmax)
            smax = i;
        }
        for (int i : arr)
        {
            if (i >= tmax && i < smax && i < fmax)
            tmax = i;
        }
        return tmax;
    }

    static void printArr(int arr[])
    {
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[] {2, 4, 5, 3, 1, 6, 12, 9, 11, 11};

        System.out.printf("Cau 1:\n");
        System.out.printf("Max = %d\n", cau1(arr));

        System.out.printf("Cau 2:\n");
        System.out.printf("Min = %d\n", cau2(arr));

        System.out.printf("Cau 3:\n");
        System.out.printf("Sum = %d\n", cau3(arr));

        System.out.printf("Cau 4:\n");
        System.out.printf("Count = %d\n", cau4(arr));

        System.out.printf("Cau 5:\n");
        System.out.printf("Count = %d\n", cau5(arr));

        System.out.printf("Cau 6:\n");
        System.out.printf("Enter k: ");
        int k = sc.nextInt();
        if (cau6(arr, k) == -1)
        {
            System.out.printf("The element doesn't exist in an array!!");
        }
        else
        {
            System.out.printf("Index = %d\n", cau6(arr, k));
        }

        System.out.printf("Cau 7:\n");
        cau7(arr);

        System.out.printf("\nCau 8:\n");
        System.out.printf("Enter the new arr length: ");
        int y = sc.nextInt();
        BigDecimal[] new_arr = new BigDecimal[y];
        System.out.printf("Enter a new arr: \n");
        for(int i = 0; i < y; i++)
        {
            System.out.printf("Arr[%d]: ", i);
            new_arr[i] = sc.nextBigDecimal();
        }
        BigDecimal max = cau8(new_arr);
        System.out.println("Max in arr: " + max);

        System.out.printf("Cau 9:\n");
        System.out.printf("Enter k: ");
        k = sc.nextInt();
        System.out.printf("New arr: ");
        printArr(cau9(arr, k));

        System.out.printf("\nCau 10:\n");
        System.out.printf("The third largest element is %d", cau10(arr));

        sc.close();
    }
}
