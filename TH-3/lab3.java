import java.util.*;

public class lab3
{
    static int findIndex(int[] arr, int n)
    {
        for(int i = 0; i < arr.length; i++)
        {
            if (arr[i] == n)
            {
                return i;
            }
        }
        return -1;
    }
    static int[] removeElement(int[] arr, int n)
    {
        int index = findIndex(arr, n);

        if (index == -1)
        {
            return arr;
        }
        else
        {
            int[] temp = new int[arr.length - 1];
            for(int i = 0, j = 0; i < arr.length; i++)
            {
                if (i != index)
                {
                    temp[j++] = arr[i];
                }
            }
            return temp;
        }
    }

    static String firstAndLastName(String name)
    {
        String[] names = name.split(" ");

        return names[0].concat( names[names.length - 1]).toString();
    }

    static String capitalizeOneWord(String str)
    {
        if(str == null) return str;

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
    static String[] capitalize(String name)
    {
        String[] names = name.split(" ");

        for(int i = 0; i < names.length; i++)
        {
            names[i] = capitalizeOneWord(names[i]);
        }
        return names;
    }

    static void count(String S)
    {
        String[] words = S.split("\\W+");

        String[] temp = new String[words.length];

        int indexTemp = 0;

        int[] n = new int[words.length];
        for(int i = 0; i < n.length; i++)
        {
            n[i] = 0;
        }

        for(int i = 0; i < words.length; i++)
        {
            boolean exist = false;
            for(int j = 0; j < indexTemp; j ++)
            {
                if (words[i].toLowerCase().equals(temp[j]))
                {
                    exist = true;
                    n[j]++;
                    continue;
                }
            }
            if (exist == false)
            {
                temp[indexTemp++] = words[i];
                n[indexTemp++] = 1;
            }
        }
        for(int i = 0; i < indexTemp; i++)
        {
            System.out.println(temp[i]);
        }
    }

    public static void enterArray(int[] arr, int n)
    {
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < n; i++)
        {
            System.out.printf("Arr[%d]: ", i);
            arr[i] = sc.nextInt();
        }

        sc.close();
    }

    static void printArr(int[] arr)
    {
        System.out.printf("Arr: ");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        // String S = "You are living on a Plane. What you style Flatland is the vast level surface of what I may call a fluid, on, or in, the top of which you and your countrymen move about, without rising above it or falling below it.";
        

        sc.close();
    }
}
