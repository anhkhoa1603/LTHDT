public class bla{
    public static int sumNegativeElements(int arr[]){
        int sum = 0;
        for (int x: arr) {
            if (x < 0) {
                sum += x;
            }
        }
        return sum;
    }
    public static String uppercaseFirstVowels(String str){
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            switch (words[i].charAt(0)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1); // nguyen word = N + guyen  // substring(0) = nguyen > NGUYENguyen
                    break;
                default:
                    break;
            }
        }

        String result = "";
        for (int i = 0; i < words.length - 1; i++) {
            result += words[i] + " ";
        }
        return result + words[words.length - 1];
        
    }
    
    public static int findMinNegativeElement(int a[]){
        int min = 0;
        for (int x: a) {
            if (x < 0 && x < min) {
                min = x;
            }
        }
        return min == 0? -1: min;
    }
    
    public static String getName(String str){
        String[] words = str.split(": ");
        return words[1];
    }

    public static int findFirstMod3Element(int[] a){
        for (int x: a) {
            if(x % 3 == 0) {
                return x;
            }
        }
        return -1;
    }

    public static int countString(String str, String k){
        str = str.toUpperCase();
        k = k.toUpperCase();

        String[] words = str.split(" ");
        int count = 0;
        for (String w: words) {
            if (w.equals(k)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        int[] a = {1,-2,3,4,-2,1,-9};
        String s = "nguyen thi uyen an";
        String s1 = "Name: Le Thi Thu Thao";
        String s2 = "Nguyen Thi Oanh Oanh";
        //Test all of methods which you implemented
        System.out.println(sumNegativeElements(a));
        System.out.println(uppercaseFirstVowels(s));
        System.out.println(findMinNegativeElement(a));
        System.out.println(getName(s1));
        System.out.println(findFirstMod3Element(a));
        System.out.println(countString(s2, "oanh"));
    }
}